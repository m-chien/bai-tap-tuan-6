
package Bai1;


public class main {
    public static void main(String[] args) {
        HINHCHUNHAT hcn = new HINHCHUNHAT(5.0, 4.0);
        double chuVi = hcn.tinhChuVi();
        System.out.println("Chu vi cua hinh chu nhat la: " + chuVi);
        double dienTich = hcn.tinhDienTich();
        System.out.println("Dien tich hinh chu nhat la: " + dienTich);
        
    }
}
