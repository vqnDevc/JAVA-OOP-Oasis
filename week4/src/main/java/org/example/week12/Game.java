//package org.example.week12;

import java.util.ArrayList;

public class Game {
    private Board board;
    private final ArrayList<Move> moveHistory;

    public Game(Board board) {
        this.board = board;
        moveHistory = new ArrayList<>();
    }

    /**
     * move piece.
     * @param piece Piece
     * @param x x
     * @param y y
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            Piece target = board.getAt(x, y);
            Move move;
            if (target != null) {
                move = new Move(piece.getCoordinatesX(), x,
                                piece.getCoordinatesY(), y,
                                piece, target);
                board.removeAt(x, y);
            } else {
                move = new Move(piece.getCoordinatesX(), x,
                        piece.getCoordinatesY(), y, piece);
            }
            moveHistory.add(move);
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
        }
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }
}
