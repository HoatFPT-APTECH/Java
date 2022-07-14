/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Models.Student;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoatd
 */
public class Program {

    static FileOutputStream fos = null;
     static ObjectOutputStream oos = null;
  
    ArrayList<Student> list;

    public Program() {
       
        
        list= new ArrayList<Student>();
    }

    public void Add(String id, String firstName, String lastName, int age) {
        Student sv= new Student(id,firstName,lastName,age);
        
     list.add(sv);
     
    }

    public void Save() {
        // them arraylist vao file dat
             FileOutputStream fos = null;
      ObjectOutputStream oos = null;
        try {
            fos= new FileOutputStream("F:\\FPT_APTECH\\Ki_2\\Java\\HomeWork\\Java\\Test_Exam_Java_II\\Students.dat");
            oos= new ObjectOutputStream(fos);
            oos.writeInt(list.size());
            for(int i=0;i<list.size();i++){
                oos.writeObject(list.get(i));
            }
             
                    } catch (FileNotFoundException ex) {
            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try{
               oos.close();
               fos.close();
            }catch(Exception ex){
                System.out.println("Lỗi ngoại lệ");
            }
                    
        }
        list.clear();
        System.out.println("Lưu dữ liệu thành công");
        
      
    }

    public int Menu() {
        int chon;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu.\n"
                + "1.	Add new student\n"
                + "2.	Save\n"
                + "3.	Display All Students\n"
                + "4.	Exit.\n"
                + "Mời nhập lựa chọn từ (1->4) :");
        chon = sc.nextInt();
        return chon;
    }
    public void load(){
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        
        try {
            fis= new FileInputStream("F:\\FPT_APTECH\\Ki_2\\Java\\HomeWork\\Java\\Test_Exam_Java_II\\Students.dat");
            ois= new ObjectInputStream(fis);
            int n= ois.readInt();
            list.clear();
           for(int i=0;i<n;i++ ){
               Student sv= (Student )ois.readObject();
               list.add(sv);
           }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(fis!=null)try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(ois!=null)try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                
    }
    

    public void Display() {
    
         load();
               System.out.println("Display all students");
        System.out.println("  EnrollID            Fullname           Age");
        System.out.println("------------    --------------------    -----");
          for(Student student : list)
        {
            System.out.printf("%9s    ", student.getEnrolID());
            System.out.printf("%10s %.7s", student.getFirstName(),student.getLastName());
            System.out.printf("%10d\n", student.getAge());
        }
       
    }
    public int  Back(){
        int chon;
        Scanner sc= new Scanner(System.in);
        System.out.println("Chọn: \n 4.Thoát \n 5.Quay lại Menu");
        chon=sc.nextInt();
        return chon;
    }
    
    public static void main(String[] args) {
        Program pro = new Program();
        Scanner sc= new Scanner(System.in);
        int chon;
        do{
         chon = pro.Menu();
        switch (chon) {
            case 1:
                String EnrolID,
                 FirstName,
                 LastName;
                int Age;
                System.out.println("Nhập thông tin Sinh viên cần tạo");
   
                 System.out.println("Nhập ID :");
                 EnrolID=sc.nextLine();
                 System.out.println("Nhập Tên Đầu tiên của Sinh Viên:");
                 FirstName=sc.nextLine();
                 System.out.println("Nhập cuối tên của sinh viên: ");
                 LastName=sc.nextLine();
                 System.out.println("Nhập tuổi của sinh viên: ");
                 Age= sc.nextInt();
                 sc.nextLine();
                 pro.Add(EnrolID, FirstName, LastName, Age);
                 System.out.println("Thêm thành công sinh viên");
                 chon=pro.Back();
                 break;
            case 2:
                pro.Save(); chon=pro.Back();
                break;
            case 3: 
                pro.Display();chon=pro.Back(); break;
            case 4: 
                
        
                System.out.println(" Xin chao va hen gap lai");
                break;
            default:
                System.out.println("Mời chọn từ 1->4: ");
                chon=4;
        }
        }while(chon!=4);
    }
}
