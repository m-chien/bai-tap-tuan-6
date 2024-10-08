
package Bai2;


import java.util.Scanner;

public class SINHVIEN {
    private String maSV;
    private String ten;
    private String ngaySinh;
    private double diemTB;
    
    public SINHVIEN(String maSV, String ten, String ngaySinh, double diemTB){
        this.maSV = maSV;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }
    
    public void nhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        this.maSV = sc.nextLine();
        System.out.println("Nhập tên sinh viên:");
        this.ten = sc.nextLine();
        System.out.println("Nhập ngày sinh (dd/mm/yyyy):");
        this.ngaySinh =sc.nextLine();
        System.out.println("Nhập điểm trung bình");
        this.diemTB = sc.nextDouble();
        //this. giúp phân biệt biến ở trong class với biến đối số của hàm khởi tao   
    }
    
    public void inThongTin()
    {
        System.out.println("Mã sinh viên: " + maSV);
        System.out.println("Tên: " + ten);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Điểm trung bình: " + diemTB);
    }
    
    // getter cho diemtb
    public double getDiemTrungBinh() {
    return diemTB;
}

    
    
}
