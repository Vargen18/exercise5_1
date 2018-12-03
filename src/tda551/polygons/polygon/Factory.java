package tda551.polygons.polygon;

import java.awt.*;
import java.awt.geom.Point2D;

public abstract class Factory {

    private class genericClass<T>{
        int x;
        int y;
        int width;
        int height;
        genericClass(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public <T extends Polygon> T createRectangle(int x, int y, int width, int height){
        T t;
        t = new T(x,y);
        T createdPoly = new genericClass<T>(x,y);
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

    public Triangle createTriangle(int x, int y, int width, int height){
        Triangle createdTriangle = new Triangle(x,y);
        //Possibly do cool stuff, then
        return createdTriangle;
    }

    public Triangle createTriangle(Point p, int width, int height){
        return createTriangle((int) p.getX(), (int) p.getY(), width, height);
    }

    public Triangle createTriangle(int x, int y){
        Triangle createdTriangle = new Triangle(x,y);
        //Possibly do cool stuff, then
        return createdTriangle;
    }

    public Triangle createTriangle(Point p){
        return createTriangle((int) p.getX(), (int) p.getY());
    }

    public Square createSquare(int x, int y, int width, int height){
        Square createdSquare = new Square(x,y);
        //Possibly do cool stuff, then
        return createdSquare;
    }

    public Square createSquare(Point p, int width, int height){
        return createSquare((int) p.getX(), (int) p.getY(), width, height);
    }

    public Square createSquare(int x, int y){
        Square createdSquare = new Square(x,y);
        //Possibly do cool stuff, then
        return createdSquare;
    }

    public Square createSquare(Point p){
        return createSquare((int) p.getX(), (int) p.getY());
    }
}
