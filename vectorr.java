import java.util.Vector; 
public class SimpleVectorProgram {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.addElement("Grape");
        System.out.println("Fruits in the Vector: " + fruits);
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);
        int numberOfFruits = fruits.size();
        System.out.println("Number of fruits: " + numberOfFruits);
        fruits.remove("Banana");
        System.out.println("Fruits after removing Banana: " + fruits);
        System.out.println("Iterating through fruits:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
    }
}
