package org.example.week10;

public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * Constructor.
     * @param p1 point
     * @param p2 point
     * @param p3 point
     */
    public Triangle(Point p1, Point p2, Point p3) {
        if (p1.distance(p2) == 0 || p2.distance(p3) == 0 || p3.distance(p1) == 0
                || (p3.getPointX() - p2.getPointX()) * (p1.getPointY() - p2.getPointY())
                == (p1.getPointX() - p2.getPointX()) * (p3.getPointY() - p2.getPointY())) {
            throw new RuntimeException();
        } else {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    /**
     * get Area.
     */
    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - p1.distance(p2))
                *  (p - p2.distance(p3)) * (p - p3.distance(p1)));
    }

    /**
     * get Perimeter.
     */
    @Override
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    /**
     * get Info.
     */
    @Override
    public String getInfo() {
        return "Triangle[(" + String.format("%.2f", p1.getPointX())
                + "," + String.format("%.2f", p1.getPointY())
                + "),(" + String.format("%.2f", p2.getPointX())
                + "," + String.format("%.2f", p2.getPointY())
                + "),(" + String.format("%.2f", p3.getPointX())
                + "," + String.format("%.2f", p3.getPointY()) + ")]";
    }
}

