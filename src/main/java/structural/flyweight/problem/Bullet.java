package structural.flyweight.problem;

public class Bullet {
    private String colour; // intrinsic
    private int x, y; // extrinsic
    private int velocity; // extrinsic

    public Bullet(String colour, int x, int y, int velocity) {
        this.colour = colour;
        this.x = x;
        this.y = y;
        this.velocity = velocity;

        System.out.println(this);
    }



    @Override
    public String toString() {
        return "Bullet{" +
                "colour='" + colour + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", velocity=" + velocity +
                '}';
    }
}
