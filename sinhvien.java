package bai2;

import java.util.Scanner;

public class sinhvien {
    private String masv;
    private String tensv;
    private String ngaysinh;
    private double diem;

    void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma sinh vien: ");
        masv = sc.nextLine();
        System.out.println("nhap ten sinh vien: ");
        tensv = sc.nextLine();
        System.out.println("nhap ngay sinh cua sinh vien: ");
        ngaysinh = sc.nextLine();
        System.out.println("nhap diem sinh vien: ");
        diem = sc.nextDouble();
    }

    void In() {
        System.out.println("Ma sinh vien la: " + masv);
        System.out.println("Ten sinh vien la: " + tensv);
        System.out.println("Ngaysinh cua sinh vien la: " + ngaysinh);
        System.out.println("Diem cua sinh vien la: " + diem);
    }

    public double getdiem() {
        return diem;
    }
}
