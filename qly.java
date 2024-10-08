package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class qly {
    List<sinhvien> qly;

    public qly() {
        this.qly = new ArrayList<>();
    }

    void themsinhvien(sinhvien sv) {
        qly.add(sv);
    }

    void Nhap() {
        sinhvien sv;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so sinh vien: ");
        int n = sc.nextInt();
        int chon = 1;
        for (int i = 0; i < n; i++) {
            sv = new sinhvien();
            sv.Nhap();
            themsinhvien(sv);
        }
        while (chon != 0) {
            System.out.println("Chọn thao tác:\n1. Thoát\n2. In thông tin\n3. Sắp xếp theo điểm trung bình");
            chon = sc.nextInt();
            switch (chon) {
                case 1: {
                    break;
                }
                case 2: {
                    for (sinhvien hs : qly) {
                        hs.In();
                    }
                    break;
                }
                case 3: {
                    sapxep();
                    break;
                }
            }
        }
        sc.close();
    }

    void sapxep() {
        Collections.sort(qly, new Comparator<sinhvien>() {
            @Override
            public int compare(sinhvien o1, sinhvien o2) {
                return Double.compare(o2.getdiem(), o1.getdiem());
            }
        });
        for (sinhvien hs : qly) {
            hs.In();
        }
    }
}
