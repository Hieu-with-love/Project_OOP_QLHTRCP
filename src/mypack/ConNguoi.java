package mypack;

import java.util.Date;

public class ConNguoi {
    protected String hoTen;
    protected String ngaySinh;
    protected String diaChi;
    protected String sdt;

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public ConNguoi(String hoTen, String ngaySinh, String diaChi, String sdt) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }
}
