package T3;
import java.util.Scanner;
public class maxmin {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i=0;i<n;i++) {
            array[i] = sc.nextInt();
        }
        int max=array[0],min=array[0];
        for (int i=1;i<n;i++) {
            if (array[i]>max) {
                max = array[i];
            }
            if (array[i]<min) {
                min = array[i];
            }
        }
        System.out.println("\nMaximum value in the array:" + max);
        System.out.println("Minimum value in the array: " + min);
        sc.close();
    }
    }

