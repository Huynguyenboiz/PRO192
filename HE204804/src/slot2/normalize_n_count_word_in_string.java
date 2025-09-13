package slot2;

import java.util.Scanner;

public class normalize_n_count_word_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine().trim();
        String normalized = input.replaceAll("\\s+", " ");
        if (normalized.isEmpty()) {
            System.out.println("Normalized string: ");
            System.out.println("Number of words: 0");
        } else {
            String[] words = normalized.split(" ");
            System.out.println("Normalized string: " + normalized);
            System.out.println("Number of words: " + words.length);
        }
        sc.close();
    }
}
