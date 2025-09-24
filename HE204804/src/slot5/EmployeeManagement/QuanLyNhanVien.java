package slot5.EmployeeManagement;

import java.util.Scanner;

public class QuanLyNhanVien {
    int n;
    NhanVien[] listnv;
    static Scanner sc = new Scanner(System.in);
    public QuanLyNhanVien(int n) {
        this.n = n;
        listnv = new NhanVien[n];
    }
    public void nhapDanhSach() {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1));
            listnv[i] = new NhanVien();
            listnv[i].nhapDL();
            listnv[i].tinhPhuCap();
            listnv[i].tinhTongLuong();
        }
    }
    public void hienThiDanhSach() {
        System.out.println("===== Danh sách nhân viên =====");
        System.out.printf("%-20s%-15s%-15s%-20s%-15s%-20s%n", "Họ và tên", "Giới tính", "Hệ số lương", "Chức vụ", "Phụ cấp", "Tổng lương");
        for (NhanVien nv : listnv) {
            System.out.printf("%-20s%-15s%-15.2f%-20s%-15d%-20.2f%n", 
                nv.getName(), nv.getSex(), nv.getHeSoLuong(), nv.getChucVu(), nv.getPhuCap(), nv.getTongLuong());
        }
    }
    public void timNvMaxLuong() {
        NhanVien maxluong = listnv[0];
        for (int i = 1; i < n; i++) {
            if (listnv[i].getTongLuong() > maxluong.getTongLuong()) {
                maxluong = listnv[i];
            }
        }
        System.out.println("Nhân viên có lương cao nhất là: ");
        maxluong.hienThi();
    }
    public void sortDescendingSalary() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (listnv[i].getTongLuong() < listnv[j].getTongLuong()) {
                    NhanVien temp = listnv[i];
                    listnv[i] = listnv[j];
                    listnv[j] = temp;
                }
            }
        }
    }
    public void retireEmployee() {
        for (int i = 0; i < n; i++) {
            if (listnv[i].getSex().equalsIgnoreCase("Nam") && listnv[i].getAge() >= 55) {
                System.out.println("Nhân viên nam về hưu: ");
                listnv[i].hienThi();
            } else if (listnv[i].getSex().equalsIgnoreCase("Nữ") && listnv[i].getAge() >= 50) {
                System.out.println("Nhân viên nữ về hưu: ");
                listnv[i].hienThi();
            }
        }
        sc.close();
    }
}
