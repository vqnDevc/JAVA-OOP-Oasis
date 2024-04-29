//package org.example.week12;

public class Move {
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private Piece movedPiece;
    private Piece killedPiece;

    /**
     * Constructs a Move object representing a move without capturing.
     *
     * @param startX     The starting x-coordinate of the move.
     * @param endX       The ending x-coordinate of the move.
     * @param startY     The starting y-coordinate of the move.
     * @param endY       The ending y-coordinate of the move.
     * @param movedPiece The piece being moved.
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
    }

    /**
     * Constructs a Move object representing a move with capturing.
     *
     * @param startX      The starting x-coordinate of the move.
     * @param endX        The ending x-coordinate of the move.
     * @param startY      The starting y-coordinate of the move.
     * @param endY        The ending y-coordinate of the move.
     * @param movedPiece  The piece being moved.
     * @param killedPiece The piece being captured.
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece, Piece killedPiece) {
        this(startX, endX, startY, endY, movedPiece);
        this.killedPiece = killedPiece;
    }

    /**
     * Returns a string representation of the move.
     *
     * @return The string representation of the move.
     */
    @Override
    public String toString() {
        char endColumn = (char) ('a' + endX - 1);
        return movedPiece.getColor() + "-" + movedPiece.getSymbol()
                + endColumn + endY;
    }

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public Piece getMovedPiece() {
        return movedPiece;
    }

    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }

    public Piece getKilledPiece() {
        return killedPiece;
    }

    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }
}
