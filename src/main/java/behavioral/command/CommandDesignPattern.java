package behavioral.command;

public class CommandDesignPattern {
    public static void main(String[] args) {

        /**
         * Command Design pattern decouples the sender of a request from the object
         * that performs the action, providing a way to encapsulate the request as an
         * object and allowing for the execution of complex operations.
         *
         * we decouple the invoker from the concrete action performed.
         * this allows greater flexibility and extensibility.
         * New concrete implementation can be easily added without modifying the existing
         * code, simply by creating the new command object and registering it with
         * the invoker.
         *
         * Applications:
         *   - Sketch board
         *   - Remote
         */
        Command circleCommand = new DrawCircleCommand();
        SketchBoard sketchBoard = new SketchBoard(circleCommand);
        sketchBoard.drawShape();

        Command squareCommand = new DrawSquareCommand();
        SketchBoard sketchBoard2 = new SketchBoard(squareCommand);
        sketchBoard2.drawShape();
    }
}
