package org.example.week7;

/**
 * The Shape class represents a geometric shape with a color and fill status.
 * This class is abstract and cannot be instantiated directly.
 * Subclasses must implement the getArea() and getPerimeter() methods.
 */
public abstract class Shape {
    /** The color of the shape. */
    protected String color;

    /** Whether the shape is filled. */
    protected boolean filled;

    /**
     * Constructs a new Shape with default color and fill status.
     */
    public Shape() {
        this.color = "";
        this.filled = false;
    }

    /**
     * Constructs a new Shape with the specified color and fill status.
     *
     * @param color The color of the shape.
     * @param filled Whether the shape is filled.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Returns the color of the shape.
     *
     * @return The color of the shape.
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the shape.
     *
     * @param color The color to set.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns whether the shape is filled.
     *
     * @return true if the shape is filled, false otherwise.
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Sets whether the shape is filled.
     *
     * @param filled true to fill the shape, false otherwise.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Abstract method to calculate the area of the shape.
     * Subclasses must implement this method.
     *
     * @return The area of the shape.
     */
    public abstract double getArea();

    /**
     * Abstract method to calculate the perimeter of the shape.
     * Subclasses must implement this method.
     *
     * @return The perimeter of the shape.
     */
    public abstract double getPerimeter();

    /**
     * Returns a string representation of the shape.
     *
     * @return A string representation of the shape.
     */
    @Override
    public String toString() {
        return "Shape[" + "color=" + color + ",filled=" + filled + "]";
    }
}
