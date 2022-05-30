
import java.util.ArrayList;
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
public class Bai1 {

    public static boolean isStringEmpty(String string) {
        return string == null || string.trim().length() == 0;
    }

    public static void main(String[] args) {
        ArrayList  hm = new ArrayList();
        Scanner sc = new Scanner(System.in);
        // lay chuoi nhap vao

        String stp;

        System.out.println("Nhập vào các chuỗi, nhập chuỗi trống để kết thúc: ");

        do {
            stp = sc.nextLine();
            String[] words = stp.split(" ");

            for (String element : words) {

                hm.add(element);
            }
        } while (isStringEmpty(stp) == false);
        // dem tu trung nhau 
        System.out.println("Kết quả kiểm tra số lượng từ :");
        ArrayList dskt= new ArrayList();
        for (int i = 0; i < hm.size(); i++) {
            
            Object valueCheck = hm.get(i);
            if(dskt.contains(valueCheck)){
                continue;
            }
            int count =0;
            int flag=0;
            //buoc kiem tra
            for (int k = 0; k<hm.size(); k++) {
                if (valueCheck.equals(hm.get(k))) {
                    count++;
                    dskt.add(valueCheck);
                }
            }
            System.out.println(valueCheck + " :"+count);
        }
        System.out.println("Tổng số từ :" + hm.size());
     

    }
}
