package mypack;

public class ChiTietNguoiXem {
    public Phim chiTiet_phim;
    public KhanGia chiTiet_khanGia;
    private boolean trangThai; // 1: vui, 0: buon

    public boolean getTrangThai() {
        return trangThai;
    }

    public ChiTietNguoiXem(Phim chiTiet_phim, KhanGia chiTiet_khanGia, boolean trangThai) {
        this.chiTiet_phim = chiTiet_phim;
        this.chiTiet_khanGia = chiTiet_khanGia;
        this.trangThai = trangThai;
    }
}
