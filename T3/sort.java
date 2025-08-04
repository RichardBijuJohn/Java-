package T3;
import java.util.Arrays;
import java.util.Scanner;
public class sort {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] array= new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i=0;i<n;i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("The sorted array is ");
        for(int sorted: array){
            System.out.print(sorted + " ");
        }
    }
}
