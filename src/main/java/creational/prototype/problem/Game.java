package creational.prototype.problem;

public class Game {
    public static void main(String[] args) {
        //Problem Statement:
        /**
         *  Consider a board game where you need to save the current state of the game at
         *  the various checkpoints. Instead of manually creating new board objects and copying
         *  all the pieces or their states ( which could be costly if the board is large and has
         *  many game pieces), we can use prototype pattern to clone the board

         *  Prototype is a creational design pattern that lets you copy existing objects without making your
         *  code dependent on their classes.
         */

          Board board = new Board();
          board.addPiece(new Piece("White", 2));
          board.addPiece(new Piece("Black", 5));
          board.addPiece(new Piece("Red", 3));

          board.showBoardState();

         System.out.println("Add checkpoint");
          // Checkpoint the state
          Board copiedBoard = new Board();
          for (Piece piece: board.getPieces()){
              copiedBoard.addPiece(new Piece(piece.colour(), piece.position()));
          }
          copiedBoard.showBoardState();

          // Problems:
          // If there are any changes in the board or piece, will affect the client
          // client just needs the copy of board or piece makes it less flexible
          // Why client should be responsible to create the copy  ?

          // 2. Board and Piece are tightly coupled with Client


    }
}
