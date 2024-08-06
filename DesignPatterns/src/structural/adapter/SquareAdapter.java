package structural.adapter;

public class SquareAdapter implements Shape {
    Square square;

    public SquareAdapter(Square square) {
        this.square = square;
    }

    @Override
    public void draw() {
        this.square.drawSquare();
    }
}

