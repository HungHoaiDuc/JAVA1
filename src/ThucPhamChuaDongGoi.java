class ThucPhamChuaDongGoi extends ThucPham {
    private double khoiLuongTinhTien;

    public ThucPhamChuaDongGoi(String ten, String maHangHoa, String nhaPhanPhoi, double giaNhap, double giaBan,
                               String ngaySanXuat, String hanSuDung, double khoiLuongTinhTien) {
        super(ten, maHangHoa, nhaPhanPhoi, giaNhap, giaBan, ngaySanXuat, hanSuDung);
        this.khoiLuongTinhTien = khoiLuongTinhTien;
    }

    public double getKhoiLuongTinhTien() {
        return khoiLuongTinhTien;
    }

    public void setKhoiLuongTinhTien(double khoiLuongTinhTien) {
        this.khoiLuongTinhTien = khoiLuongTinhTien;
    }
}