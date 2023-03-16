package LAB6_1;

public class NhanVienFullTime extends NhanVien{
    public int loaiChucVu;
    public int ngayLamThem;

    public NhanVienFullTime() {
    }
    

    public NhanVienFullTime(int loaiChucVu, int ngayLamThem, String ten) {
        super(ten);
        this.loaiChucVu = loaiChucVu;
        this.ngayLamThem = ngayLamThem;
    }

    @Override
    public String loaiNhanVien() {
        return "Nhan vien full time"; 
    }

    @Override
    public void tinhLuong() {
        System.out.println("luong full time");
    }
}

