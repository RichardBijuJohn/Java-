public class prime {
    public static void main(String[] arg) {
        System.out.println("Prime num between 1 to 100 are:");
        for (int num = 2; num <= 100; num++) {
            boolean Prime = true;
            for (int i = 2; i <num; i++) {
                if (num % i == 0) {
                    Prime = false;
                    break;
                }
            }
            if (Prime) {
                System.out.print(num+" ");
            }
        }

    }
}
