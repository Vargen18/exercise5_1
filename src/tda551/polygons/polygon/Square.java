package tda551.polygons.polygon;

import java.awt.*;

public class Square extends tda551.polygons.polygon.Polygon {
    Square(int x, int y) {
        super(x,y);
    }

   @Override
    public void paint(Graphics g){
        g.drawRect(centerPoint.x - 10, centerPoint.y - 10, 20, 20);
    }
}
