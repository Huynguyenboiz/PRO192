package slot2;

import java.util.Scanner;

public class Count_odd_n_even_in_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sequence of integers: ");
        String input = sc.nextLine();
        String[] parts = input.trim().split("\\s+");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Count of odd numbers: " + oddCount);
        System.out.println("Count of even numbers: " + evenCount);
        sc.close();
    }
}
