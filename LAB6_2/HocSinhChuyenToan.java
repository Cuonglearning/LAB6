package LAB6_2;

public class HocSinhChuyenToan extends HocSinh {

    public HocSinhChuyenToan() {
    }

    public HocSinhChuyenToan(String hoTen, String lop, float toan, float ly, float hoa) {
        super(hoTen, lop, toan, ly, hoa);
    }

    @Override
    public float trungBinh() {
        return (toan*2+ly+hoa)/3;
    }

    @Override
    public String xuat() {
        return "Hoc sinh chuyen Toan{" + "hoTen=" + hoTen + ", lop=" + lop + ", toan=" + toan + ", ly=" + ly + ", hoa=" + hoa + "Diem trung binh=" + trungBinh() + '}';
    }
    
}
