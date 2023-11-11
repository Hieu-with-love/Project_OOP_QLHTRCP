package mypack;

import java.util.Date;

public class DoiTac extends ConNguoi{
    private String maDT;

    public String getMaDT() {
        return maDT;
    }

    public DoiTac(String maDT, String hoTen, String ngaySinh, String diaChi, String sdt) {
        super(hoTen, ngaySinh, diaChi, sdt);
        this.maDT = maDT;
    }
}
