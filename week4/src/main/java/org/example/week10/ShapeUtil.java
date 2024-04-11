package org.example.week10;

import java.util.List;

public class ShapeUtil {
    /**
     *  Display info.
     */
    public String printInfo(List<GeometricObject> shapes) {
        String info = "";
        StringBuilder circles = new StringBuilder("Circle:");
        StringBuilder triangles = new StringBuilder("Triangle:");

        for (GeometricObject shape : shapes) {
            if (shape.getClass().equals(Circle.class)) {
                circles.append("\n").append(shape.getInfo());
            } else {
                triangles.append("\n").append(shape.getInfo());
            }
        }

        if (!circles.toString().equals("Circles:")) {
            info += circles + "\n";
        }
        if (!triangles.toString().equals("Triangle:")) {
            info += triangles;
        }

        return info;
    }

}
