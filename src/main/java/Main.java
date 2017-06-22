import simple.Cesar;

public class Main {

    public static void main(String[] args) {
        new Cesar().encryption("wiki", 6);
        new Cesar().desencryption(new Cesar().encryption("wiki", 20));
    }
}
