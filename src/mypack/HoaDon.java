package mypack;

import java.util.Date;

public class HoaDon {
    private String maHD;
    private String ngayHD;
    private double soTienTra;
    private String tenPhimXem;
    private double gioChieu;
    private String viTriGhe;
    public KhanGia hd_kg;

    public String getMaHD() {
        return maHD;
    }

    public String getNgayHD() {
        return ngayHD;
    }

    public double getSoTienTra() {
        return soTienTra;
    }

    public String getTenPhimXem() {
        return tenPhimXem;
    }

    public double getGioChieu() {
        return gioChieu;
    }

    public String getViTriGhe() {
        return viTriGhe;
    }

    public HoaDon(String maHD, String ngayHD, double soTienTra, String tenPhimXem, double gioChieu, String viTriGhe, KhanGia hd_kg) {
        this.maHD = maHD;
        this.ngayHD = ngayHD;
        this.soTienTra = soTienTra;
        this.tenPhimXem = tenPhimXem;
        this.gioChieu = gioChieu;
        this.viTriGhe = viTriGhe;
        this.hd_kg = hd_kg;
    }
}
