package tda551.polygons.polygon;

import java.awt.*;

public class Rectangle extends tda551.polygons.polygon.Polygon {
    Rectangle(int x, int y) {
        super(x,y);
    }

    public void paint(Graphics g){
        g.drawRect(centerPoint.x -20, centerPoint.y -10, 40, 20);
    }
}
