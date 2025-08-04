import java.util.Scanner;
public class add {
    public static void main(String[] arg){
        Scanner a = new Scanner(System.in);
        System.out.println("enter the two numbers to be added:");
        int n1= a.nextInt();
        int n2= a.nextInt();
        int n3= n1+n2;
        System.out.println("The sum is\t" + n3);
    }
}
