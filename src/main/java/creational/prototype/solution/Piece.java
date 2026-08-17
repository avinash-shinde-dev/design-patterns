package creational.prototype.solution;

public record Piece(String colour, int position) implements Prototype<Piece>{

    @Override
    public Piece clone() {
        return new Piece(colour, position);
    }
}