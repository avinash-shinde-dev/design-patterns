package behavioral.command;

public class DrawRectangleCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Drawing the rectangle");
    }
}
