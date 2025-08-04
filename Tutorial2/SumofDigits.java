package Tutorial2;
import java.util.Scanner;
public class SumofDigits {
    public static void main(String[] arg){
        Scanner d=new Scanner(System.in);
        System.out.println("Enter a 4 digit number:");
        int num=d.nextInt();
        int sum=0;
        while(num>0){
            int temp=num%10;
            sum+=temp;
            num=num/10;
        }
        System.out.println("The sum of the entered 4 digit number is:" +sum);
    }
}
