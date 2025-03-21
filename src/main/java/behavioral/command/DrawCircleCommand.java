package behavioral.command;

public class DrawCircleCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Drawing the circle ...");
    }
}
