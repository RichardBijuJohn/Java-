package T5;
import java.util.Vector;
import java.util.Scanner;
public class search{
    public static void main(String[] args) {
        Vector<String> t = new Vector<>();
        t.add("Pen");
        t.add("Notebook");
        t.add("Eraser");
        t.add("Marker");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the item name to search: ");
        String srch = sc.nextLine();
        if (t.contains(srch)) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }
        sc.close();
    }
}
