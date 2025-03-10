// Description: A program that checks if a string is a palindrome or not.
// Palindrome is a word, phrase, or sequence that reads the same backward as forward (ignoring spaces, cases, and punctuation).

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        System.out.println("Enter a string");
        String input = sc.nextLine();

        // Clean the input string
        String cleanedStr = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the string
        String reverseStr = new StringBuilder(cleanedStr).reverse().toString();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome");
        }
        else
        {
            System.out.println("The string is not a palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverseStr = new StringBuilder(cleanedStr).reverse().toString();
        return cleanedStr.equals(reverseStr);
    }
}
