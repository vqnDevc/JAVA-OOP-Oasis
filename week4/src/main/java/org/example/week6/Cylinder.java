package org.example.week6;

/**
 * Represents a Cylinder, extending from Circle.
 */
public class Cylinder extends Circle {
    private double height;

    /**
     * Constructs a Cylinder with default values.
     * @param height The height of the Cylinder.
     */
    public Cylinder(double height) {
        super();
        this.height = height;
    }

    /**
     * Constructs a Cylinder with specified radius and height.
     * @param radius The radius of the Cylinder.
     * @param height The height of the Cylinder.
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * Constructs a Cylinder with specified radius, height, and color.
     * @param radius The radius of the Cylinder.
     * @param height The height of the Cylinder.
     * @param color The color of the Cylinder.
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * Gets the height of the Cylinder.
     * @return The height of the Cylinder.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the Cylinder.
     * @param height The height of the Cylinder.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Calculates the volume of the Cylinder.
     * @return The volume of the Cylinder.
     */
    public double getVolume() {
        return super.getArea() * height;
    }

    /**
     * Calculates the surface area of the Cylinder.
     * @return The surface area of the Cylinder.
     */
    @Override
    public double getArea() {
        return 2.0 * Math.PI * getRadius() * (height + getRadius());
    }

    /**
     * Converts the Cylinder to a String representation.
     * @return String representation of the Cylinder.
     */
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + this.height + "]";
    }
}
