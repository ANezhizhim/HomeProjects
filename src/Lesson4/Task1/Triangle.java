package Lesson4.Task1;


public class Triangle implements Shape {
    private double h;
    private double w;

    @Override
    public void setSize(double... size) {
        h = size[0];
        w = size[1];
    }

    @Override
    public double square() {
        return 0.5 * (h * w);
    }
}
