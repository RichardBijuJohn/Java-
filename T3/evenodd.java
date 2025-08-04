package T3;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] array= new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i=0;i<n;i++) {
            array[i] = sc.nextInt();
        }
        int even=0,odd=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Number of even elements: " + even);
        System.out.println("Number of odd elements: " + odd);
    }
    }

