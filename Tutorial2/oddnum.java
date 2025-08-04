package Tutorial2;
import java.util.Scanner;
public class oddnum {
   public static void main(String[] arg){
       Scanner o=new Scanner(System.in);
       System.out.println("Enter a limit:");
       int n=o.nextInt();
       System.out.println("The odd numbers until the entered limits are:");
       for(int i=0;i<n;i++){
           if(i % 2 == 0) {
               continue; // Skip even numbers
           }
           System.out.print(i +" ");
       }
   }
}
