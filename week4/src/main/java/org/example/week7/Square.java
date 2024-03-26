package org.example.week7;

import java.util.Objects;

/**
 * The Square class represents a square shape, which is a subclass of Rectangle.
 * A square is a special type of rectangle where all sides are equal.
 */
public class Square extends Rectangle {
    /**
     * Constructs a new Square with default size (side length).
     */
    public Square() {
        super();
    }

    /**
     * Constructs a new Square with the specified size (side length).
     *
     * @param size The size (side length) of the square.
     */
    public Square(double size) {
        super(size, size);
    }

    /**
     * Constructs a new Square with the specified size (side length), color, and fill status.
     *
     * @param side The size (side length) of the square.
     * @param color The color of the square.
     * @param filled Whether the square is filled.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Square constructor.
     *
     * @param side   side
     * @param color  Shape color
     * @param filled Shape filled
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    /**
     * Returns the side length of the square.
     *
     * @return The side length of the square.
     */
    public double getSide() {
        return this.getLength();
    }

    /**
     * Sets the side length of the square.
     *
     * @param side The side length to set.
     */
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * Returns a string representation of the square.
     *
     * @return A string representation of the square.
     */
    @Override
    public String toString() {
        return String.format(
                "Square[topLeft=%s,side=%.1f,color=%s,filled=%s]",
                this.topLeft.toString(),
                this.getWidth(),
                (Objects.equals(this.color, "") ? "null" : this.color),
                this.filled
        );
    }

    /**
     * ham compare.
     * @param o obj
     * @return true false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Square square = (Square) o;
        return Math.abs(width - square.width) < 0.001
                && Objects.equals(topLeft, square.topLeft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topLeft, width);
    }
}
