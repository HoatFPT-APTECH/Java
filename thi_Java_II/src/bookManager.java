
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
public class bookManager {
    ArrayList<clsBook> list;

    public bookManager() {
        this.list= new ArrayList();
        
    }
    public void load(){
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        try {
             fis= new FileInputStream("books.dat");
          ois= new ObjectInputStream(fis);
            int n=ois.readInt();
            
            for(int i=0;i<n;i++){
                
               clsBook b= (clsBook)ois.readObject();
                this.list.add(b);
            }
            System.out.println("Tải dữ liệu thành công");
        }catch(EOFException ex){
            System.out.println("Kết thúc tệp.");
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(bookManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(bookManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(bookManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(ois!=null)try {
            ois.close();
        } catch (IOException ex) {
            Logger.getLogger(bookManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(fis!=null)try {
            fis.close();
        } catch (IOException ex) {
            Logger.getLogger(bookManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void save(){
      
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
            fos= new FileOutputStream("books.dat",true);
            oos= new ObjectOutputStream(fos);
            int n= list.size();
           oos.writeInt(n);
           
           for(int i=0;i<n;i++){
               clsBook b;
               b= list.get(i);
               oos.writeObject(b);
           }
             list.clear();
             System.out.println("Ghi tệp thành công");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(bookManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(bookManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(oos!=null)try {
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(bookManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(fos!=null)try {
            fos.close();
        } catch (IOException ex) {
            Logger.getLogger(bookManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void add(){
        String BookID,BookTitle,Author;
        int Price;
        clsBook b= new clsBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID cho sách: ");
        b.setBookID(sc.nextLine());
        System.out.println("Nhập tên Sách: ");
        b.setBookTitle(sc.nextLine());
        System.out.println("Nhập tên tác giả: ");
      b.setAuthor(sc.nextLine());
        System.out.println("Nhập giá cho quyển sách:");
        b.setPrice(sc.nextInt());
        
    
        
        this.list.add(b);
    }
    public void display(){
        this.list.clear();
        load();
     
        int n= this.list.size();
        for(clsBook e: list){
            System.out.printf("%9s"+e.BookID);
            System.out.printf("%25s"+e.BookTitle);
            System.out.println("%15s"+e.Author);
            System.out.printf("%10d"+e.Price);
            
                    
        }
    }
}
