package T2;
import java.util.Scanner;
class studentData{
    String name;
    int age;
    void display(){
        System.out.println("\n Student Data");
        System.out.println("Name:"+ name);
        System.out.println("Age:"+ age);
    }
}
public class student{
    public static void main(String[] arg){
        Scanner s= new Scanner(System.in);
        studentData sc=new studentData();
        System.out.println("Enter the name:");
        sc.name=s.nextLine();
        System.out.println("Enter age:");
        sc.age=s.nextInt();
        sc.display();
    }
}
