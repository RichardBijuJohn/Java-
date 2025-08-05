package T5;
import java.util.Vector;
public class sumvectors {
    public static void main(String[] args) {
        Vector<Integer> num = new Vector<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        int sum = 0;
        for (int number : num) {
            sum += number;
        }
        System.out.println("Sum of all elements in the Vector: " + sum);
    }
}

