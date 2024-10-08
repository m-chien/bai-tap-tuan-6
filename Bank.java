package bai3;

import java.util.Scanner;

public class Bank {
    private double STK;
    private double CTK;
    private double SD = 0;

    void guitien(Scanner sc) {
        double them;
        System.out.println("Nhap so tien ban muon gui: ");
        them = sc.nextDouble();
        SD = SD + them;
        System.out.println("So du tai khoan cua ban hien tai: " + SD);
    }

    void ruttien(Scanner sc) {
        double rut;
        System.out.println("Nhap so tien ban muon rut: ");
        rut = sc.nextDouble();
        if (rut <= SD) {
            System.out.println("Ban da rut thanh cong: " + rut + " VNĐ");
            SD -= rut;
            System.out.println("So du hien tai la: " + SD + "VNĐ");
        } else {
            System.out.println("So Du khong du");
            rut = sc.nextDouble();
        }
    }

    void KT() {
        System.out.println("So du hien tai la: " + SD + "VNĐ");
    }

    void Nhap(Scanner sc) {
        int chon;
        do {
            System.out.println("----------------\nvui long chon: ");
            System.out.println("1.gui tien\n2.rut tien\n3.kiem tra so du\n4.thoat");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    guitien(sc);
                    break;
                case 2:
                    ruttien(sc);
                    break;
                case 3:
                    KT();
                    break;
                case 4:
                    break;
            }
        } while (chon != 4);

    }
}
