package p01_Geometry.PlaneShapes;

import p01_Geometry.Shape;
import p01_Geometry.Vertex;
import p01_Geometry.Interfaces.*;

import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable,AreaMeasurable {

    public PlaneShape(List<Vertex> vertex) {
        super(vertex);
    }

    @Override
    public String toString() {
        String coordinates=String.format("Coordinates: [x = %.2d, y = %.2d]",
                this.getVertices().get(0).getX(),
                this.getVertices().get(0).getY());

        String area=String.format("Area: %.2f", this.getArea());
        String perimeter=String.format("Perimeter: %.2f", this.getPerimeter());

        return super.toString()+"\r\n"+coordinates+"\r\n"+area+"\r\n"+perimeter;
    }
}
