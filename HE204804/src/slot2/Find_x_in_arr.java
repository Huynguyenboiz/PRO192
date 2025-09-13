package slot2;

import java.util.Scanner;

public class Find_x_in_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sequence of real numbers: ");
        String input = sc.nextLine();
        String[] parts = input.trim().split("\\s+");
        double[] arr = new double[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Double.parseDouble(parts[i]);
        }
        System.out.println("Enter the number to find: ");
        double x = sc.nextDouble();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            double value = arr[i];
            if (value == x) {
                count++;
            }
        }
        System.out.println(x + " appears " + count + " times in the array.");
        sc.close();
    }

}
