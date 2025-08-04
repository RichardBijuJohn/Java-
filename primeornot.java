import java.util.Scanner;
public class primeornot {
    public static void main(String[] arg) {
        Scanner p = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = p.nextInt();
        boolean prime = true;
        if (num <=1)
            prime = false;
        else {
            for (int i = 2; i <num; i++) {
                if (num%i == 0) {
                    prime = false;
                    break;
                }
            }

        }
        if (prime)
            System.out.println("The number is prime");
        else
            System.out.println("The number is not prime");

    }
}