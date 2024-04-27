package AA;

import java.util.Scanner;


public class ThiHanh {
    public static void main(String[] args) {
        QuanLyNhanSu quanLyNhanSu = new QuanLyNhanSu();
        quanLyNhanSu.NhapDanhSachNhanSu();
        quanLyNhanSu.XuatDanhSachNhanSu();

        // Ví dụ tìm nhân sự
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên nhân sự cần tìm:");
        String tenCanTim = scanner.nextLine();
        quanLyNhanSu.TimNhanSu(tenCanTim);
    }
}