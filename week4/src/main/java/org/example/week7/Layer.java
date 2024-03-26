package org.example.week7;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Layer extends JPanel{
    private final List<Shape> shapes;

    public Layer() {
        this.shapes = new ArrayList<>();
    }

    /**
     * Run Graphics object in program.
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    /**
     * Make shapes are all moving in GUI.
     * @param panelWidth width
     * @param panelHeight length
     */
    public void moveShapes(int panelWidth, int panelHeight) {
        for (Shape shape : shapes) {
            shape.move(panelWidth, panelHeight);
        }
        repaint();  //redraw all shape in list.
    }

    /**
     * Add new shape to List.
     * @param shape Shape
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Get information about the shapes in the layer.
     *
     * @return Information about the shapes in the layer.
     */
    public String getInfo() {
        StringBuilder info = new StringBuilder("Layer of crazy shapes:\n");
        for (Shape shape : shapes) {
            info.append(shape.toString()).append("\n");
        }
        return info.toString();
    }

    /**
     * Remove all circles from the layer.
     */
    public void removeCircles() {
        shapes.removeIf(shape -> shape instanceof Circle);
    }

    /**
     * Remove duplicate shapes from the layer.
     */
    public void removeDuplicates() {
        List<Shape> uniqueShapes = new ArrayList<>();
        for (Shape shape : shapes) {
            if (!uniqueShapes.contains(shape)) {
                uniqueShapes.add(shape);
            }
        }
        shapes.clear();
        shapes.addAll(uniqueShapes);
    }
}
