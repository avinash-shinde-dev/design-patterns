package structural.flyweight.solution;

public class Bullet {
    private BulletType bulletType;
    private int x, y; // extrinsic
    private int velocity; // extrinsic

    public Bullet(String colour, int x, int y, int velocity) {
        this.bulletType = BulletTypeFactory.getBulletType(colour);
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        System.out.println(this);
    }



    @Override
    public String toString() {
        return "Bullet{" +
                "x=" + x +
                ", y=" + y +
                ", velocity=" + velocity +
                '}';
    }
}
