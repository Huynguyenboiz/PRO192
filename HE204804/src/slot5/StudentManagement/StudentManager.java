package slot5.StudentManagement;

import java.util.Scanner;

public class StudentManager {
    Scanner sc = new Scanner(System.in);
    Student[] listStu;
    int n;
    public StudentManager(int n) {
        this.n = n;
        listStu = new Student[n];
    }
    public void inputStudent() {
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the student's info [%d]: \n", i + 1);
            listStu[i] = new Student();
            listStu[i].inputData();
            listStu[i].calAverage();
        }
    }
    public void displayStudent() {
        System.out.println("\n=== The students's information ===");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%n",
                "Full name", "Class name", "Math Score",
                "Physics Score", "Chemistry Score", "Average Score");
        for (Student stu : listStu) {
            System.out.printf("%-20s%-20s%-20.2f%-20.2f%-20.2f%-20.2f%n",
                    stu.getName(), stu.getClassname(),
                    stu.getMath_score(), stu.getPhysics_score(),
                    stu.getChemistry_score(),stu.getAverage_score());
        }
    }
    public void sortDescendingAvg() {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (listStu[i].getAverage_score() < listStu[j].getAverage_score()) {
                    Student temp = listStu[i];
                    listStu[i] = listStu[j];
                    listStu[j] = temp;
                }
            }
        }
    }
    public void getStuGtX(double x) {
        int found = 0;
        System.out.printf("%n=== List of students with an average score >= %.2f ===%n", x);
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%n",
                "Full name", "Class name", "Math Score",
                "Physics Score", "Chemistry Score", "Average Score");
        for (Student stu : listStu) {
            if (stu.getAverage_score() >= x) {
                System.out.printf("%-20s%-20s%-20.2f%-20.2f%-20.2f%-20.2f%n",
                        stu.getName(), stu.getClassname(),
                        stu.getMath_score(), stu.getPhysics_score(),
                        stu.getChemistry_score(), stu.getAverage_score());
                found = 1;
            }
        }
        if (found != 1) {
            System.out.println("No students found with an average score greater than or equal to " + x);
        }
    }
}
