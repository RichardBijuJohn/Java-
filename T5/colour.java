package T5;
import java.util.Vector;
public class colour {
    public static void main(String[] arg) {
        Vector<String> colors = new Vector<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.remove("Green");
        System.out.println("Colors in the Vector:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

