public class factorial{
    public static void main(String[] arg){
        int number=10,fact=1,a=1;
        while(a <= number){
            fact*=a;
            a++;
        }
        System.out.println("The factorial of \t" +number+ "\tis\t"+fact);
    }
}
