package mypack;

import java.util.Date;

public class KhanGia extends ConNguoi {
    private String maKG;
    public TepKH kg_tepkh;

    public String getMaKG() {
        return maKG;
    }

    public KhanGia(String maKG, String hoTen, String ngaySinh, String diaChi, String sdt, TepKH kg_tepkh){
        super(hoTen,ngaySinh,diaChi,sdt);
        this.maKG = maKG;
        this.kg_tepkh = kg_tepkh;
    }
}
