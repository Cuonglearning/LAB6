package LAB6_1;

public class main1 {

    public static void main(String[] args) {
        NhanVienFullTime full=new NhanVienFullTime();
        full.loaiNhanVien();
        full.tinhLuong();
        full.xuatThongTin();
        
        NhanVienPartTime part=new NhanVienPartTime();
        part.loaiNhanVien();
        part.tinhLuong();
        part.xuatThongTin();
    }
    
}
