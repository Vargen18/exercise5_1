package tda551.polygons.polygon;

import javax.swing.*;
import java.awt.*;

public abstract class Polygon extends JComponent{
    public Point centerPoint;

    public Polygon(Point center){
        this.centerPoint = center;
    }
    public Polygon(int x, int y){
        this(new Point(x,y));
    }

    public void updateCenter(int x, int y){
        this.centerPoint = new Point(x,y);
    }

    @Override
    public abstract void paint(Graphics g)//paint
    ;
}
