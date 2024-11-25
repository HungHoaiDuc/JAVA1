import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyHangHoa {
    private List<HangHoa> danhSachHangHoa = new ArrayList<>();
    private List<LichSuNhapHang> lichSuNhapHang = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("\n----- Nhập thêm hàng hóa -----");
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
                    nhapHangHoaThongDung();
                    break;
                case 2:
                    nhapThucPhamDongGoi();
                    break;
                case 3:
                    nhapThucPhamChuaDongGoi();
                    break;
                case 4:
                    nhapDoDienTu();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private HangHoa timHangHoaTheoMa(String maHangHoa) {
        for (HangHoa hangHoa : danhSachHangHoa) {
            if (hangHoa.getMaHangHoa().equals(maHangHoa)) {
                return hangHoa;
            }
        }
        return null;
    }

    private void nhapLichSuNhap(String maHangHoa, double soLuong, double giaNhap) {
        String ngayNhap = java.time.LocalDate.now().toString();
        lichSuNhapHang.add(new LichSuNhapHang(maHangHoa, ngayNhap, soLuong, giaNhap));
    }

    private void nhapHangHoaThongDung() {
        System.out.println("Nhập mã hàng hóa: ");
        String maHangHoa = sc.nextLine();
        HangHoa hangHoa = timHangHoaTheoMa(maHangHoa);

        if (hangHoa == null) {
            System.out.print("Nhập tên hàng hóa: ");
            String ten = sc.nextLine();
            System.out.print("Nhập tên nhà phân phối: ");
            String nhaPhanPhoi = sc.nextLine();
            System.out.print("Nhập giá bán: ");
            double giaNhap = sc.nextDouble();
            System.out.print("Nhập giá bán: ");
            double giaBan = sc.nextDouble();
            System.out.print("Nhập số lượng: ");
            double soLuong = sc.nextDouble();
            sc.nextLine();

            hangHoa = new HangHoa(ten, maHangHoa, nhaPhanPhoi, giaNhap, giaBan);
            danhSachHangHoa.add(hangHoa);

            nhapLichSuNhap(maHangHoa, soLuong, giaNhap);

            System.out.println("Hàng hóa đã được thêm mới!");
        } else {
            System.out.print("Nhập số lượng thêm: ");
            double soLuong = sc.nextDouble();
            sc.nextLine();

            nhapLichSuNhap(maHangHoa, soLuong, hangHoa.getGiaNhap());

            System.out.println("Hàng hóa đã được cập nhật số lượng!");

        }
    }

    private void nhapThucPhamDongGoi() {
        System.out.print("Nhập mã hàng hóa: ");
        String maHangHoa = sc.nextLine();
        HangHoa hangHoa = timHangHoaTheoMa(maHangHoa);

        if (hangHoa == null) {
            System.out.print("Nhập tên thực phẩm: ");
            String ten = sc.nextLine();
            System.out.print("Nhập nhà phân phối: ");
            String nhaPhanPhoi = sc.nextLine();
            System.out.print("Nhập giá nhập: ");
            double giaNhap = sc.nextDouble();
            System.out.print("Nhập giá bán: ");
            double giaBan = sc.nextDouble();
            sc.nextLine();
            System.out.print("Nhập ngày sản xuất: ");
            String ngaySanXuat = sc.nextLine();
            System.out.print("Nhập hạn sử dụng: ");
            String hanSuDung = sc.nextLine();
            System.out.print("Nhập khối lượng đóng gói: ");
            double khoiLuongDongGoi = sc.nextDouble();
            sc.nextLine();
            System.out.print("Nhập quy cách đóng gói (gói/hộp/lọ/chai): ");
            String quyCachDongGoi = sc.nextLine();

            hangHoa = new ThucPhamDongGoi(ten, maHangHoa, nhaPhanPhoi, giaNhap, giaBan, ngaySanXuat, hanSuDung, khoiLuongDongGoi, quyCachDongGoi);
            danhSachHangHoa.add(hangHoa);

            nhapLichSuNhap(maHangHoa, 1, giaNhap);

            System.out.println("Thực phẩm đóng gói đã được thêm mới!");
        } else {
            System.out.print("Nhập số lượng thêm: ");
            double soLuong = sc.nextDouble();
            sc.nextLine();

            nhapLichSuNhap(maHangHoa, soLuong, hangHoa.getGiaNhap());

            System.out.println("Thực phẩm đóng gói đã được cập nhật số lượng!");
        }
    }

    private void nhapThucPhamChuaDongGoi() {
        System.out.print("Nhập mã hàng hóa: ");
        String maHangHoa = sc.nextLine();
        HangHoa hangHoa = timHangHoaTheoMa(maHangHoa);

        if (hangHoa == null) {
            System.out.print("Nhập tên thực phẩm: ");
            String ten = sc.nextLine();
            System.out.print("Nhập nhà phân phối: ");
            String nhaPhanPhoi = sc.nextLine();
            System.out.print("Nhập giá nhập: ");
            double giaNhap = sc.nextDouble();
            System.out.print("Nhập giá bán: ");
            double giaBan = sc.nextDouble();
            sc.nextLine();
            System.out.print("Nhập ngày sản xuất: ");
            String ngaySanXuat = sc.nextLine();
            System.out.print("Nhập hạn sử dụng: ");
            String hanSuDung = sc.nextLine();
            System.out.print("Nhập khối lượng tính tiền (kg): ");
            double khoiLuongTinhTien = sc.nextDouble();
            sc.nextLine();

            hangHoa = new ThucPhamChuaDongGoi(ten, maHangHoa, nhaPhanPhoi, giaNhap, giaBan, ngaySanXuat, hanSuDung, khoiLuongTinhTien);
            danhSachHangHoa.add(hangHoa);

            nhapLichSuNhap(maHangHoa, khoiLuongTinhTien, giaNhap);

            System.out.println("Thực phẩm chưa đóng gói đã được thêm mới!");
        } else {
            System.out.print("Nhập khối lượng thêm (kg): ");
            double khoiLuongThem = sc.nextDouble();
            sc.nextLine();

            nhapLichSuNhap(maHangHoa, khoiLuongThem, hangHoa.getGiaNhap());

            System.out.println("Thực phẩm chưa đóng gói đã được cập nhật khối lượng!");
        }
    }

    private void nhapDoDienTu() {
        System.out.print("Nhập mã hàng hóa: ");
        String maHangHoa = sc.nextLine();
        HangHoa hangHoa = timHangHoaTheoMa(maHangHoa);

        if (hangHoa == null) {
            System.out.print("Nhập tên đồ điện tử: ");
            String ten = sc.nextLine();
            System.out.print("Nhập nhà phân phối: ");
            String nhaPhanPhoi = sc.nextLine();
            System.out.print("Nhập giá nhập: ");
            double giaNhap = sc.nextDouble();
            System.out.print("Nhập giá bán: ");
            double giaBan = sc.nextDouble();
            sc.nextLine();
            System.out.print("Nhập thời gian bảo hành (tháng): ");
            int thoiGianBaoHanh = sc.nextInt();
            sc.nextLine();

            hangHoa = new DoDienTu(ten, maHangHoa, nhaPhanPhoi, giaNhap, giaBan, thoiGianBaoHanh);
            danhSachHangHoa.add(hangHoa);

            nhapLichSuNhap(maHangHoa, 1, giaNhap);
            System.out.println("Đồ điện tử đã được thêm mới!");
        } else {
            System.out.print("Nhập số lượng thêm: ");
            double soLuong = sc.nextDouble();
            sc.nextLine();
            nhapLichSuNhap(maHangHoa, soLuong, hangHoa.getGiaNhap());
            System.out.println("Đồ điện tử đã được cập nhật số lượng!");
        }
    }

}
