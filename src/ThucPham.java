class ThucPham extends HangHoa {
    private String ngaySanXuat;
    private String hanSuDung;

    public ThucPham(String ten, String maHangHoa, String nhaPhanPhoi, double giaNhap, double giaBan,
                    String ngaySanXuat, String hanSuDung) {
        super(ten, maHangHoa, nhaPhanPhoi, giaNhap, giaBan);
        this.ngaySanXuat = ngaySanXuat;
        this.hanSuDung = hanSuDung;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(String hanSuDung) {
        this.hanSuDung = hanSuDung;
    }
}