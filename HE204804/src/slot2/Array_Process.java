package slot2;
import java.util.Scanner;
public class Array_Process {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] array = new int[rows][cols];
        System.out.println("Enter array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int[] arr = new int[rows * cols];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[k] = array[i][j];
                k++;
            }
        }
        int choice;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Sort ascending");
            System.out.println("2. Print smallest and largest");
            System.out.println("3. Print even and odd numbers");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                   for (int i = 0; i < arr.length - 1; i++) {
                        int minIndex = i;
                        for (int j = i + 1; j < arr.length; j++) {
                            if (arr[j] < arr[minIndex]) {
                                minIndex = j;
                            }
                        }
                        int temp = arr[i];
                        arr[i] = arr[minIndex];
                        arr[minIndex] = temp;
                    }
                    System.out.print("Sorted array: ");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break; 
                case 2:
                    int min = arr[0], max = arr[0];
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] < min) min = arr[i];
                        if (arr[i] > max) max = arr[i];
                    }
                    System.out.println("Smallest: " + min);
                    System.out.println("Largest: " + max);
                    break;
                case 3:
                    System.out.print("Even numbers: ");
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] % 2 == 0) {
                            System.out.print(arr[i] + " ");
                        }
                    }
                    System.out.println();
                    System.out.print("Odd numbers: ");
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] % 2 != 0) {
                            System.out.print(arr[i] + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
        sc.close();
    }
}
