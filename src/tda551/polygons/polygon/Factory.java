package tda551.polygons.polygon;

import java.awt.*;
import java.awt.geom.Point2D;

public class Factory {

    public Rectangle createRectangle(int x, int y, int width, int height){
        Rectangle createdRectangle = new Rectangle(x,y);
        //Possibly do cool stuff, then
        return createdRectangle;
    }

    public Rectangle createRectangle(Point p, int width, int height){
        return createRectangle((int) p.getX(), (int) p.getY(), width, height);
    }

    public Rectangle createRectangle(int x, int y){
        Rectangle createdRectangle = new Rectangle(x,y);
        //Possibly do cool stuff, then
        return createdRectangle;
    }

    public Rectangle createRectangle(Point p){
        return createRectangle((int) p.getX(), (int) p.getY());
    }
}
