package T5;
import java.util.Vector;

public class fruits {
    public static void main(String[] args) {
        Vector<String> Fruits = new Vector<>();
        Fruits.add("Apple");
        Fruits.add("Orange");
        Fruits.add("Mango");
        Fruits.add("Watermelons");
        Fruits.add("Banana");

        System.out.println("List of Fruits:");
        for (String fruit : Fruits) {
            System.out.println(fruit);
        }
    }
}


