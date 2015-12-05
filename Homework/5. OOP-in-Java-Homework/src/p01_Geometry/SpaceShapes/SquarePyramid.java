package p01_Geometry.SpaceShapes;

import p01_Geometry.Vertex;

import java.util.List;

public class SquarePyramid extends SpaceShape {

    private double width;
    private double height;


    public SquarePyramid(List<Vertex> vertex, double height, double width) {
        super(vertex);
        this.setHeight(height);
        this.setWidth(width);
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
        double squarePyramidArea=Math.pow(this.width, 2)+(2*(this.width*this.height));
        return squarePyramidArea;
    }

    @Override
    public double getVolume() {
        double squarePyramidVolume=(Math.pow(this.width,2)*this.height)/3;
        return squarePyramidVolume;
    }
}
