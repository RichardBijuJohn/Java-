package T5;
import java.util.Vector;
public class largestinVector {
    public static void main(String[] arg) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(25);
        numbers.add(60);
        numbers.add(15);
        numbers.add(80);
        numbers.add(45);
        int max = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("The largest number in the Vector is: "+ max);
    }
}

