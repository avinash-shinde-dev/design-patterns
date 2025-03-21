package behavioral.command;

public class SketchBoard {
    private Command command;
    public SketchBoard(Command command){
        this.command = command;
    }

    public void drawShape(){
        this.command.execute();
    }
}
