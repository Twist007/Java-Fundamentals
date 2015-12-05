package p01_Geometry;

import java.util.ArrayList;
import java.util.List;

public abstract class Vertex {

    private int x;
    private int y;
    private int z;
    private List<Vertex> vertex = new ArrayList<Vertex>();

    private Vertex(int x, int y, int z, List<Vertex> vertex) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
        vertex=new ArrayList<Vertex>();
    }

    public Vertex(int x, int y, int z) {
        this(x, y, z, null);
    }

    public Vertex(int x, int y) {
        this(x, y, 0);
    }

    public Vertex(List<Vertex> vertex) {
        this(0, 0, 0, vertex);
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return this.z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public List<Vertex> getVertex() {
        return this.vertex;
    }

    public abstract double getTriangleSide(List<Vertex> Vertex);

}











