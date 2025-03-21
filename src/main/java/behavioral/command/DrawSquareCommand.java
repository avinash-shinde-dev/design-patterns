package behavioral.command;

public class DrawSquareCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Drawing the square ...");
    }
}
