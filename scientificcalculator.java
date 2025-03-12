import java.util.Scanner;

public class scientificcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scientific Calculator");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square Root");
        System.out.println("6. Power");
        System.out.println("7. Sine");
        System.out.println("8. Cosine");
        System.out.println("9. Tangent");
        System.out.print("Enter your choice: ");
        
        int choice = scanner.nextInt();
        double result = 0;

        switch (choice) {
            case 1:
                System.out.print("Enter two numbers: ");
                double add1 = scanner.nextDouble();
                double add2 = scanner.nextDouble();
                result = add1 + add2;
                break;
            case 2:
                System.out.print("Enter two numbers: ");
                double sub1 = scanner.nextDouble();
                double sub2 = scanner.nextDouble();
                result = sub1 - sub2;
                break;
            case 3:
                System.out.print("Enter two numbers: ");
                double mul1 = scanner.nextDouble();
                double mul2 = scanner.nextDouble();
                result = mul1 * mul2;
                break;
            case 4:
                System.out.print("Enter two numbers: ");
                double div1 = scanner.nextDouble();
                double div2 = scanner.nextDouble();
                if (div2 != 0) {
                    result = div1 / div2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            case 5:
                System.out.print("Enter a number: ");
                double sqrt = scanner.nextDouble();
                result = Math.sqrt(sqrt);
                break;
            case 6:
                System.out.print("Enter the base and exponent: ");
                double base = scanner.nextDouble();
                double exponent = scanner.nextDouble();
                result = Math.pow(base, exponent);
                break;
            case 7:
                System.out.print("Enter an angle in degrees: ");
                double angleSin = scanner.nextDouble();
                result = Math.sin(Math.toRadians(angleSin));
                break;
            case 8:
                System.out.print("Enter an angle in degrees: ");
                double angleCos = scanner.nextDouble();
                result = Math.cos(Math.toRadians(angleCos));
                break;
            case 9:
                System.out.print("Enter an angle in degrees: ");
                double angleTan = scanner.nextDouble();
                result = Math.tan(Math.toRadians(angleTan));
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("The result is: " + result);
        scanner.close();
    }
}
