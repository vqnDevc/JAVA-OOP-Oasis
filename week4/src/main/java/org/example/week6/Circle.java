package org.example.week6;

/**
 * Represents a Circle.
 */
public class Circle {
    private double radius;
    private String color;
    protected static final double PI = 3.14;

    /**
     * Constructs a Circle with default values.
     */
    public Circle() {
    }

    /**
     * Constructs a Circle with specified radius and color.
     * @param radius The radius of the Circle.
     * @param color The color of the Circle.
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Constructs a Circle with specified radius and default color.
     * @param radius The radius of the Circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Gets the radius of the Circle.
     * @return The radius of the Circle.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the Circle.
     * @param radius The radius of the Circle.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Gets the color of the Circle.
     * @return The color of the Circle.
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the Circle.
     * @param color The color of the Circle.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Calculates the area of the Circle.
     * @return The area of the Circle.
     */
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    /**
     * Converts the Circle to a String representation.
     * @return String representation of the Circle.
     */
    @Override
    public String toString() {
        return "Circle[" + "radius=" + radius + ",color='" + color  + ']';
    }
}
