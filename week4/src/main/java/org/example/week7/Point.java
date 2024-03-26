package org.example.week7;

import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    public Point() {
        this.pointX = 0;
        this.pointY = 0;
    }

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    @Override
    public String toString() {
        return String.format("(%.1f,%.1f)", this.pointX, this.pointY);
    }

    /**
     * caculate distance.
     * @param newPoint : Point
     * @return distance
     */
    public double distance(Point newPoint) {
        double disX = this.pointX - newPoint.getPointX();
        double disY = this.pointY - newPoint.getPointY();
        return Math.sqrt(disX * disX + disY * disY);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point point = (Point) obj;
        return Math.abs(pointX - point.pointX) < 0.001
                && Math.abs(pointY - point.pointY) < 0.001;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }
}
