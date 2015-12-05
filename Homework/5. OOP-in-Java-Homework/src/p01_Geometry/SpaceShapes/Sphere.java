package p01_Geometry.SpaceShapes;

import p01_Geometry.Vertex;

import java.util.List;

public class Sphere extends SpaceShape {

    private double radius;

    public Sphere(List<Vertex> vertex, double radius) {
        super(vertex);
        this.setRadius(radius);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double sphereArea=4*Math.PI*Math.pow(this.radius,2);
        return sphereArea;
    }

    @Override
    public double getVolume() {
        double sphereVolume=(4*(Math.PI*Math.pow(this.radius,3)))/3;
        return sphereVolume;
    }
}
