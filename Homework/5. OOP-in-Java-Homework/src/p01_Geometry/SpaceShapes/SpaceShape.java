package p01_Geometry.SpaceShapes;

import p01_Geometry.Interfaces.AreaMeasurable;
import p01_Geometry.Interfaces.VolumeMeasurable;
import p01_Geometry.Shape;
import p01_Geometry.Vertex;

import java.util.List;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    public SpaceShape(List<Vertex> vertex) {
        super(vertex);
    }

    @Override
    public String toString() {
        String coordinates=String.format("Coordinates: [x = %.2d, y = %.2d, z = %.2d]",
                this.getVertices().get(0).getX(),
                this.getVertices().get(0).getY(),
                this.getVertices().get(0).getZ());

        String area=String.format("Area: %.2f", this.getArea());
        String volume =String.format("Volume: %.2f", this.getVolume());
        return super.toString()+"\r\n"+ coordinates+"\r\n"+area+"\r\n"+volume;
    }
}
