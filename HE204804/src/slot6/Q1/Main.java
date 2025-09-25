package slot6.Q1;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int[] arr;

    public static void inputData() {
        int n;
        do {
            System.out.print("Enter the number of elements: ");
            n = sc.nextInt();
        } while (n <= 0);

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Enter element " + (i + 1) + " (1-20): ");
                arr[i] = sc.nextInt();
            } while (arr[i] < 1 || arr[i] > 20);
        }
    }

    public static void displayData(String msg) {
        System.out.println(msg);
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static int find2ndPosMax() {
        if (arr.length < 2) return -1;
        int max = -9999999;
        for (int x : arr) {
            if (x > max) max = x;
        }
        int pos = -1;
        boolean foundFirst = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                if (!foundFirst) {
                    foundFirst = true;
                } else {
                    pos = i;
                    break;
                }
            }
        }
        return pos;
    }

    public static void sort() {
        int pos = find2ndPosMax();
        if (pos == -1) pos = arr.length;
        for (int i = 0; i < pos; i++) {
            for (int j = i + 1; j < pos; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i = pos; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static void removeDuplicate() {
        int[] newArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDup = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == newArr[k]) {
                    isDup = true;
                    break;
                }
            }
            if (!isDup) {
                newArr[j] = arr[i];
                j++;
            }
        }
        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = newArr[i];
        }
        arr = result;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void displayAllPrimeNumbers() {
        System.out.println("Prime numbers in array:");
        for (int x : arr) {
            if (isPrime(x)) System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        inputData();
        displayData("Array:");
        int pos2ndMax = find2ndPosMax();
        if (pos2ndMax == -1)
            System.out.println("No second position of the largest value found.");
        else
            System.out.println("Second position of the largest value: " + pos2ndMax);
        sort();
        displayData("Array after sort:");
        removeDuplicate();
        displayData("Array after remove duplicates:");
        displayAllPrimeNumbers();
    }
}

