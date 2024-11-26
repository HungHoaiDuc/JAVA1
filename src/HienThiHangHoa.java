import java.util.List;
import java.util.Scanner;

public class HienThiHangHoa {

    private List<HangHoa> danhSachHangHoa;

    public HienThiHangHoa(List<HangHoa> danhSachHangHoa) {
        this.danhSachHangHoa = danhSachHangHoa;
    }

    public void menu() {
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("1. Hàng hóa thông dụng");
            System.out.println("2. Thực phẩm đóng gói");
            System.out.println("3. Thực phẩm chưa đóng gói");
            System.out.println("4. Đồ dùng điện tử");
            System.out.println("5. Quay lại");
            System.out.print("Chọn loại hàng hóa: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    hangHoaThongDung();
                    break;
                case 2:
                    thucPhamDongGoi();
                    break;
                case 3:
                    thucPhamChuaDongGoi();
                    break;
                case 4:
                    doDungDienTu();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private void hangHoaThongDung() {
        System.out.println("Danh sách hàng hóa thông dụng:");
        for (HangHoa hangHoa : danhSachHangHoa) {
            if (hangHoa instanceof ThucPham) {
                System.out.println(hangHoa);
            }
        }
    }

    private void thucPhamDongGoi() {
        System.out.println("Danh sách thực phẩm đóng gói:");
        for (HangHoa hangHoa : danhSachHangHoa) {
            if (hangHoa instanceof ThucPhamDongGoi) {
                System.out.println(hangHoa);
            }
        }
    }

    private void thucPhamChuaDongGoi() {
        System.out.println("Danh sách thực phẩm chưa đóng gói:");
        for (HangHoa hangHoa : danhSachHangHoa) {
            if (hangHoa instanceof ThucPhamChuaDongGoi) {
                System.out.println(hangHoa);
            }
        }
    }

    private void doDungDienTu() {
        System.out.println("Danh sách đồ dùng điện tử:");
        for (HangHoa hangHoa : danhSachHangHoa) {
            if (hangHoa instanceof DoDienTu) {
                System.out.println(hangHoa);
            }
        }
    }
}
