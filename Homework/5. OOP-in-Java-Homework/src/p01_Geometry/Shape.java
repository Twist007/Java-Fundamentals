package p01_Geometry;


import java.util.List;

public class Shape extends Vertex {
    public Shape(List<Vertex> vertex) {
        super(vertex);
    }

    @Override
    public double getTriangleSide(List<Vertex> Vertex) {
        double side = Math.sqrt(
                (Math.pow((Vertex.get(0).getX() - Vertex.get(0).getY()), 2) +
                        (Math.pow((Vertex.get(1).getX() - Vertex.get(1).getY()), 2))));
        return side;
    }

    @Override
    public String toString() {
        String shapeType = this.getClass().getSimpleName();
        return shapeType;
    }
}
