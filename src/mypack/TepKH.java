package mypack;

public class TepKH {
    private String maTepKH;
    private String doTuoi;
    private String soThich;
    private int soLuong;

    public String getMaTepKH() {
        return maTepKH;
    }

    public String getDoTuoi() {
        return doTuoi;
    }

    public String getSoThich() {
        return soThich;
    }

    public int getSoLuong() {
        return soLuong;
    }
    public TepKH(String maTepKH, String doTuoi, String soThich, int soLuong){
        this.maTepKH = maTepKH;
        this.doTuoi = doTuoi;
        this.soThich = soThich;
        this.soLuong = soLuong;
    }
}
