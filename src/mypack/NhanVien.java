package mypack;

import java.util.Date;

public class NhanVien extends ConNguoi {
    private String maNV;
    private double luong;
    public String getMaNV() {
        return maNV;
    }
    public NhanVien(String maNV, String hoTen, String ngaySinh, String diaChi, String sdt, double luong) {
        super(hoTen,ngaySinh,diaChi,sdt);
        this.maNV = maNV;
        this.luong = luong;
    }
}
