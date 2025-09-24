package slot5.EmployeeManagement;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        int choice;
        System.out.print("Nhập số lượng nhân viên: ");
        n = sc.nextInt();
        QuanLyNhanVien qlnv = new QuanLyNhanVien(n);
        qlnv.nhapDanhSach();
        do {
            System.out.println("=== Hệ thống quản lý nhân viên ===");
            System.out.println("1. Hiển thị danh sách nhân viên");
            System.out.println("2. Tìm nhân viên có lương cao nhất");
            System.out.println("3. Sắp xếp danh sách nhân viên theo lương giảm dần");
            System.out.println("4. Hiển thị nhân viên về hưu");
            System.out.println("5. Thoát");
            System.out.print("Enter option: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nThông tin chi tiết nhân viên vừa nhập:");
                    qlnv.hienThiDanhSach();
                    break;
                case 2:
                    qlnv.timNvMaxLuong();
                    break;
                case 3:
                    System.out.println("\nDanh sách nhân viên sau khi sắp xếp theo lương giảm dần:");
                    qlnv.sortDescendingSalary();
                    qlnv.hienThiDanhSach();
                    break;
                case 4:
                    qlnv.retireEmployee();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        } while (choice != 5);
    }
}