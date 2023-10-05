package LSP;

public class Square implements iShape {
    private int width;

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int area() {
        return width * width;
    }
}
