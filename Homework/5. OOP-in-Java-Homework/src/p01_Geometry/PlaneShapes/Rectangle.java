package p01_Geometry.PlaneShapes;

import p01_Geometry.Vertex;

import java.util.List;

public class Rectangle extends PlaneShape{

    private double width;
    private double height;

    public Rectangle(List<Vertex> vertex, double width, double height) {
        super(vertex);
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        double rectangleArea=this.height*this.width;
        return rectangleArea;
    }

    @Override
    public double getPerimeter() {
        double perimeter=(this.height*2)+(this.width*2);
        return perimeter;
    }
}
