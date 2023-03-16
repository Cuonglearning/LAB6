package LAB6_2;
import java.util.Scanner;

public class HocSinh {
    public String hoTen;
    public String lop;
    public float toan,ly,hoa;
    Scanner scan=new Scanner(System.in);

    public HocSinh() {
    }

    public HocSinh(String hoTen, String lop, float toan, float ly, float hoa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    
    public void nhap(){
        System.out.println("Nhap ten:");
        hoTen=scan.next();
        System.out.println("Nhap lop:");
        lop=scan.next();
        System.out.println("Nhap diem toan:");
        toan=scan.nextFloat();
        System.out.println("Nhap diem ly:");
        ly=scan.nextFloat();
        System.out.println("Nhap didem hoa:");
        hoa=scan.nextFloat();
    }
    public float trungBinh(){
        return (toan+ly+hoa)/3;
    }

    public String xuat() {
        return "HocSinh{" + "hoTen=" + hoTen + ", lop=" + lop + ", toan=" + toan + ", ly=" + ly + ", hoa=" + hoa + "Diem trung binh=" + trungBinh() + '}';
    }
    
}
