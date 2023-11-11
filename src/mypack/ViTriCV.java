package mypack;

import java.util.Date;

public class ViTriCV {
    private String maCV;
    private String tenCV;
    private String moTaCV;

    public String getMaCV() {
        return maCV;
    }

    public String getTenCV() {
        return tenCV;
    }

    public String getMoTaCV() {
        return moTaCV;
    }

    public ViTriCV(String maCV, String tenCV, String moTaCV) {
        this.maCV = maCV;
        this.tenCV = tenCV;
        this.moTaCV = moTaCV;
    }
}
