package mypack;

import java.util.Date;

public class LichChieu {
    public Phim lc_phim;
    public Phong lc_phong;
    private String thoiGianChieu;
    public String getThoiGianChieu(){return thoiGianChieu;}

    public LichChieu(Phim lc_phim, Phong lc_phong, String thoiGianChieu) {
        this.lc_phim = lc_phim;
        this.lc_phong = lc_phong;
        this.thoiGianChieu = thoiGianChieu;
    }
}
