package AA;

import java.util.ArrayList;
import java.util.Scanner;



class QuanLyNhanSu {
    private ArrayList<CongDan> dsNhanSu = new ArrayList<>();

    public void NhapDanhSachNhanSu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng nhân sự:");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.println("Chọn loại nhân sự (1 - Sinh viên, 2 - Nhân viên):");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            if (choice == 1) {
                SinhVien sv = new SinhVien();
                sv.NhapDuLieu();
                dsNhanSu.add(sv);
            } else if (choice == 2) {
                NhanVien nv = new NhanVien();
                nv.NhapDuLieu();
                dsNhanSu.add(nv);
            }
        }
    }

    public void XuatDanhSachNhanSu() {
        for (CongDan cd : dsNhanSu) {
            cd.XuatThongTin();
        }
    }

    public void TimNhanSu(String ten) {
        ArrayList<CongDan> danhSachTimDuoc = new ArrayList<>();
        for (CongDan cd : dsNhanSu) {
            if (cd.hoTen.equalsIgnoreCase(ten)) {
                danhSachTimDuoc.add(cd);
            }
        }

        int soNhanSuTimDuoc = danhSachTimDuoc.size();
        if (soNhanSuTimDuoc > 0) {
            System.out.println("Danh sách nhân sự được tìm thấy:");
            for (CongDan cd : danhSachTimDuoc) {
                cd.XuatThongTin();
            }
        } else {
            System.out.println("Không tìm thấy nhân sự có tên là " + ten);
        }
    }
}
