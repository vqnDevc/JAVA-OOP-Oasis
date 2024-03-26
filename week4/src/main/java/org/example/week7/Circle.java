package org.example.week7;

import java.awt.*;
import java.util.Objects;

public class Circle extends Shape {
    protected Point center;
    protected  double radius;
    public static final double PI = 3.1415926535;

    public  Circle() {
        super();
        this.radius = 0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Constructor center.
     * @param center center
     * @param radius radius
     * @param color color
     * @param filled filled
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    /**
     * Create shape in GUI constructor.
     * @param center point
     * @param radius radius
     * @param color color
     * @param filled filled
     * @param velocityX speed x
     * @param velocityY speed y
     */
    public Circle(Point center, double radius, String color, boolean filled, double velocityX, double velocityY) {
        super(color, filled, velocityX, velocityY);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    /**
     * Movement Function.
     * @param panelWidth width
     * @param panelHeight length
     */
    @Override
    public void move(int panelWidth, int panelHeight) {
        double x = center.getPointX();
        double y = center.getPointY();


        center.setPointX(x + velocityX);
        center.setPointY(y + velocityY);

        if (center.getPointX() - radius <= 0 || center.getPointX() + radius >= panelWidth) {
            velocityX = -velocityX;
        }
        if (center.getPointY() - radius <= 0 || center.getPointY() + radius >= panelHeight) {
            velocityY = -velocityY ;
        }
    }

    /**
     * Draw shape.
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
        int x = (int) center.getPointX();
        int y = (int) center.getPointY();
        int r = (int) radius;
        g.fillOval(x-r,y-r,2*r,2*r);
    }

    @Override
    public String toString() {
        return "Circle[" + "center=" + center.toString() + ",radius=" + radius
                + ",color=" + color + ",filled=" + filled + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Circle circle = (Circle) o;
        return Math.abs(radius - circle.radius) < 0.001
                && Objects.equals(center, circle.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }
}
