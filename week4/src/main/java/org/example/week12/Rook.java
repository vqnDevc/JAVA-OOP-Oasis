//package org.example.week12;

public class Rook extends Piece {

    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    /**
     *  can move.
     * @param board Board
     * @param x x
     * @param y y
     * @return boolean
     */
    @Override
    public boolean canMove(Board board, int x, int y) {

        int currentX = this.getCoordinatesX();
        int currentY = this.getCoordinatesY();


        if (x != currentX && y != currentY) {
            return false;
        }


        if (x != currentX) {
            int direction = Integer.compare(x, currentX);
            for (int i = currentX + direction; i != x; i += direction) {
                if (board.getAt(i, y) != null) {
                    return false;
                }
            }
        } else {
            int direction = Integer.compare(y, currentY);
            for (int i = currentY + direction; i != y; i += direction) {
                if (board.getAt(x, i) != null) {
                    return false;
                }
            }
        }


        Piece targetPiece = board.getAt(x, y);
        return targetPiece == null || !targetPiece.getColor().equals(this.getColor());
    }

}
