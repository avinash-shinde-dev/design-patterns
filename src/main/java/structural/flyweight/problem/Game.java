package structural.flyweight.problem;

public class Game {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Bullet bullet = new Bullet("Red", i*10, i*12, 5);
        }

        for (int i = 0; i < 5; i++) {
            Bullet bullet = new Bullet("green", i*10, i*12, 5);
        }

        // Memory footprint?
    }
}
