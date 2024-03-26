package org.example.week7;

import java.awt.*;

/**
 * The Shape class represents a geometric shape with a color and fill status.
 * This class is abstract and cannot be instantiated directly.
 * Subclasses must implement the getArea() and getPerimeter() methods.
 */
public abstract class Shape {
    protected double velocityX;
    protected double velocityY;
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
        this.setVelocityX(5);
        this.setVelocityY(5);
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
        this.setVelocityX(5);
        this.setVelocityY(5);
    }

    public  Shape(String color, boolean filled, double velocityX, double velocityY) {
        this.color = color;
        this.filled = filled;
        this.setVelocityX(velocityX);
        this.setVelocityY(velocityY);

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

    public double getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(double velocityX) {
        this.velocityX = velocityX;
    }

    public double getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(double velocityY) {
        this.velocityY = velocityY;
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
     * Movement Function of shape.
     * @param panelWidth width
     * @param panelHeight length
     */
    public abstract void move(int panelWidth, int panelHeight);

    /**
     * Display shape in GUI.
     * @param g Graphic
     */
    public  abstract void draw(Graphics g);
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
