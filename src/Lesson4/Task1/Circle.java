package Lesson4.Task1;

public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }


    @Override
    public double square() {
        return 0.5 * (Math.PI * r * r);
    }

}
