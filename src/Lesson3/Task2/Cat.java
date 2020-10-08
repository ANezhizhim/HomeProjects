package Lesson3.Task2;

public class Cat extends Animal {

    private String breed, color;

    public Cat(String anmFood, String anmLocation, String anmName) {
        super(anmFood, anmLocation, anmName);

    }

    @Override
    public void makeNoise() {
        System.out.println(name + " мяукает.");
    }

    @Override
    public void eat() {
        System.out.println(name + " сладко ест.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " крепко спит.");
    }

    public void setBreed(String catBreed) {
        breed = catBreed;
    }

    public void setColor(String catColor) {
        color = catColor;
    }

}
