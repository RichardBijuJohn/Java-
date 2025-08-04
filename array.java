import java.util.Scanner;
public class array {
    public static void main(String[] arg){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=a.nextInt();
        int[] numbers =new int[n];
        int sum=0;
        System.out.println("Enter" +n+ "numbers:");
        for(int i=0;i<n;i++){
            numbers[i]=a.nextInt();
            sum+=numbers[i];
        }
            System.out.println("The sum is " +sum);
        }
    }

