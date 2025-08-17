package T8;
class Bird {
    void fly() {
        System.out.println("Birds can fly.");
    }
}
class Sparrow extends Bird {
    void fly() {
        System.out.println("Sparrow flies short distances.");
    }
}
class Eagle extends Bird {
    void fly() {
        System.out.println("Eagle soars high in the sky.");
    }
}
public class Birdss{
    public static void main(String[] arg) {
        Bird[] b = new Bird[3];
        b[0] = new Bird();
        b[1] = new Sparrow();
        b[2] = new Eagle();
        for (Bird br : b) {
            br.fly();
        }
    }
}

