package T3;
import java.util.Scanner;
public class array {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i=0;i<n;i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("\nArray in original order:");
        for (int i=0;i<n;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nArray in reverse order:");
        for (int i=n-1;i>=0;i--) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}

