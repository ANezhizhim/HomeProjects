package Lesson3.Task2;

public class Hourse extends Animal {

    private String breed, color;

    public Hourse(String anmFood, String anmLocation, String anmName) {
        super(anmFood, anmLocation, anmName);

    }

    @Override
    public void makeNoise() {
        System.out.println(name + " ржет.");
    }

    @Override
    public void eat() {
        System.out.println(name + " сладко ест.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " крепко спит.");
    }

    public void setBreed(String hourseBreed) {
        breed = hourseBreed;
    }

    public void setColor(String hourseColor) {
        color = hourseColor;
    }
}
