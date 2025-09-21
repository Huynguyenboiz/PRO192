package slot4;

import java.util.Scanner;

public class NhanVien {
    Scanner sc = new Scanner(System.in);
    private String name;
    private String sex;
    private int heSoLuong;
    private String chucVu;
    private int phuCap;
    private int tongLuong;
    public void nhapDL() {
        System.out.println("=== Nhập thông tin của nhân viên ===");
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        sex = sc.nextLine();
        System.out.print("Nhập hệ số lương: ");
        heSoLuong = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập chức vụ (Giám đốc/Phó giám đốc/Trưởng phòng/Phó phòng/Nhân viên): ");
        chucVu = sc.nextLine();
    }
    public void hienThi() {
        System.out.println("=== Thông tin nhân viên ===");
        System.out.println("Họ và tên: " + name);
        System.out.println("Giới tính: " + sex);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Chức vụ: " + chucVu);
        System.out.println("Phụ cấp: " + phuCap + " VNĐ");
        System.out.println("Tổng lương của " + name + " là: " + tongLuong + " VNĐ");
    }
    public void tinhPhuCap() {
        if (chucVu.equals("Giám đốc")) {
            phuCap = 500000;
        } else if (chucVu.equals("Phó giám đốc")) {
            phuCap = 300000;
        } else if (chucVu.equals("Trưởng phòng")) {
            phuCap = 200000;
        } else if (chucVu.equals("Phó phòng")) {
            phuCap = 100000;
        } else if (chucVu.equals("Nhân viên")) {
            phuCap = 50000;
        }
    }
    public void tinhTongLuong() {
        tongLuong = 31000 * heSoLuong + phuCap;
    }
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.nhapDL();
        nv.tinhPhuCap();
        nv.tinhTongLuong();
        nv.hienThi();
    }
}
