package creational.prototype.problem;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final List<Piece> pieces = new ArrayList<>();

    public void addPiece(Piece piece){
        pieces.add(piece);
    }

    public List<Piece> getPieces() {
        return this.pieces;
    }

    public void showBoardState(){
        System.out.println("Current Board State");
        for(Piece piece : pieces){
            System.out.println(piece);
        }
    }
}
