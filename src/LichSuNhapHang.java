class LichSuNhapHang {
    private String maHangHoa;
    private String ngayNhap;
    private double soLuong; // số lượng hoặc khối lượng
    private double giaNhap;

    public LichSuNhapHang(String maHangHoa, String ngayNhap, double soLuong, double giaNhap) {
        this.maHangHoa = maHangHoa;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
    }

    @Override
    public String toString() {
        return "Mã hàng hóa: " + maHangHoa +
                ", Ngày nhập: " + ngayNhap +
                ", Số lượng: " + soLuong +
                ", Giá nhập: " + giaNhap;
    }
}
