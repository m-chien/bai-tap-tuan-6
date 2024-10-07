package bai2;

import java.util.*;

public class qlysinhvien {
    List<sinhvien> qlysinhvien;

    public qlysinhvien() {
        this.qlysinhvien = new ArrayList<>();
    }
    void themsinhvien(sinhvien sv)
    {
        qlysinhvien.add(sv);
    }
    void nhap()
    {
        sinhvien sv;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong sinh vien: ");
        int n = sc.nextInt();
        int chon=1;
        for (int i = 0; i < n; i++) {
            sv = new sinhvien();
            sv.nhapthongtin();
            themsinhvien(sv);
        }
        while (chon!=0)
        {
            System.out.println("1. thoat\n2. in thong tin\n3.sap xep theo dtb");
            chon = sc.nextInt();
            switch (chon)
            {
                case 1:
                {
                    break;
                }
                case 2:
                {
                    for (sinhvien hs : qlysinhvien)
                    {
                        hs.inthongtin();
                    }

                    break;
                }
                case 3:
                {
                    sapxep();
                    break;
                }
            }
        }
    }
    void sapxep()
    {
        Collections.sort(qlysinhvien, new Comparator<sinhvien>() {
            public int compare(sinhvien o1, sinhvien o2) {
                return (int) (o2.getDtb() - o1.getDtb());
            }
        });
        for (sinhvien hs : qlysinhvien)
        {
            hs.inthongtin();
        }
    }
}
