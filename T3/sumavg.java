package T3;
import java.util.Scanner;
public class sumavg {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        float avg = sum / n;
        System.out.println("\nSum of the array elements: " + sum);
        System.out.println("Average of the array elements: " + avg);
        sc.close();
    }
}
