import java.util.Scanner;
public class fibonacci {
    public static void main(String[] arg){
        Scanner f = new Scanner(System.in);
        System.out.println("Enter a limit:");
        int limit= f.nextInt();
      int a=0,b=1;
      System.out.println("Fibonacci series of\t"+limit);
      while(a<=limit){
          System.out.print(a);
          b = a + b;
          a = b - a;
      }
      }
    }

