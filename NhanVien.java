package AA;

import java.util.Scanner;

class NhanVien extends CongDan {
    private String msnv;
    private double luongCanBan;
    private double phuCap;

    @Override
    public void NhapDuLieu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập MSNV:");
        msnv = scanner.nextLine();
        System.out.println("Nhập họ tên:");
        hoTen = scanner.nextLine();
        System.out.println("Nhập năm sinh:");
        namSinh = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Nhập lương cơ bản:");
        luongCanBan = scanner.nextDouble();
        System.out.println("Nhập phụ cấp:");
        phuCap = scanner.nextDouble();
    }

    @Override
    public void XuatThongTin() {
        System.out.println("Thông tin nhân viên:");
        System.out.println("MSNV: " + msnv);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Lương cơ bản: " + luongCanBan);
        System.out.println("Phụ cấp: " + phuCap);
    }

    public String TinhLuong() {
        double luongThucNhan = luongCanBan + phuCap;
        return "Lương thực nhận: " + luongThucNhan;
    }
}
