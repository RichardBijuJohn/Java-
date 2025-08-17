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
public class BirdDemo {
    public static void main(String[] args) {
        Bird[] birds = new Bird[3];
        birds[0] = new Bird();
        birds[1] = new Sparrow();
        birds[2] = new Eagle();
        for (Bird b : birds) {
            b.fly(); 
    }
}
}
