class ThucPhamDongGoi extends ThucPham {
    private double khoiLuongDongGoi;
    private String quyCachDongGoi;

    public ThucPhamDongGoi(String ten, String maHangHoa, String nhaPhanPhoi, double giaNhap, double giaBan,
                           String ngaySanXuat, String hanSuDung, double khoiLuongDongGoi, String quyCachDongGoi) {
        super(ten, maHangHoa, nhaPhanPhoi, giaNhap, giaBan, ngaySanXuat, hanSuDung);
        this.khoiLuongDongGoi = khoiLuongDongGoi;
        this.quyCachDongGoi = quyCachDongGoi;
    }

    public double getKhoiLuongDongGoi() {
        return khoiLuongDongGoi;
    }

    public void setKhoiLuongDongGoi(double khoiLuongDongGoi) {
        this.khoiLuongDongGoi = khoiLuongDongGoi;
    }

    public String getQuyCachDongGoi() {
        return quyCachDongGoi;
    }

    public void setQuyCachDongGoi(String quyCachDongGoi) {
        this.quyCachDongGoi = quyCachDongGoi;
    }
}