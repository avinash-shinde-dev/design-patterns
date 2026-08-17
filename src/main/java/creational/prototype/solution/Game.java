package creational.prototype.solution;


public class Game {
    public static void main(String[] args) {
        Board board = new Board();
        board.addPiece(new Piece("White", 2));
        board.addPiece(new Piece("Black", 5));
        board.addPiece(new Piece("Red", 3));

        board.showBoardState();

        System.out.println("Add checkpoint");

        Board copiedBoard = board.clone();
        copiedBoard.showBoardState();
    }
}
