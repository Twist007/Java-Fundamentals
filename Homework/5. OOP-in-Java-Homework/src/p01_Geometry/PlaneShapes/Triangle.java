package p01_Geometry.PlaneShapes;

import p01_Geometry.Vertex;

import java.util.List;

public class Triangle extends PlaneShape {

    public Triangle(List<Vertex> vertex) {
        super(vertex);
    }

    @Override
    public double getArea() {
        double halfPerimeter=this.getPerimeter()/2;
        double sideA=this.getTriangleSide(this.getVertices());
        double sideB=this.getTriangleSide(this.getVertices());
        double sideC=this.getTriangleSide(this.getVertices());
        double area=Math.sqrt(
                halfPerimeter*
                        (halfPerimeter-sideA)*
                        (halfPerimeter-sideB)*
                        (halfPerimeter-sideC));
        return area;
    }

    @Override
    public double getPerimeter() {
        double sideA=this.getTriangleSide(this.getVertices());
        double sideB=this.getTriangleSide(this.getVertices());
        double sideC=this.getTriangleSide(this.getVertices());
        double perimeter=sideA+sideB+sideC;
        return perimeter;
    }
}
