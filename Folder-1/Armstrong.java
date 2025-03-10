// Armstrong number is a number that is equal to the sum of cubes of its digits.
// For example, 153 is an Armstrong number because 153 = 1^3 + 5^3 + 3^3.
// Write a program to check if a number is an Armstrong number or not.
// The program should take an integer as input and print whether the number is Armstrong or not.

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner am = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = am.nextInt();
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        am.close();
    }
}