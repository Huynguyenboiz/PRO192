package slot2;

import java.util.Scanner;

public class Find_smallest_and_itspos_in_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sequence of real numbers: ");
        String input = sc.nextLine();
        String[] parts = input.trim().split("\\s+");
        double[] arr = new double[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Double.parseDouble(parts[i]);
        }
        double smallest = arr[0];
        int position = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                position = i;
            }
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Position: " + position);
        sc.close();
    }
}
