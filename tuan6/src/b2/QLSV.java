package b2;

import java.util.*;

public class QLSV {
    List<SV> QLSV;

    public QLSV() {
        this.QLSV = new ArrayList<>();
    }

    void themSinhVien(SV sv) {
        QLSV.add(sv);
    }

    void nhap() {
        SV sv;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        int chon = 1;

        for (int i = 0; i < n; i++) {
            sv = new SV();
            sv.nhapthongtin();
            themSinhVien(sv);
        }

        while (chon != 0) {
            System.out.println("1.Sap xep theo dtb \n2. In thong tin\n3. Thoat");
            chon = sc.nextInt();
            switch (chon) {
                case 3: {
                    break;
                }
                case 2: {
                    for (SV hs : QLSV) {
                        hs.inthongtin();
                    }
                    break;
                }
                case 1: {
                    sapXep();
                    break;
                }
            }
        }
    }

    void sapXep() {
        Collections.sort(QLSV, new Comparator<SV>() {
            public int compare(SV o1, SV o2) {
                return (int) (o2.getDtb() - o1.getDtb());
            }
        });
        for (SV hs : QLSV) {
            hs.inthongtin();
        }
    }
}