class HangHoa {
    private String ten;
    private String maHangHoa;
    private String nhaPhanPhoi;
    private double giaNhap;
    private double giaBan;

    // Constructor
    public HangHoa(String ten, String maHangHoa, String nhaPhanPhoi, double giaNhap, double giaBan) {
        this.ten = ten;
        this.maHangHoa = maHangHoa;
        this.nhaPhanPhoi = nhaPhanPhoi;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    // Getter và Setter
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaHangHoa() {
        return maHangHoa;
    }

    public void setMaHangHoa(String maHangHoa) {
        this.maHangHoa = maHangHoa;
    }

    public String getNhaPhanPhoi() {
        return nhaPhanPhoi;
    }

    public void setNhaPhanPhoi(String nhaPhanPhoi) {
        this.nhaPhanPhoi = nhaPhanPhoi;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
}