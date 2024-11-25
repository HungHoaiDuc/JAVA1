class DoDienTu extends HangHoa {
    private int thoiGianBaoHanh;

    public DoDienTu(String ten, String maHangHoa, String nhaPhanPhoi, double giaNhap, double giaBan, int thoiGianBaoHanh) {
        super(ten, maHangHoa, nhaPhanPhoi, giaNhap, giaBan);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }
}