package mypack;

import java.util.Arrays;
import java.util.List;

public class KhaNang {
    public NhanVien khaNang_nhanNien;
    public List<ViTriCV> khaNang_congViec;
    private int capDo;
    public int getCapDo(){
        return capDo;
    }

    public KhaNang(NhanVien khaNang_nhanNien, List<ViTriCV> khaNang_congViec, int capDo) {
        this.khaNang_nhanNien = khaNang_nhanNien;
        this.khaNang_congViec = khaNang_congViec;
        this.capDo = capDo;
    }
}
