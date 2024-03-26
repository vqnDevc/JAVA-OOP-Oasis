package org.example.week7;

import java.awt.*;
import java.util.Objects;

/**
 * The Rectangle class represents a rectangle shape, which is a subclass of Shape.
 */
public class Rectangle extends Shape {
    protected Point topLeft;
    /** The width of the rectangle. */
    protected double width;

    /** The length of the rectangle. */
    protected double length;

    /**
     * Constructs a new Rectangle with default width and length.
     */
    public Rectangle() {
        super();
        this.width = 0;
        this.length = 0;
    }

    /**
     * Constructs a new Rectangle with the specified width and length.
     *
     * @param width The width of the rectangle.
     * @param length The length of the rectangle.
     */
    public Rectangle(double width, double length) {
        super();
        this.topLeft = new Point();
        this.width = width;
        this.length = length;
    }

    /**
     * Constructs a new Rectangle with the specified color, fill status, width, and length.
     *
     * @param color The color of the rectangle.
     * @param filled Whether the rectangle is filled.
     * @param width The width of the rectangle.
     * @param length The length of the rectangle.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = new Point();
        this.width = width;
        this.length = length;
    }

    /**
     * Ful Constructor.
     * @param topLeft Point
     * @param width width
     * @param length length
     * @param color color
     * @param filled filled
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    /**
     * Create Rectangle shape.
     * @param topLeft point
     * @param width width
     * @param length length
     * @param color color
     * @param filled filled
     * @param velocityX speed x
     * @param velocityY speed y
     */
    public Rectangle(Point topLeft, double width, double length, String color,
                     boolean filled, double velocityX, double velocityY) {
        super(color, filled,velocityX,velocityY);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * Returns the width of the rectangle.
     *
     * @return The width of the rectangle.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of the rectangle.
     *
     * @param width The width to set.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Returns the length of the rectangle.
     *
     * @return The length of the rectangle.
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the length of the rectangle.
     *
     * @param length The length to set.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculates and returns the area of the rectangle.
     *
     * @return The area of the rectangle.
     */
    @Override
    public double getArea() {
        return length * width;
    }

    /**
     * Calculates and returns the perimeter of the rectangle.
     *
     * @return The perimeter of the rectangle.
     */
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    /**
     * Movement Function.
     * @param panelWidth width
     * @param panelHeight length
     */
    @Override
    public void move(int panelWidth, int panelHeight) {
        double x = topLeft.getPointX();
        double y = topLeft.getPointY();

        topLeft.setPointX(x + velocityX);
        topLeft.setPointY(y + velocityY);

        if (topLeft.getPointX()  <= 0 || topLeft.getPointX() + width >= panelWidth) {
            velocityX = -velocityX;
        }
        if (topLeft.getPointY() - length <= 0 || topLeft.getPointY()  >= panelHeight) {
            velocityY = -velocityY ;
        }
    }

    /**
     * Draw shapes.
     * @param g Graphic
     */
    @Override
    public void draw(Graphics g) {
        switch (color) {
            case "RED":
                g.setColor(Color.RED);
                break;
            case "BLUE":
                g.setColor(Color.BLUE);
                break;
            case "YELLOW":
                g.setColor(Color.YELLOW);
                break;
            case "GREEN":
                g.setColor(Color.GREEN);
                break;
            case "PINK":
                g.setColor(Color.PINK);
                break;
            case "CYAN":
                g.setColor(Color.CYAN);
                break;
            case "ORANGE":
                g.setColor(Color.ORANGE);
                break;
            default:
                g.setColor(Color.BLACK);
                break;
        }
        int x = (int) topLeft.getPointX();
        int y = (int) topLeft.getPointY();
        int w = (int) width;
        int l = (int) length;
        g.fillRect(x,y-l,w,l);
    }

    /**
     * Returns a string representation of the rectangle.
     *
     * @return A string representation of the rectangle.
     */
    @Override
    public String toString() {
        return "Rectangle[" + "topLeft=" + topLeft.toString() + ",width="
                + width + ",length=" + length + ",color=" + color + ",filled=" + filled + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return Math.abs(width - rectangle.width) < 0.001
                && Math.abs(length - rectangle.length) < 0.001
                && Objects.equals(topLeft, rectangle.topLeft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topLeft, width, length);
    }
}
