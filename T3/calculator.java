package T3;
import java.util.Scanner;
class MyCalculator{
    double num1;
    double num2;

    MyCalculator(double n1,double n2){
        num1=n1;
        num2=n2;
    }

    double add() {
        return num1+num2;
    }
    double substract() {
        return num1-num2;
    }
    double multiply() {
        return num1*num2;
    }
    double divide() {
            return num1/num2;
    }
}

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char n = 'Y';

        while (n == 'Y' || n == 'y') {
            System.out.println("1:add\n2:substarct\n3:multiply\n4:divide");
            System.out.print("Enter the choice(1-4): ");
            int c = sc.nextInt();
            if (c < 1 || c > 4) {
                System.out.println("Invalid choice enter a correct operator once again!\n");
            } else {
                System.out.println("Enter two numbers:");
                double num1 = sc.nextInt();
                double num2 = sc.nextInt();
                MyCalculator ans = new MyCalculator(num1, num2);
                switch (c) {
                    case 1:
                        System.out.println(ans.add());
                        break;
                    case 2:
                        System.out.println(ans.substract());
                        break;
                    case 3:
                        System.out.println(ans.multiply());
                        break;
                    case 4:
                        if (num2 == 0)
                            System.out.println("Cannot divide by zero.");
                        else
                            System.out.println("Result: " + ans.divide());
                        break;

                }
                System.out.println("Do you want to continue(Y/N): ");
                n = sc.next().charAt(0);


            }

        }
    }
}
