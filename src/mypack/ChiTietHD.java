package mypack;

import java.util.Date;

public class ChiTietHD {
    public DoiTac chiTiet_doiTac;
    public HopDong chiTiet_hopDong;
    private double soTienDong;
    private String ngayDong;

    public double getSoTienDong() {
        return soTienDong;
    }

    public String getNgayDong() {
        return ngayDong;
    }

    public ChiTietHD(HopDong chiTiet_hopDong, DoiTac chiTiet_doiTac, double soTienDong, String ngayDong) {
        this.chiTiet_doiTac = chiTiet_doiTac;
        this.chiTiet_hopDong = chiTiet_hopDong;
        this.soTienDong = soTienDong;
        this.ngayDong = ngayDong;
    }
}
