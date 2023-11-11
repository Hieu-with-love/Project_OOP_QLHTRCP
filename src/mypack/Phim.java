package mypack;

public class Phim {
    private String maPhim;
    private String tenPhim;
    private String theLoai;
    private String tenDaoDien;
    private String tenDienVien;
    private double thoiLuong;

    public String getMaPhim() {
        return maPhim;
    }
    public String getTenPhim(){
        return tenPhim;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public String getTenDaoDien() {
        return tenDaoDien;
    }

    public String getTenDienVien() {
        return tenDienVien;
    }

    public double getThoiLuong() {
        return thoiLuong;
    }
    public Phim(String maP, String tenP, String theL, String tenDD, String tenDV, double thoiL){
        this.maPhim = maP;
        this.tenPhim = tenP;
        this.tenDaoDien = tenDD;
        this.tenDienVien = tenDV;
        this.thoiLuong = thoiL;
        this.theLoai = theL;
    }
}
