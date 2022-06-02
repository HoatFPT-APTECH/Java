/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
import Models.Zoo;
import java.util.Scanner;

public class Assingment_3 {

    public static boolean isStringEmpty(String input) {
        return (input == null || input.trim().length() == 0);
    }

    public static int quayLai() {
        Scanner sc = new Scanner(System.in);
        int c;
        System.out.println("");
        System.out.println("***************************************");
        System.out.println("4. Back\n5. Exit program.");
        System.out.println("***************************************");
        c = sc.nextInt();

        return c;
    }

    public static void main(String[] args) {
        Zoo z = new Zoo();
        Scanner sc = new Scanner(System.in);
        String add;
        int c;
        String nameRemove;
        do {
              System.out.println("Menu: \n 1.Add animal \n 2. Show Animal in the zoo \n 3.Remove Animal \n. Input :");
        c = sc.nextInt();
            switch (c) {
                case 1:
                    do {

                      add= z.addZoo();

                    } while (isStringEmpty(add) == false);
                    c = quayLai();
                    break;
                case 2:
                    z.sayHello();
                    c = quayLai();
                    break;
                case 3:
                    
                    System.out.println("Nhập con thú cần xoá : ");
                    nameRemove=sc.next();
                    
                    z.remove(nameRemove);
                    c=quayLai();
                    break;
                case 5:
                    System.out.println("GoodBye.");

                    break;
                default:
                    System.out.println("Bạn chọn sai rồi");
                    System.out.println("Chọn lại đi:");
                   
            }
        } while (c!=5);

    }
}
