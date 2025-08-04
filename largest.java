import java.util.Scanner;
public class largest {
    public static void main(String[] arg){
        Scanner l=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=l.nextInt();
        int[] numbers =new int[n];
        System.out.println("Enter" +n+ "numbers:");
        for(int i=0;i<n;i++){
            numbers[i]=l.nextInt();
        }
        int largest=numbers[0];
        for(int i=1;i<n;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        System.out.println("The Largest number is " +largest);
    }
}


