package slot6.Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter designer: ");
        String designer = sc.nextLine();
        System.out.print("Enter power: ");
        int power = sc.nextInt();
        Engine engine = new Engine(designer, power);
        System.out.println("1. Test getDesigner()");
        System.out.println("2. Test setPower()");
        System.out.println("3. Test toString()");
        System.out.println("Enter TC (1, 2 or 3): ");
        int tc = sc.nextInt();
        switch (tc) {
            case 1:
                System.out.println("OUTPUT:");
                System.out.println(engine.getDesigner());
                break;
            case 2:
                System.out.print("Enter new power: ");
                int newPower = sc.nextInt();
                engine.setPower(newPower);
                System.out.println("OUTPUT:");
                System.out.println(engine.getPower());
                break;
            case 3:
                System.out.println("OUTPUT:");
                System.out.println(engine.toString());
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        sc.close();
    }
}
