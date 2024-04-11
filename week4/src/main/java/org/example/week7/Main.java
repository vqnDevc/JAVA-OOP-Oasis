package org.example.week7;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Moving Shapes Example");
            frame.setSize(600,400);
            frame.setBackground(Color.GRAY);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Layer newLayer = new Layer();
            newLayer.addShape(new Circle(new Point(50,50),20,"RED",false,5,7));
            newLayer.addShape(new Circle(new Point(100,150),40,"YELLOW",false,10,3));
            newLayer.addShape(new Circle(new Point(300,50),50,"GREEN",false,5,7));
            newLayer.addShape(new Circle(new Point(200,90),30,"CYAN",false,2,8));
            newLayer.addShape(new Circle(new Point(150,180),40,"ORANGE",false));


            newLayer.addShape(new Rectangle(new Point(350,60),120,60,"BLUE",false, 6 ,10));
            newLayer.addShape(new Square(new Point(50,340),50,"PINK",false));

            frame.add(newLayer);

            Timer timer = new Timer(17, e -> newLayer.moveShapes(frame.getWidth(), frame.getHeight()));
            timer.start();

            frame.setVisible(true);
        });
    }
}
