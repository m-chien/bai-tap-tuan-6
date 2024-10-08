
package Bai3;

import java.util.Scanner;


public class TaikhoanNH {
    //số tài khoản, chủ tài khoản, số dư.
    public String soTK;
    public String chuTK;
    public double soDu;
    //constructor
    public TaikhoanNH (String soTK, String chuTK, double soDu)
    {
        this.soTK = soTK;
        this.chuTK = chuTK;
        this.soDu = soDu;
    }
    
    //phương thức gửi tiền
    public void guiTien(double soTienGui)
    {
        if(soTienGui>0)
        {
            soDu = soDu + soTienGui;
            System.out.println("Da gui: " + soTienGui + " .So du hien tai " + soDu);
        }
        else
            System.out.println("So tien gui phai lon hon 0");
    }
    
    //phương thức rút tiền
    public void rutTien(double soTienRut)
    {
        if(soTienRut >0 && soTienRut < soDu)
        {
            soDu = soDu - soTienRut;
            System.out.println("Da rut: " + soTienRut + " .So du hien tai " + soDu);
        }
        else
            if(soTienRut > soDu)
                System.out.println("So du khong du de rut");
            else
                System.out.println("So tien rut phai lon hon 0");
    }
    
    public double KTSD()
    {
        return soDu;
    }
    
    public static void main(String[] args) {
        double gui, rut;
        TaikhoanNH tknh = new TaikhoanNH("372005", "Ngô Thanh Xuân Trường", 1000000);
        System.out.println("Nhap vao so tien muon gui");
        Scanner sc = new Scanner(System.in);
        gui = sc.nextInt();
        tknh.guiTien(gui);
        System.out.println("Nhap vao so tien muon rut");
        rut = sc.nextInt();
        tknh.rutTien(rut);
        System.out.println("So du trong tai khoan la: " + tknh.KTSD());
    }
}
