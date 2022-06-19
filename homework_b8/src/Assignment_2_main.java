
import Assignment_2.A_grade;
import Assignment_2.B_grade;
import Assignment_2.C_grade;
import Assignment_2.Generate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hoatd
 */
public class Assignment_2_main {

    HashMap<String, Generate> list;

    public Assignment_2_main() {
        list = new HashMap();
    }

    public int Menu() {
        int chon;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu\n "
                + "1.Thêm mới thí sinh.\n"
                + "2.Hiện thị thông tin của thí sinh và khối thi của thí sinh.\n"
                + "3.Tìm kiếm theo số báo danh.\n"
                + "4.Thoát khỏi chương trình.\n"
                + "Mời nhập lựa chọn từ 1-3: ");
        chon = sc.nextInt();
        return chon;
    }
    public int chooseGrade(){
          int chon;
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn khối:\n"
                + "1.Khối A\n"
                + "2.Khối B\n"
                + "3.Khối C\n"
                + "Mời nhập lựa chọn 1-3:");
    
        chon = sc.nextInt();
        return chon;
    }
    public boolean searchBySBD(String SBD){
        if(this.list.containsKey(SBD)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Assignment_2_main b2= new Assignment_2_main();
        Generate g;
        int chon;
        do{
           chon=b2.Menu();
           switch(chon){
               case 1:
                   //chọn khối để thêm
                   int c;
                   do{
                   c=b2.chooseGrade();
                   switch(c){
                       case 1:
                           g=new A_grade();
                           g.add();
                           b2.list.put(g.sbd, g);
                           System.out.println("Thêm thông tin thí sinh thành công.");
                           break;
                       case 2:
                              g=new B_grade();
                           g.add();
                           b2.list.put(g.sbd, g);
                           System.out.println("Thêm thông tin thí sinh thành công.");
                           break;
                       case 3:
                              g=new C_grade();
                           g.add();
                           b2.list.put(g.sbd, g);
                           System.out.println("Thêm thông tin thí sinh thành công.");
                           break;
                       default:
                           System.out.println("Chọn sai mởi chọn lại.");
                           c=8;
                   }
                   }while(chon!=1&&chon!=2&&chon!=3);
                
                   break;
               case 2:
                   Set<String> listKey=b2.list.keySet();
                 for(String key:listKey){
                    b2.list.get(key).display();
                 }
                  break;
               case 3:
                   String SBD;
                   System.out.println("Nhập vào số báo danh cần tìm kiếm của thí sính: ");
                   SBD=sc.nextLine();
                   if(b2.searchBySBD(SBD)){
                       System.out.println("Đã tìm thấy thông tin thí sinh: ");
                       b2.list.get(SBD).display();
                   }
                   else System.out.println("Không tồn tại sinh viên có mã số báo danh như trên.");
                   break;
               case 4:
                   System.out.println("Xin chào và hẹn gặp lại.");
                   chon=4;
                   break;
               default:
                   System.out.println("Chọn sai mời chọn lại");
                   chon=9;
                           
                   
           }
            
        }while(chon!=4);
    }
}

