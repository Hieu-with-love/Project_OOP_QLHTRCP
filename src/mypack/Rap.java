package mypack;

public class Rap {
    private String maRap;
    private String hoTen;
    private String diaChi;
    private int soPhong;
    private int sucChua;
    public NhanVien nv_quanLy;

    public String getMaRap() {
        return maRap;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getSoPhong() {
        return soPhong;
    }

    public int getSucChua() {
        return sucChua;
    }

    public Rap(String maRap, String hoTen, String diaChi, int soPhong, int sucChua, NhanVien nv_quanLy) {
        this.maRap = maRap;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soPhong = soPhong;
        this.sucChua = sucChua;
        this.nv_quanLy = nv_quanLy;
    }
}
