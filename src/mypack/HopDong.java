package mypack;

import java.util.Date;

public class HopDong {
    private String maHD;
    private String tenHD;
    private String ngayHD;
    private double triGiaHD;

    public String getMaHD() {
        return maHD;
    }

    public String getTenHD() {
        return tenHD;
    }

    public String getNgayHD() {
        return ngayHD;
    }

    public double getTriGiaHD() {
        return triGiaHD;
    }

    public HopDong(String maHD, String tenHD, String ngayHD, double triGiaHD) {
        this.maHD = maHD;
        this.tenHD = tenHD;
        this.ngayHD = ngayHD;
        this.triGiaHD = triGiaHD;
    }
}
