package T7;
import java.util.Scanner;
class Students {
    String name,course;
    int rollNo;
    void set(String n, int r, String c) {
        name = n;
        rollNo = r;
        course = c;
    }
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Course : " + course);
    }
}
class StudentAccount extends Students {
    double collegeFee;
    void setCollegeFee(double fee) {
        collegeFee = fee;
    }
    void displayCollegeFee() {
        System.out.println("College Fee: " + collegeFee);
    }
}
class Hosteller extends StudentAccount {
    double hostelFee, messFee;
    void setHostelDetails(double h, double m) {
        hostelFee = h;
        messFee = m;
    }
    void displayHostelDetails() {
        super.display();
        super.displayCollegeFee();
        System.out.println("Hostel Fee: " + hostelFee);
        System.out.println("Mess Fee: " + messFee);
        double total = collegeFee + hostelFee + messFee;
        System.out.println("Total Fee  : " + total);
    }
}
class DayScholar extends StudentAccount {
    double busFee;
    void setDayScholarDetails(double b) {
        busFee = b;
    }
    void displayDayScholarDetails() {
        super.display();
        super.displayCollegeFee();
        System.out.println("Bus Fee: " + busFee);
        double total = collegeFee + busFee;
        System.out.println("Total Fee: " + total);
    }
}
public class studentManagement{
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        Hosteller h= new Hosteller();
        DayScholar d = new DayScholar();
        System.out.println("Enter Hosteller Details:");
        System.out.print("Name: ");
        h.name = sc.nextLine();
        System.out.print("Roll No: ");
        h.rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Course: ");
        h.course = sc.nextLine();
        System.out.print("College Fee: ");
        h.collegeFee = sc.nextDouble();
        System.out.print("Hostel Fee: ");
        h.hostelFee = sc.nextDouble();
        System.out.print("Mess Fee: ");
        h.messFee = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Day Scholar Details:\n");
        System.out.print("Name: ");
        d.name = sc.nextLine();
        System.out.print("Roll No: ");
        d.rollNo= sc.nextInt();
        sc.nextLine();
        System.out.print("Course: ");
         d.course = sc.nextLine();
        System.out.print("College Fee: ");
        d.collegeFee = sc.nextDouble();
        System.out.print("Bus Fee: ");
         d.busFee = sc.nextDouble();
        System.out.println("\n Hosteller Details");
        h.displayHostelDetails();
        System.out.println("\n Day Scholar Details");
        d.displayDayScholarDetails();
        sc.close();
    }
}
