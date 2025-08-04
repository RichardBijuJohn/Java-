package Tutorial2;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] arg){
        Scanner p=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=p.nextInt();
        int org=num;
        int rev=0;
        while(num>0){
            int temp=num%10;
            rev=rev*10+temp;
            num=num/10;
        }
        if(org==rev)
            System.out.println("The entered number is a palindrome");
        else
            System.out.println("The entered number is not a palindrome");
    }
}
