package AA;

import java.util.Scanner;

class SinhVien extends CongDan {
    private String mssv;
    private String monHoc;
    private double diemTrungBinhMonHoc;

    @Override
    public void NhapDuLieu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập MSSV:");
        mssv = scanner.nextLine();
        System.out.println("Nhập họ tên:");
        hoTen = scanner.nextLine();
        System.out.println("Nhập năm sinh:");
        namSinh = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập môn học:");
        monHoc = scanner.nextLine();
        System.out.println("Nhập điểm trung bình môn học:");
        diemTrungBinhMonHoc = scanner.nextDouble();
    }

    @Override
    public void XuatThongTin() {
        System.out.println("Thông tin sinh viên:");
        System.out.println("MSSV: " + mssv);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Môn học: " + monHoc);
        System.out.println("Điểm trung bình môn học: " + diemTrungBinhMonHoc);
    }

    public String DanhGiaKetQuaHocTap() {
        if (diemTrungBinhMonHoc < 4.0) {
            return "Học lại";
        } else {
            return "Xuất sắc qua môn";
        }
    }
}

