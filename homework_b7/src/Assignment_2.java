
import java.util.ArrayList;
import java.util.Scanner;
import vehicle.Vehicles;
import vehicle.car.Car;
import vehicle.truck.Truck;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hoatd
 */
public class Assignment_2 {

     ArrayList<Vehicles> list;

    public Assignment_2() {
       list= new ArrayList();
    }

    public static int Menu() {
        Scanner sc = new Scanner(System.in);
        int chon;
        System.out.println("Menu : \n"
                + "1. Input \n"
                + "2. Display \n"
                + "3. Sort by price \n"
                + "4. Search by model. \n"
                + "5. Exit \n"
                + "Mời nhập lựa chọn từ 1->5: ");
        chon = sc.nextInt();
        return chon;
    }

    public static int truckOrCar() {
        int chon;
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn loại cần nhập:\n"
                + "1.	Ô tô\n"
                + "2.	Xe tải \n"
                + "Mời chọn 1->2:");
        chon = sc.nextInt();
        return chon;
    }

    public static String contine() {
        String chon;
        Scanner sc = new Scanner(System.in);
        Vehicles v;
        System.out.println("*******************************************\n"
                + "Bạn có muốn tiếp tục hay không [ c (có) || k (không) ]: ");
        chon = sc.nextLine();

        System.out.println("********************************************");
        return chon;
    }

    public static String backToMenu() {
        String chon;
        Scanner sc = new Scanner(System.in);
        Vehicles v;
        System.out.println("*******************************************\n"
                + "Bạn có muốn quay lại Menu chính hay không [ c (có) || k (không) ]: ");
        chon = sc.nextLine();

        System.out.println("********************************************");
        return chon;
    }
   public  void SapXep() {
        Assignment_2 b2 = new Assignment_2();
         Vehicles temp;
        for (int i = 0; i <list.size() - 1; i++) {
           
            for (int j = i+1; j < list.size(); j++) {
                
                if ( list.get(i).price >list.get(j).price) {
                    temp = list.get(i);
                   list.set(i, list.get(j));
                    list.set(j, temp);
                }

            }
        }
   }     
   private int searchByModel(String n)
    {
        for(int i=0;i<list.size(); i++){
            if(list.get(i).model.equalsIgnoreCase(n))
            {
               return i;//trả về vị trí tìm được và kết thúc
            }
        }
        return -1;//nếu trong vòng lặp không có tên cần tìm
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Assignment_2 b2= new Assignment_2();
        int chon;
        int tc;
        Vehicles v;
        String t;
        String bm = null;
        do {
            chon = Menu();
            switch (chon) {
                case 1:
                    do {
                        // chọn loại cần thêm  ô tô hay xe tài
                        tc = truckOrCar();
                        // thêm loại vào Arraylist
                        switch (tc) {
                            case 1:
                                 v = new Car();
                                v.input();
                                b2.list.add(v);
                                System.out.println("Thêm thông tin xe tô tô thành công");
                                t = contine();
                                break;
                            case 2:
                               v = new Truck();
                                v.input();
                                b2.list.add(v);
                                System.out.println("Thêm thông tin xe ô tô tải thành công");
                                t = contine();
                                break;
                            default:
                                System.out.println("Lỗi chọn . Mời chọn lại .");
                                t = contine();
                        }
                    } while (t.equalsIgnoreCase("c"));
                    bm = backToMenu();
                    break;
                case 2:
                    System.out.println("Hiển thị danh sách các sản phẩm ô tô: ");
                    for(int i=0;i<b2.list.size();i++){
               b2.list.get(i).display();
                    }
                    bm=backToMenu();
                    break;
                case 3:
                    System.out.println("Danh Sách sản phẩm trước  khi sắp xếp: ");
                     for(int i=0;i<b2.list.size();i++){
               b2.list.get(i).display();
                    }
                    b2.SapXep();
                    System.out.println("Danh sách sản phẩm  sau khi sắp xếp: ");
                     for(int i=0;i<b2.list.size();i++){
               b2.list.get(i).display();
                    }
                     bm=backToMenu();
                     break;
                case 4 :
                    String s;
                    System.out.println("Xin mời nhập vào mẫu model ô tô hoặc ô tô tải cần tìm: ");
                    s=sc.nextLine();
                  int i=b2.searchByModel(s);
                    
                   if(i>-1){
                       System.out.println("Đã tìm thấy. Thông tin đối tượng: ");
                       b2.list.get(i).display();
                   }
                   else System.out.println("Đéo tìm thấy");
                    bm=backToMenu();
                    break;
                case 5:
                    System.out.println("Xin chào và hẹn gặp lại !");
                    bm="k";
                    break;
                default:
                    System.out.println("Chọn sai mời chọn lại : ");
                    bm="c";
                    
                    
            }
        } while (bm.equalsIgnoreCase("c"));
    }
}
