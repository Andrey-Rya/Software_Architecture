package ISP;

public class Cube implements iVolumetricShape {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double volume() {
        return 6 * edge * edge;
    }
}
