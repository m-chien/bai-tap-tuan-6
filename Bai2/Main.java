
package Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<SINHVIEN> DSSV = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên: ");
        int soluong = sc.nextInt();
        sc.nextLine(); // Đọc dòng mới để chuẩn bị cho việc nhập chuỗi sau đó

        for (int i = 0; i < soluong; i++) { // Bắt đầu từ 0
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            SINHVIEN sv = new SINHVIEN("", "", "", 0); // Khai báo biến đối tượng
            sv.nhapThongTin();
            DSSV.add(sv);
        }

        // Sắp xếp danh sách sinh viên theo điểm trung bình
        for (int i = 0; i < DSSV.size() - 1; i++) { 
            for (int j = i + 1; j < DSSV.size(); j++) { 
                if (DSSV.get(i).getDiemTrungBinh() < DSSV.get(j).getDiemTrungBinh()) {
                    // Hoán đổi
                    SINHVIEN tg = DSSV.get(i);
                    DSSV.set(i, DSSV.get(j));
                    DSSV.set(j, tg);
                }
            }
        }

        // In danh sách sinh viên sau khi sắp xếp
        System.out.println("\nDanh sách các sinh viên sau khi sắp xếp theo điểm trung bình:");
        for (SINHVIEN sv : DSSV) {
            sv.inThongTin();
            System.out.println("-------------------------------");
        }
    }
}