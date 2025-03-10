// Program to print the Fibonacci series up to n terms
// The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
// Each term is the sum of the two preceding ones
// The first two terms of the Fibonacci sequence are 0 followed by 1
// The first 10 Fibonacci numbers are: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
// The 10th Fibonacci number is 34
// The sum of the first 10 Fibonacci numbers is 88
// The average of the first 10 Fibonacci numbers is 8.8

public class Fibbonacci {
    public static void main(String[] args) {
        int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
