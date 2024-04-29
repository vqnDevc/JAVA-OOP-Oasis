//package org.example.week12;

import java.util.ArrayList;

/**
 * Represents a chess board with pieces.
 */
public class Board {
    /**
     * The width of the board.
     */
    public static final int WIDTH = 8;
    /**
     * The height of the board.
     */
    public static final int HEIGHT = 8;

    private ArrayList<Piece> pieces;

    /**
     * Constructs a new Board object.
     */
    public Board() {
        pieces = new ArrayList<>();
    }

    /**
     * Adds a piece to the board if the position is valid and not occupied.
     *
     * @param piece The piece to add.
     */
    public void addPiece(Piece piece) {
        int x = piece.getCoordinatesX();
        int y = piece.getCoordinatesY();

        if (validate(x, y) && getAt(x, y) == null) {
            pieces.add(piece);
        }
    }

    /**
     * Validates if the given coordinates are within the board boundaries.
     *
     * @param x The x-coordinate.
     * @param y The y-coordinate.
     * @return True if the coordinates are within bounds, otherwise false.
     */
    public boolean validate(int x, int y) {
        return (x >= 1 && x <= WIDTH && y >= 1 && y <= HEIGHT);
    }

    /**
     * Removes the piece at the specified position.
     *
     * @param x The x-coordinate of the position.
     * @param y The y-coordinate of the position.
     */
    public void removeAt(int x, int y) {
        Piece piece = getAt(x, y);
        if (piece != null) {
            pieces.remove(piece);
        }
    }

    /**
     * Gets the piece at the specified position.
     *
     * @param x The x-coordinate of the position.
     * @param y The y-coordinate of the position.
     * @return The piece at the specified position, or null if no piece is found.
     */
    public Piece getAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                return piece;
            }
        }
        return null;
    }

    /**
     * Gets the list of pieces on the board.
     *
     * @return The list of pieces on the board.
     */
    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    /**
     * Sets the list of pieces on the board.
     *
     * @param pieces The list of pieces to set.
     */
    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}
