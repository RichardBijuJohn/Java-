package Tutorial2;
import java.util.Scanner;
public class vowel {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a alphabet:");
        char l= sc.next().charAt(0);
        switch (l){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("The entered character\t"+l+" is vowel");
                break;
            default:
                System.out.println("The entered character "+l+" is consonant");
        }
    }
}
