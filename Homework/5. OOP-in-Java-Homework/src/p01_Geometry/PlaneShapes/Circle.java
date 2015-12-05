package p01_Geometry.PlaneShapes;

import p01_Geometry.Vertex;
import java.util.List;

public class Circle extends PlaneShape{
    private double radius;

    public Circle(List<Vertex> vertex, double radius) {
        super(vertex);
        this.setRadius(radius);
    }

    public double getRadius(){
        return this.radius;
    }
    private void setRadius(double radius){
        this.radius=radius;
    }

    @Override
    public double getArea() {
        double circleArea=Math.PI*(Math.pow(this.radius,2));
        return circleArea;
    }

    @Override
    public double getPerimeter() {
        double circlePerimeter=(this.radius*2)*Math.PI;
        return circlePerimeter;
    }
}
