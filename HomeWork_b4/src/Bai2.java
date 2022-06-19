
import Models.Dictionary;
import java.util.HashMap;
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
public class Bai2 {

    public static boolean isStringEmpty(String string) {
        return string == null || string.trim().length() == 0;
    }

    public static int menu() {
        int chon;
        Scanner sc = new Scanner(System.in);
        System.out.print("Từ điển Anh - Việt\n"
                + "1. Thêm từ mới (nhập từ bàn phím, nếu từ tiếng Anh đã có thì báo lỗi)\n"
                + "2. Hiển thị toàn bộ \n"
                + "3. Tra từ (Nhập từ tiếng Anh, hiện tiếng Việt tương ứng)\n"
                + "4. Sửa từ  (Nhập từ từ tiếng Anh và từ tiếng Việt mới tương ứng, nếu từ Tiếng anh đã có thì sửa từ Tiếng Việt mới tương ứng, nếu không có thì báo lỗi)\n"
                + "5. Xóa từ (Nhập từ tiếng Anh, nếu đã có thì xóa)\n"
                + "6. Thoát\n"
                + "Mời bạn chọn(1-6)\n");
        chon = sc.nextInt();
        return chon;
    }

    public static void gianCach() {
        System.out.println("");
        System.out.println("************************************************************************************");
    }

    public static int chonLai() {
        int chon;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhấn số bất kỳ để chọn lại: \n"
                + "Nhấn phím 6 để thoát chương trình");
        chon = sc.nextInt();
        gianCach();
        return chon;
    }

    public static void main(String[] args) {
        Dictionary td = new Dictionary();
        Scanner sc = new Scanner(System.in);
        String eng, viet = null;
        int chon;
        do {
            chon = menu();
            switch (chon) {
                case 1:// them tu
                    for (;;) {
                        System.out.println("Bắt đầu thêm từ , Nhập từ tiếng Anh Trống để kết thúc thêm từ :");
                        System.out.println("Nhập từ Tiếng Anh cần thêm :");
                        eng = sc.nextLine();
                        if (eng.trim().length() == 0) {
                            td.themTu(eng, viet);
                            break;
                        }
                        System.out.println("Nhập nghĩa Tiếng Việt :");
                        viet = sc.nextLine();
                        td.themTu(eng, viet);
                    }

                    break;
                case 2:// hien thi tu
                    System.out.println("Danh Sách từ có trong từ điển :");
                    td.hienThi();

                    break;
                case 3:// tra tu
                    System.out.println("Nhập từ cần tra :");
                    eng = sc.nextLine();
                    td.traTu(eng);

                    break;
                case 4: // sua tu
                    System.out.println("Nhập từ Tiếng Anh  và nghĩa Tiếng Việt cần sửa :");
                    System.out.println("Tiếng Anh :");
                    eng = sc.nextLine();
                    System.out.println("Tiếng Việt");
                    viet = sc.nextLine();
                    td.suaTu(eng, viet);

                    break;
                case 5: // xoa tu
                    System.out.println("Nhập từ tiếng Anh cần xoá : ");
                    eng = sc.nextLine();
                    td.xoaTu(eng);

                    break;
                case 6:// Thoát chương trình
                    System.out.println("Chương trình đã kết thúc.\n Hẹn gặp lại");
                    break;
                default:
                    System.out.println("Nhập sai mời nhập lại lựa chọn");
                    chon = 0;

            }
            gianCach();
            chon=chonLai();
            if(chon==6){
                System.out.println("Chương trình đã kết thúc");
            }
            else{
                System.out.println("Quay lại chương trình thành công");
            }
        } while (chon != 6);

    }
}
