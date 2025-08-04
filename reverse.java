import java.util.Scanner;
public class reverse {
    public static void main(String[] arg){
        Scanner r= new Scanner(System.in);
        System.out.println("Enter a number less than 11 digits:");
        int number= r.nextInt();
        int reverse=0;
        for (int t = number; t != 0; t /= 10) {
            int digit = t % 10;
            reverse = reverse * 10 + digit;
        }
        System.out.println("Reversed number: " + reverse);

    }
}
