import java.util.Scanner;
class employee
{
    String name,address;
    int age,mob;
    float sal;
    void print_Salary()
    {
        System.out.print(sal);
    }
}
class officer extends employee
{
    String spl;
    void print_Specialization()
    {
        System.out.println("Officer's name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Address:"+address);
        System.out.println("PhoneNumber:"+mob);
        System.out.println("Specialization:"+spl);
    }
}
class manager extends employee
{
    String dep;
    void print_Dept() {
        System.out.println("\nManager's name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Address:"+address);
        System.out.println("Phone Number:"+mob);
        System.out.println("Department:"+dep);
    }
}
public class inheritance {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        officer of=new officer();
        manager man=new manager();
        System.out.print("Enter the officer's name\n");
        of.name=sc.next();
        System.out.println("Enter Address:\n");
        of.address=sc.next();
        System.out.print("Enter Specialization: \n");
        of.spl=sc.next();
        System.out.println("Enter Age:\n");
        of.age=sc.nextInt();
        System.out.print("Enter Phone Number:\n");
        of.mob=sc.nextInt();
        System.out.println("Enter Salary:\n");
        of.sal=sc.nextFloat();
        System.out.print("Enter the manager's Detail\n");
        System.out.print("Enter the manager's name:\n");
        man.name=sc.next();
        System.out.println("Enter Address:\n");
        man.address=sc.next();
        System.out.print("Enter Department\n");
        man.dep=sc.next();
        System.out.println("Enter Age:\n");
        man.age=sc.nextInt();
        System.out.print("Enter PhoneNumber:\n");
        man.mob=sc.nextInt();
        System.out.println("Enter Salary:\n");
        man.sal=sc.nextFloat();
        System.out.println("\nOFFICER DETAILS:");

        of.print_Specialization();
        System.out.print("Salary:=");
        of.print_Salary();
        System.out.println();
        System.out.println("\nMANAGERS DETAILS:");

        man.print_Dept();
        System.out.print("Salary:=");
        man.print_Salary();
    }
}
