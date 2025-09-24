package slot5.StudentManagement;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        int choice;
        System.out.print("Enter the number of students: ");
        n = sc.nextInt();
        StudentManager stu = new StudentManager(n);
        stu.inputStudent();
        do {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Display the list of students");
            System.out.println("2. Sort descending students of their average score");
            System.out.println("3. Search students have average score greater than X");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    stu.displayStudent();
                    break;
                case 2:
                    System.out.println("\nList students after sorting: ");
                    stu.sortDescendingAvg();
                    stu.displayStudent();
                    break;
                case 3:
                    double x;
                    System.out.print("Enter the score X: ");
                    x = sc.nextDouble();
                    stu.getStuGtX(x);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        } while (choice != 4);
    }
}
