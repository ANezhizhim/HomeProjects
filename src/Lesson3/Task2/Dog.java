package Lesson3.Task2;


public class Dog extends Animal {

    private String breed, color;

    public Dog(String anmFood, String anmLocation, String anmName) {
        super(anmFood, anmLocation, anmName);

    }

    @Override
    public void makeNoise() {
        System.out.println(name + " гавкает.");
    }

    @Override
    public void eat() {
        System.out.println(name + " сладко ест.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " крепко спит.");
    }

    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }

    public void setColor(String dogColor) {
        color = dogColor;
    }

}
