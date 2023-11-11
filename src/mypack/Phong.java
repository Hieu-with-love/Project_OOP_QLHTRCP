package mypack;

public class Phong {
    private String maPhong;
    private String khuVuc;
    private int soLuongGhe;
    private  boolean loaiPhong;
    public Rap phong_rap;

    public String getMaPhong() {
        return maPhong;
    }

    public String getKhuVuc() {
        return khuVuc;
    }

    public int getSoLuongGhe() {
        return soLuongGhe;
    }
    public boolean getLoaiPhong(){
        return loaiPhong;
    }
    public Phong(String maPhong, String khuVuc, int soLuongGhe, boolean loaiPhong, Rap phong_rap){
        this.maPhong = maPhong;
        this.khuVuc = khuVuc;
        this.soLuongGhe = soLuongGhe;
        this.loaiPhong = loaiPhong;
        this.phong_rap  = phong_rap;
    }
}
