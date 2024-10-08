package b1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double chieuDai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double chieuRong = scanner.nextDouble();
        // Tạo đối tượng hình chữ nhật
        hinhchunhat hinhchunhat = new hinhchunhat( chieuDai, chieuRong);

        // Tính diện tích và chu vi
        double dienTich = hinhchunhat.tinhDienTich();
        double chuVi = hinhchunhat.tinhChuVi();

        // In kết quả ra màn hình
        System.out.println("Diện tích hình chữ nhật: " + dienTich);
        System.out.println("Chu vi hình chữ nhật: " + chuVi);
    }
}