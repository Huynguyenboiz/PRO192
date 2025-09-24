package slot5.StudentManagement;

import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    private String name;
    private String classname;
    private double math_score;
    private double physics_score;
    private double chemistry_score;
    private double average_score;
    public Student(String name, String classname, double math_score, double physics_score, double chemistry_score) {
        this.name = name;
        this.classname = classname;
        this.math_score = math_score;
        this.physics_score = physics_score;
        this.chemistry_score = chemistry_score;
    }
    public Student() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClassname() {
        return classname;
    }
    public void setClassname(String classname) {
        this.classname = classname;
    }
    public double getMath_score() {
        return math_score;
    }
    public void setMath_score(double math_score) {
        this.math_score = math_score;
    }
    public double getPhysics_score() {
        return physics_score;
    }
    public void setPhysics_score(double physics_score) {
        this.physics_score = physics_score;
    }
    public double getChemistry_score() {
        return chemistry_score;
    }
    public void setChemistry_score(double chemistry_score) {
        this.chemistry_score = chemistry_score;
    }
    public double getAverage_score() {
        return average_score;
    }
    public void setAverage_score(double average_score) {
        this.average_score = average_score;
    }
    public void inputData() {
        // System.out.println("=== Enter student information ===");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Class name: ");
        classname = sc.nextLine();
        System.out.print("Math score: ");
        math_score = sc.nextDouble();
        System.out.print("Physics score: ");
        physics_score = sc.nextDouble();
        System.out.print("Chemistry score: ");
        chemistry_score = sc.nextDouble();
        sc.nextLine();
    }
    public void displayData() {
        System.out.println("=== Student information ===");
        System.out.println("Name: " + name);
        System.out.println("Class name: " + classname);
        System.out.println("Math score: " + math_score);
        System.out.println("Physics score: " + physics_score);
        System.out.println("Chemistry score: " + chemistry_score);
        System.out.println("Average score: " + average_score);
    }
    public double calAverage() {
        average_score = (math_score + physics_score + chemistry_score) / 3;
        return average_score;
    }
}
