package Lesson4.Task1;

public class Rectangle implements Shape {
    private double l;
    private double w;

    public  Rectangle (double l,double w){
        this.l=l;
        this.w=w;
}
    @Override
    public double square() {
        return this.l * this.w;
    }

}
