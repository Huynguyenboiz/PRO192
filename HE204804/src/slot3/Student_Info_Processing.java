package slot3;

import java.util.Scanner;

public class Student_Info_Processing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rollNumber = "";
        String name = "";
        int age = 0;
        double grade = 0.0;
        try {
            System.out.print("Enter roll number (0xxx): ");
            rollNumber = sc.nextLine();
            if (!rollNumber.matches("0\\d{3}")) {
                throw new Exception("Roll Number must be 4 digits and start with 0 (ex: 0xxx).");
            }
            System.out.print("Enter name: ");
            name = sc.nextLine();
            if (!name.matches("[A-Z][a-zA-Z ]*")) {
                throw new Exception("Name must start with uppercase letter.");
            }
            System.out.print("Enter age (18-35): ");
            age = Integer.parseInt(sc.nextLine());
            if (age < 18 || age > 35) {
                throw new Exception("Age must be between 18 and 35.");
            }
            System.out.print("Enter grade (1-10): ");
            grade = Double.parseDouble(sc.nextLine());
            if (grade < 1 || grade > 10) {
                throw new Exception("Grade must be between 1 and 10.");
            }
            System.out.println("=== Student Information ===");
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Grade: " + grade);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter numeric value.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
