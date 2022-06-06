
import Models.Laborer;
import Models.Manager;
import Models.Scientist;
import java.util.ArrayList;
import Models.Employee;
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
public class Assingment_1 {

   public static  ArrayList<Employee> list;

    public Assingment_1() {
     
    }

    public static int Menu() {
        Scanner sc = new Scanner(System.in);
        int c;
        System.out.println("Menu : Thêm Nhân viên:\n"
                + "1.	Thêm nhân viên\n"
                + "2.	Hiển thị danh sách nhân viên và lương\n"
                + "3.	Sắp xếp lương\n"
                + "4.	Thoát\n"
                + "Chọn từ (1-4):");
        c = sc.nextInt();
        return c;
    }

    public static int ThemNV() {
        int chon;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn thêm nhân viên loại nào:\n"
                + "1.	Thêm Quản lý\n"
                + "2.	Thêm nhà khoa học\n"
                + "3.	Thêm nhân viên phòng thí nghiệm.\n"
                + "Mời chọn 1->3:");
        chon = sc.nextInt();
        return chon;
    }

    public void SapXep() {
        Assingment_1 b1 = new Assingment_1();
        for (int i = 0; i < b1.list.size() - 1; i++) {
            for (int j = i + 1; j < b1.list.size(); j++) {
                Employee temp;
                if (b1.list.get(i).totalPay > b1.list.get(j).totalPay) {
                    temp = b1.list.get(i);
                    b1.list.set(i, b1.list.get(j));
                    b1.list.set(j, temp);
                }

            }
        }
        
    }

    public static void main(String[] args) {
        Assingment_1 b1 = new Assingment_1();
        b1.list = new ArrayList<Employee>();
        Employee nv;
        int chon;
        do {
            chon = Menu();
            switch (chon) {
                case 1:
                    int addNV = ThemNV();
                    switch (addNV) {
                        case 1:
                            nv = new Manager();
                            nv.Nhap();
                            b1.list.add(nv);
                            System.out.println("Đã thêm đối tượng thành công");
                            chon = 8;
                            break;
                        case 2:
                            nv = new Scientist();
                            nv.Nhap();
                            b1.list.add(nv);
                            System.out.println("Đã thêm đối tượng thành công");
                            chon = 8;
                            break;
                        case 3:
                            nv = new Laborer();
                            nv.Nhap();
                            b1.list.add(nv);
                            System.out.println("Đã thêm đối tượng thành công");
                            chon = 8;
                            break;
                        default:
                            System.out.println("Bạn chọn sai lựa chọn . Bạn sẽ được đưa về menu chính");
                    };
                    break;
                case 2:
                    System.out.println("Danh sách Nhân viên và lương của họ");
                    for (int i = 0; i < b1.list.size(); i++) {
                        b1.list.get(i).display();
                    }

                    chon = 8;
                    break;
                case 3:
                       b1.SapXep();
                    for (int i = 0; i < b1.list.size(); i++) {
                        b1.list.get(i).display();
                    }
                    chon = 8;
                    break;
                case 4:
                    System.out.println("Bạn Đã thoát chương trình hẹn gặp lại bạn sau ");
                    chon = 7;
                    break;

            }
        } while (chon == 8);

    }
}
