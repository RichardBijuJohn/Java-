import java.util.Scanner;
public class leapyear {
    public static void main(String[] arg){
        Scanner l= new Scanner(System.in);
        System.out.println("Enter a year to check if it is a leap year or not:");
        int year= l.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
