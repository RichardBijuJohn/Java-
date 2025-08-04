package Tutorial2;
import java.util.Scanner;
public class fibbonacci {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);

        System.out.print("Enter the Fibonacci series limit: ");
        int n = f.nextInt();
        int n1=0, n2=1;
        System.out.println("The fibonacci series of " +n+ " is:");
        for(int i=0;i<n;i++){
            System.out.print(n1 + " ");
            int temp=n1+n2;
            n1=n2;
            n2=temp;
        }
    }
}
