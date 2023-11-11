package mypack;

import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QL_HTRCP {
    static List<Phim> dsPhim = new ArrayList<>();
    static List<Phong> dsPhong = new ArrayList<>();
    static List<TepKH> dsTepKhachHang = new ArrayList<>();
    static List<KhanGia> dsKhanGia = new ArrayList<>();
    static List<HoaDon> dsHoaDon = new ArrayList<>();
    static List<Rap> dsRap = new ArrayList<>();
    static List<NhanVien> dsNhanVien = new ArrayList<>();
    static List<ViTriCV> dsViTriCongViec = new ArrayList<>();
    static List<DoiTac> dsDoiTac = new ArrayList<>();
    static List<HopDong> dsHopDong = new ArrayList<>();

    static List<LichChieu> dsLichChieu = new ArrayList<>();
    static List<KhaNang> dsKhaNang = new ArrayList<>();
    static List<ChiTietHD> dsChiTietHopDong = new ArrayList<>();
    static List<ChiTietNguoiXem> dsChiTietNguoiXem = new ArrayList<>();

    public static void taoDSBoPhim()
    {
        dsPhim.add(new Phim("BoPhim001", "Dat rung phuong Nam", "Phieu lieu", "Nguyen Quan Dung", "Tran Thanh", 1.30));
        dsPhim.add(new Phim("BoPhim002", "Nguoi tinh", "Tinh cam", "Le Anh Dung", "Kang Tae Oh", 1.45));
        dsPhim.add(new Phim("BoPhim003", "Chiec la cuoi cung", "Hinh su", "Vu Ngoc Dang", "Ngo Thanh Van", 1.50));
        dsPhim.add(new Phim("BoPhim004", "Mat biec", "Lang mang", "Do Duc Thinh", "Tran Nu Yen Khe", 2.00));
        dsPhim.add(new Phim("BoPhim005", "Co be ban diem", "Hai huoc", "Dinh Tuan Vu", "Sam", 1.35));
        dsPhim.add(new Phim("BoPhim006", "Gac ma", "Kinh di", "Derek Nguyen", "Ngo Thanh Van", 1.40));
        dsPhim.add(new Phim("BoPhim007", "Dinh thu Oan khuat", "Gia dinh", "Phan Gia Nhat Linh", "Ngoc Lan", 1.55));
        dsPhim.add(new Phim("BoPhim008", "Thang tien hon nhan", "Tinh cam", "Ngo Quang Hai", "Quynh Nga", 1.25));
        dsPhim.add(new Phim("BoPhim009", "Chay an", "Hanh dong", "Le Hoang", "Thai Hoa", 1.48));
        dsPhim.add(new Phim("BoPhim010", "Conan - Chiec tau sat mau den", "Phieu Lieu - Hinh su", "Kodama Kenji", "Conan", 2.32));
        dsPhim.add(new Phim("BoPhim011", "One Piece", "Phieu Lieu - Hinh su - Lang man", "Erochi Oda", "Luffy", 5.45));
        dsPhim.add(new Phim("BoPhim012", "Bo Gia", "Gia Dinh", "Tran Thanh", "Tran Thanh", 2.30));
        dsPhim.add(new Phim("BoPhim013", "Cua lai vo bau", "Tinh Cam", "Tran Thanh", "Tran Thanh", 2.30));
    }
    public static void taoDSPhong()
    {
        dsPhong.add(new Phong("Phong001", "A301", 90, true, dsRap.get(0)));
        dsPhong.add(new Phong("Phong002", "B102", 80, true, dsRap.get(2)));
        dsPhong.add(new Phong("Phong003", "C205", 100, false, dsRap.get(3)));
        dsPhong.add(new Phong("Phong004", "D401", 120, false, dsRap.get(0)));
        dsPhong.add(new Phong("Phong005", "E301", 95, true, dsRap.get(1)));
        dsPhong.add(new Phong("Phong006", "F202", 110, false, dsRap.get(2)));
        dsPhong.add(new Phong("Phong007", "G103", 75, true, dsRap.get(3)));
        dsPhong.add(new Phong("Phong008", "H304", 85, true, dsRap.get(0)));
        dsPhong.add(new Phong("Phong009", "I205", 105, false, dsRap.get(1)));
        dsPhong.add(new Phong("Phong010", "J401", 130, false, dsRap.get(2)));
        dsPhong.add(new Phong("Phong011", "K301", 100, true, dsRap.get(2)));
        dsPhong.add(new Phong("Phong012", "L202", 115, false, dsRap.get(3)));
        dsPhong.add(new Phong("Phong013", "M103", 80, true, dsRap.get(0)));
        dsPhong.add(new Phong("Phong014", "N304", 90, true, dsRap.get(1)));
        dsPhong.add(new Phong("Phong015", "O205", 110, false, dsRap.get(2)));
        dsPhong.add(new Phong("Phong016", "A301", 90, true, dsRap.get(1)));
    }
    public static void taoDSTepKH()
    {
        dsTepKhachHang.add(new TepKH("TepKH001", "16 - 35", "Lang man", 40));
        dsTepKhachHang.add(new TepKH("TepKH002", "10 - 60", "Hai huoc", 35));
        dsTepKhachHang.add(new TepKH("TepKH003", "18 - 45", "Hanh dong", 30));
    }
    public static void taoDSKG()
    {
        dsKhanGia.add(new KhanGia("KG001", "Tran Minh Triet", "25/04/2004", "TPHCM", "0877362452", dsTepKhachHang.get(0)));
        dsKhanGia.add(new KhanGia("KG002", "Nguyen Thi Mai", "15/08/1995", "Ha Noi", "0987654321", dsTepKhachHang.get(1)));
        dsKhanGia.add(new KhanGia("KG003", "Le Van Hieu", "10/03/1980", "Da Nang", "0909123456", dsTepKhachHang.get(2)));
        dsKhanGia.add(new KhanGia("KG004", "Tran Thi Anh", "20/06/1999", "Can Tho", "0369875412", dsTepKhachHang.get(0)));
        dsKhanGia.add(new KhanGia("KG005", "Ho Van Hung", "30/09/1988", "TP.HCM", "0789456123", dsTepKhachHang.get(0)));
        dsKhanGia.add(new KhanGia("KG006", "Truong Van Khoi", "18/05/2002", "Dak Lak", "0978563412", dsTepKhachHang.get(1)));
        dsKhanGia.add(new KhanGia("KG007", "Phan Thi Thao", "14/08/1998", "Long An", "0123456789", dsTepKhachHang.get(0)));
        dsKhanGia.add(new KhanGia("KG008", "Nguyen Van Hoang", "15/06/1983", "Quang Tri", "0932109876", dsTepKhachHang.get(2)));
        dsKhanGia.add(new KhanGia("KG009", "Tran Thi Thuy", "10/09/1996", "Binh Dinh", "0654789321", dsTepKhachHang.get(1)));
        dsKhanGia.add(new KhanGia("KG010", "Tran Van Tuan", "30/05/2010", "Ha Noi", "0932108765", dsTepKhachHang.get(1)));
    }
    public static void taoDSHoaDon()
    {
        dsHoaDon.add(new HoaDon("HD001", "25/06/2023", 180, "Dat rung phuong Nam", 1.45, "G4", dsKhanGia.get(0)));
        dsHoaDon.add(new HoaDon("HD002", "26/06/2023", 150, "Chiec la cuoi cung", 1.3, "A2", dsKhanGia.get(1)));
        dsHoaDon.add(new HoaDon("HD003", "27/06/2023", 200, "Conan - Chiec tau sat mau den", 1.8, "B3", dsKhanGia.get(2)));
        dsHoaDon.add(new HoaDon("HD004", "28/06/2023" , 120, "Chiec la cuoi cung", 1.2, "C1", dsKhanGia.get(3)));
        dsHoaDon.add(new HoaDon("HD005", "29/06/2023" , 250, "Conan - Chiec tau sat mau den", 2.0, "D5", dsKhanGia.get(4)));
        dsHoaDon.add(new HoaDon("HD006", "30/06/2023", 190, "Mat biec", 1.6, "E2", dsKhanGia.get(2)));
        dsHoaDon.add(new HoaDon("HD007", "01/07/2023", 170, "Mat biec", 1.7, "F3", dsKhanGia.get(6)));
        dsHoaDon.add(new HoaDon("HD008", "02/07/2023", 210, "Mat biec", 1.9, "G4", dsKhanGia.get(3)));
        dsHoaDon.add(new HoaDon("HD009", "03/07/2023", 160, "Co be ban diem", 1.4, "A2", dsKhanGia.get(8)));
        dsHoaDon.add(new HoaDon("HD010", "04/07/2023", 180, "Thang tien hon nhan", 1.5, "B3", dsKhanGia.get(9)));
    }
    public static void taoDSRap()
    {

        dsRap.add(new Rap("Rap001", "Rap CGV Quan 9", "Quan 9 - TP.HCM", 4, 500, dsNhanVien.get(0)));
        dsRap.add(new Rap("Rap002", "Rap Galaxy Tan Binh", "Tan Binh - TP.HCM", 5, 600, dsNhanVien.get(1)));
        dsRap.add(new Rap("Rap003", "Rap Lotte Mart Go Vap", "Go Vap - TP.HCM", 3, 450, dsNhanVien.get(2)));
        dsRap.add(new Rap("Rap004", "Rap BHD Vincom Thu Duc", "Thu Duc - TP.HCM", 6, 700, dsNhanVien.get(7)));
    }
    public static void taoDSNhanVien()
    {
        dsNhanVien.add(new NhanVien("NV001", "Le Binh Tan", "20/01/2000", "TP.HCM", "0878884223", 2000 ));
        dsNhanVien.add(new NhanVien("NV002", "Nguyen Thi Hoa","15/05/1995" , "Ha Noi", "0901234567", 1900 ));
        dsNhanVien.add(new NhanVien("NV003", "Tran Van Quyen","08/10/1988" , "TP.HCM", "0987654321", 5000 ));
        dsNhanVien.add(new NhanVien("NV004", "Pham Thu Ha","25/03/1992" , "Binh Dinh", "0912345678", 500));
        dsNhanVien.add(new NhanVien("NV005", "Vo Ngoc Lan","12/08/1997" , "Hue", "0888777666",600));
        dsNhanVien.add(new NhanVien("NV006", "Truong Minh Duc","30/11/1990" , "TP.HCM", "0909876543", 500));
        dsNhanVien.add(new NhanVien("NV007", "Le Thi Anh Thu","18/04/1993" , "Tien Giang", "0932109876", 700));
        dsNhanVien.add(new NhanVien("NV008", "Hoang Van Hiep","22/07/1985" , "Binh Dinh", "0976543210",1000));
        dsNhanVien.add(new NhanVien("NV009", "Nguyen Van Quang","03/12/1987" , "Vung Tau", "0945678901", 800));
        dsNhanVien.add(new NhanVien("NV010", "Tran Thi My Linh","05/06/1994" , "Ha Noi", "0898765432", 600));
        dsNhanVien.add(new NhanVien("NV011", "Tran Van An","08/09/1996" , "TP.HCM", "0918765432", 700));
        dsNhanVien.add(new NhanVien("NV012", "Nguyen Thi Mai","14/02/1991" , "Da Nang", "0965432109", 650));
    }
    public static void taoDSViTriCV()
    {
        dsViTriCongViec.add(new ViTriCV("CV001", "Ban ve", "Dung ban ve va ban nuoc"));
        dsViTriCongViec.add(new ViTriCV("CV002", "Ky hop dong", "Gap go doi tac de ky hop dong"));
        dsViTriCongViec.add(new ViTriCV("CV003", "Le tan", "Don tiep va huong dan khach hang"));
        dsViTriCongViec.add(new ViTriCV("CV004", "Ke toan", "Quan ly cac giao dich tai chinh"));
        dsViTriCongViec.add(new ViTriCV("CV005", "Nhan vien ve sinh", "Dua don sach se va bao tri khu vuc"));
        dsViTriCongViec.add(new ViTriCV("CV006", "Thu quy", "Quan ly thu chi va bao cao tai chinh"));
        dsViTriCongViec.add(new ViTriCV("CV007", "Bao ve", "Canh chung co ai nao loan. Giup do nguoi khong biet duong"));
        dsViTriCongViec.add(new ViTriCV("CV008", "Trong xe", "O duoi ham trong xe"));
        dsViTriCongViec.add(new ViTriCV("CV009", "Nhan vien phat to roi", "Di phat to roi de quang ba phim"));
        dsViTriCongViec.add(new ViTriCV("CV0010", "Tho dien", "Sua chua thiet bi dien bi hu hong"));
    }
    public static void taoDSDoiTac()
    {
        dsDoiTac.add(new DoiTac("DT001", "Le Hoang Long","15/09/1985" , "TP.HCM", "0987654321"));
        dsDoiTac.add(new DoiTac("DT002", "Nguyen Thanh Trung","25/03/1990" , "Ha Noi", "0901234567"));
        dsDoiTac.add(new DoiTac("DT003", "Tran Thi Mai Anh","10/11/1988" , "Quang Ninh", "0912345678"));
        dsDoiTac.add(new DoiTac("DT004", "Vo Van Hiep","18/05/1995" , "Binh dinh", "0923456789"));
        dsDoiTac.add(new DoiTac("DT005", "Le Thi Thu Ha","22/07/1992" , "TP.HCM", "0934567890"));
    }
    public static void taoDSHopDong()
    {
        dsHopDong.add(new HopDong("HD001", "Hop dong phim tinh cam","11/10/2018" , 100000.5));
        dsHopDong.add(new HopDong("HD002", "Hop dong phim hanh dong","11/12/2019", 230000.49));
        dsHopDong.add(new HopDong("HD003", "Hop dong phim kinh di","11/10/2018" , 200000.5));
        dsHopDong.add(new HopDong("HD004", "Hop dong phim anime","11/12/2019" , 430000.49));
        dsHopDong.add(new HopDong("HD005", "Hop dong phim hoc duong","11/10/2018" , 50000.5));
        dsHopDong.add(new HopDong("HD006", "Hop dong phim nhac","11/12/2019" , 330000.49));
    }
    public static void taoDS_LC()
    {
        dsLichChieu.add(new LichChieu(dsPhim.get(9), dsPhong.get(0),"19h30 - 13/07/2023" ));
        dsLichChieu.add(new LichChieu(dsPhim.get(0), dsPhong.get(1),"14h16 - 14/07/2023"));
        dsLichChieu.add(new LichChieu(dsPhim.get(1), dsPhong.get(0),"18h - 13/07/2023" ));
        dsLichChieu.add(new LichChieu(dsPhim.get(9), dsPhong.get(5),"18h30 - 02/08/2023" ));
        dsLichChieu.add(new LichChieu(dsPhim.get(2), dsPhong.get(3),"20h45 - 13/07/2023" ));
        dsLichChieu.add(new LichChieu(dsPhim.get(4), dsPhong.get(6),"19h30 - 23/10/2023" ));
        dsLichChieu.add(new LichChieu(dsPhim.get(8), dsPhong.get(1),"20h45 - 24/05/2023" ));
        dsLichChieu.add(new LichChieu(dsPhim.get(10), dsPhong.get(4),"18h - 16/07/2023" ));
        dsLichChieu.add(new LichChieu(dsPhim.get(7), dsPhong.get(2),"18h - 30/09/2023" ));
        dsLichChieu.add(new LichChieu(dsPhim.get(7), dsPhong.get(3),"17h30 - 19/07/2023" ));
        dsLichChieu.add(new LichChieu(dsPhim.get(9), dsPhong.get(9),"17h30 - 28/07/2023" ));
        dsLichChieu.add(new LichChieu(dsPhim.get(2), dsPhong.get(3),"19h30 - 13/07/2023" ));
        dsLichChieu.add(new LichChieu(dsPhim.get(10), dsPhong.get(3),"18h - 17/08/2023" ));
        dsLichChieu.add(new LichChieu(dsPhim.get(11), dsPhong.get(9),"17h30 - 13/08/2023"));
        dsLichChieu.add(new LichChieu(dsPhim.get(12), dsPhong.get(3),"19h30 - 12/09/2023" ));
    }
    public static void taoDS_KN()
    {
        dsKhaNang.add(new KhaNang(dsNhanVien.get(0), List.of(dsViTriCongViec.get(1), dsViTriCongViec.get(2), dsViTriCongViec.get(3)), 3));
        dsKhaNang.add(new KhaNang(dsNhanVien.get(1), List.of(dsViTriCongViec.get(1)), 1));
        dsKhaNang.add(new KhaNang(dsNhanVien.get(2), List.of(dsViTriCongViec.get(1), dsViTriCongViec.get(2)), 2));
        dsKhaNang.add(new KhaNang(dsNhanVien.get(3), List.of(dsViTriCongViec.get(6), dsViTriCongViec.get(7)), 2));
        dsKhaNang.add(new KhaNang(dsNhanVien.get(4), List.of(dsViTriCongViec.get(5)), 1));
        dsKhaNang.add(new KhaNang(dsNhanVien.get(5), List.of(dsViTriCongViec.get(0)), 1));
        dsKhaNang.add(new KhaNang(dsNhanVien.get(6), List.of(dsViTriCongViec.get(4)), 1));
        dsKhaNang.add(new KhaNang(dsNhanVien.get(7), List.of(dsViTriCongViec.get(9)), 1));
        dsKhaNang.add(new KhaNang(dsNhanVien.get(8), List.of(dsViTriCongViec.get(1), dsViTriCongViec.get(3)), 2));
        dsKhaNang.add(new KhaNang(dsNhanVien.get(9), List.of(dsViTriCongViec.get(6), dsViTriCongViec.get(7), dsViTriCongViec.get(8)), 3));
        dsKhaNang.add(new KhaNang(dsNhanVien.get(10), List.of(dsViTriCongViec.get(2)), 1));
        dsKhaNang.add(new KhaNang(dsNhanVien.get(11), List.of(dsViTriCongViec.get(3)), 1));
    }
    public static void taoDS_CTHD()
    {
        dsChiTietHopDong.add(new ChiTietHD(dsHopDong.get(0), dsDoiTac.get(0), 100000.5,"30/06/2023" ));
        dsChiTietHopDong.add(new ChiTietHD(dsHopDong.get(1), dsDoiTac.get(1), 130000,"15/01/2023" ));
        dsChiTietHopDong.add(new ChiTietHD(dsHopDong.get(2), dsDoiTac.get(2), 150000,"20/08/2023" ));
        dsChiTietHopDong.add(new ChiTietHD(dsHopDong.get(3), dsDoiTac.get(3), 400000,"28/02/2023" ));
        dsChiTietHopDong.add(new ChiTietHD(dsHopDong.get(4), dsDoiTac.get(4), 500000.5,"10/09/2023" ));
        dsChiTietHopDong.add(new ChiTietHD(dsHopDong.get(5), dsDoiTac.get(0), 500000,"05/03/2019"));
        dsChiTietHopDong.add(new ChiTietHD(dsHopDong.get(0), dsDoiTac.get(1), 220000,"15/10/2018" ));
        dsChiTietHopDong.add(new ChiTietHD(dsHopDong.get(1), dsDoiTac.get(2), 60000,"20/04/2019" ));
        dsChiTietHopDong.add(new ChiTietHD(dsHopDong.get(2), dsDoiTac.get(3), 300000,"25/11/2018" ));
        dsChiTietHopDong.add(new ChiTietHD(dsHopDong.get(3), dsDoiTac.get(4), 500000,"30/05/2019" ));
        dsChiTietHopDong.add(new ChiTietHD(dsHopDong.get(4), dsDoiTac.get(0), 70000,"05/12/2018" ));
        dsChiTietHopDong.add(new ChiTietHD(dsHopDong.get(5), dsDoiTac.get(1), 20000,"10/06/2019" ));
        dsChiTietHopDong.add(new ChiTietHD(dsHopDong.get(0), dsDoiTac.get(2), 120000,"20/01/2019" ));
        dsChiTietHopDong.add(new ChiTietHD(dsHopDong.get(1), dsDoiTac.get(3), 300000,"15/07/2019" ));
        dsChiTietHopDong.add(new ChiTietHD(dsHopDong.get(2), dsDoiTac.get(4), 400000,"25/02/2019" ));
    }
    public static void taoDS_CTNX()
    {
        dsChiTietNguoiXem.add(new ChiTietNguoiXem(dsPhim.get(0), dsKhanGia.get(1), true));
        dsChiTietNguoiXem.add(new ChiTietNguoiXem(dsPhim.get(0), dsKhanGia.get(3), false));
        dsChiTietNguoiXem.add(new ChiTietNguoiXem(dsPhim.get(2), dsKhanGia.get(5), true));
        dsChiTietNguoiXem.add(new ChiTietNguoiXem(dsPhim.get(3), dsKhanGia.get(7), true));
        dsChiTietNguoiXem.add(new ChiTietNguoiXem(dsPhim.get(4), dsKhanGia.get(9), false));
        dsChiTietNguoiXem.add(new ChiTietNguoiXem(dsPhim.get(5), dsKhanGia.get(4), true));
        dsChiTietNguoiXem.add(new ChiTietNguoiXem(dsPhim.get(6), dsKhanGia.get(4), false));
        dsChiTietNguoiXem.add(new ChiTietNguoiXem(dsPhim.get(11), dsKhanGia.get(1), true));
        dsChiTietNguoiXem.add(new ChiTietNguoiXem(dsPhim.get(8), dsKhanGia.get(1), false));
        dsChiTietNguoiXem.add(new ChiTietNguoiXem(dsPhim.get(9), dsKhanGia.get(3), true));
        dsChiTietNguoiXem.add(new ChiTietNguoiXem(dsPhim.get(10), dsKhanGia.get(5), false));
        dsChiTietNguoiXem.add(new ChiTietNguoiXem(dsPhim.get(11), dsKhanGia.get(7), true));
        dsChiTietNguoiXem.add(new ChiTietNguoiXem(dsPhim.get(0), dsKhanGia.get(9), false));
        dsChiTietNguoiXem.add(new ChiTietNguoiXem(dsPhim.get(12), dsKhanGia.get(9), true));
        dsChiTietNguoiXem.add(new ChiTietNguoiXem(dsPhim.get(2), dsKhanGia.get(8), false));
        dsChiTietNguoiXem.add(new ChiTietNguoiXem(dsPhim.get(3), dsKhanGia.get(7), true));
        dsChiTietNguoiXem.add(new ChiTietNguoiXem(dsPhim.get(4), dsKhanGia.get(1), false));
        dsChiTietNguoiXem.add(new ChiTietNguoiXem(dsPhim.get(5), dsKhanGia.get(3), true));
        dsChiTietNguoiXem.add(new ChiTietNguoiXem(dsPhim.get(11), dsKhanGia.get(5), false));
    }
    // Cau 1: Lay ra thong tin nhung bo phim ma tran thanh lam dien vien chinh.
    public static void Cau1(){
        System.out.println("Ket qua cau 1:");
        List<Phim> phimStream = dsPhim.stream()
                .filter(phim -> phim.getTenDienVien() == "Tran Thanh")
                .collect(Collectors.toList());
        if (phimStream.isEmpty()){
            System.out.println("Khong co thong tin ve cac bo phim ma Tran Thanh tham gia");
        }
        else{
            for (Phim phim : phimStream){
                System.out.println("Ma phim: " + phim.getMaPhim() +", Ten phim: " + phim.getTenPhim()
                + ", The loai: " + phim.getTheLoai() + ", Thoi luong: " + phim.getThoiLuong()+"h");
            }
        }
    }
    // Cau 2: Lay ra ten hop dong, ten doi tac va ngay hop dong doi voi nhung hop dong chua thanh toan du
    // va so tien con thieu
    public static void Cau2(){
        List<ChiTietHD> cthdStream = dsChiTietHopDong.stream()
                .filter(hd -> hd.getSoTienDong() < hd.chiTiet_hopDong.getTriGiaHD())
                .collect(Collectors.toList());
        if (cthdStream.isEmpty()){
            System.out.println("Cac hop dong deu da duoc dong du");
        }
        else{
            for (ChiTietHD item : cthdStream){
                System.out.println("Ten hop dong: " + item.chiTiet_hopDong.getTenHD()
                + ",Doi tac hop dong: " + item.chiTiet_doiTac.hoTen + ", Ngay hop dong: "
                        + item.chiTiet_hopDong.getNgayHD() + ", Tri gia hop dong: " + item.chiTiet_hopDong.getTriGiaHD()
                + ",So tien thanh toan con thieu: "
                        + (item.chiTiet_hopDong.getTriGiaHD() - item.getSoTienDong()));
            }
        }
    }
    // Cau 3: Cho biết danh sach nhan vien den tu nhung tinh thanh nao. Sap xep tang dan theo chu cai dau tien.
    // Neu chu cai dau giong nhau sap xep giam theo luong
    public static void Cau3(){
        List<String> diaChiNVStream = dsNhanVien.stream()
                .map(nv -> nv.diaChi)
                .collect(Collectors.toList());

        List<String> nvStream = diaChiNVStream.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        for (String dc : nvStream){
            System.out.println("Dia chi: " + dc);
        }
    }
    public static void main(String[] args) {
        // Gọi phương thức tạo tập thực thể
        taoDSBoPhim();
        taoDSNhanVien();
        taoDSRap();
        taoDSPhong();
        taoDSTepKH();
        taoDSKG();
        taoDSHoaDon();
        taoDSViTriCV();
        taoDSDoiTac();
        taoDSHopDong();
        taoDS_LC();
        taoDS_KN();
        taoDS_CTHD();
        taoDS_CTNX();
        // Cau 1: Lấy ra thông tin những bộ phim mà Tran Thanh làm diễn viên chính.
        Cau1();
        // Cau 2: Lấy ra tên hợp đồng và tên đối tác và ngày hợp đồng đối với những hợp đồng vẫn chưa thanh toán đủ.
        Cau2();
        // Cau 3: Cho biết danh sach nhan vien den tu nhung tinh thanh nao. Sap xep tang dan theo chu cai dau tien.
        Cau3();
        // Cau 4: Tai cac phong cua rap khi biet ma rap. Cho biet thong tin ve phong chieu,
        // phim duoc chieu va thoi gian chieu
        // Cau 5: Cho biet thong tin nhung bo phim hien chua co xuat chieu.
    }
}
