package slot5.EmployeeManagement;

import java.util.Scanner;

public class NhanVien {
    Scanner sc = new Scanner(System.in);
    private String name;
    private int age;
    private String sex;
    private double heSoLuong;
    private String chucVu;
    private int phuCap;
    private double tongLuong;
    
    public NhanVien() {
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public String getChucVu() {
        return chucVu;
    }

    public int getPhuCap() {
        return phuCap;
    }

    public double getTongLuong() {
        return tongLuong;
    }

    public void nhapDL() {
        System.out.println("=== Nhập thông tin của nhân viên ===");
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        sex = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập hệ số lương: ");
        heSoLuong = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhập chức vụ (Giám đốc/Phó giám đốc/Trưởng phòng/Phó phòng/Nhân viên): ");
        chucVu = sc.nextLine();
    }
    public void hienThi() {
        System.out.println("=== Thông tin nhân viên ===");
        System.out.println("Họ và tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + sex);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Chức vụ: " + chucVu);
        System.out.println("Phụ cấp: " + phuCap + " VNĐ");
        System.out.println("Tổng lương của " + name + " là: " + tongLuong + " VNĐ");
    }
    public void tinhPhuCap() {
        switch (chucVu) {
            case "Giám đốc":
                phuCap = 500000;
                break;
            case "Phó giám đốc":
                phuCap = 300000;
                break;
            case "Trưởng phòng":
                phuCap = 200000;
                break;
            case "Phó phòng":
                phuCap = 100000;
                break;
            case "Nhân viên":
                phuCap = 50000;
                break;
            default:
                phuCap = 0;
                break;
        }
    }
    public double tinhTongLuong() {
        tongLuong = 31000 * heSoLuong + phuCap;
        return tongLuong;
    }
}
