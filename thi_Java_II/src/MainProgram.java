
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
public class MainProgram {

    public MainProgram() {
    }
    
    public int Menu(){
        Scanner sc= new Scanner(System.in);
        int choose;
        System.out.println("menu: \n" +
"o 1. Add book records \n" +
"o 2. Save \n" +
"o 3. Display book records \n" +
"o 4. Exit ");
        choose= sc.nextInt();
        return choose;
    }
    public static void main(String[] args) {
        MainProgram pro=new MainProgram();
        bookManager m= new bookManager();
        int chon;
        do{
            chon= pro.Menu();
        switch(chon){
            case 1:
                System.out.println("Chức năng 1: ");
                m.add();break;
            case 2: 
                System.out.println("Chức năng 2: ");
                m.save();
                
                break;
            case 3:
                System.out.println("Chức năng 3: ");
                m.display();
                break;
            case 4:
                System.out.println("Xin chào và hẹn gặp lại:");
            default:
                System.out.println("Mời chọn lại từ 1-> 4: ");
        }
        }while(chon!=4)  ;  
        }
    }

