
package LAB6_1;

public class NhanVienPartTime extends NhanVien{
    public int gioLamViec;

    public NhanVienPartTime() {
    }
    

    public NhanVienPartTime(int gioLamViec, String ten) {
        super(ten);
        this.gioLamViec = gioLamViec;
    }
    
    @Override
    public String loaiNhanVien() {
        return "Nhan vien part time"; 
    }

    @Override
    public void tinhLuong() {
        System.out.println("luong part time");
    }    
}
