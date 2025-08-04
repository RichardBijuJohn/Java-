package Tutorial2;
import java.util.Scanner;
public class operator {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        float result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1/num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error!!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }
    }
}

