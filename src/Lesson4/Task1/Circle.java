package Lesson4.Task1;

public class Circle implements Shape {
    private double r;


    @Override
    public double square() {
        return 0.5 * (Math.PI * r * r);
    }

    @Override
    public void setSize(double... size) {
        r = size[0];
    }
}
