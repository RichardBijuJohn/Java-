import java.util.Scanner;
public class evenorodd {
    public static void main(String[] arg) {
        Scanner e = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = e.nextInt();
        if (number%2==0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}