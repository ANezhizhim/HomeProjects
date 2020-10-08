package Lesson3.Task2;


public class Animal {
    protected String name;
    private String food, location;

    public Animal(String anmlFood, String anmlLocation, String anmlName) {
        food = anmlFood;
        location = anmlLocation;
        name = anmlName;
    }

    public String getLocation() {
        return this.location;
    }

    public String getfood() {
        return this.food;
    }

    public void makeNoise() {
        System.out.println(this.name + " Шумит.");
    }

    public void eat() {
        System.out.println(this.name + " ест.");

    }

    public void sleep() {
        System.out.println(this.name + " спит.");
    }

    public void setFood(String anmlFood) {
        food = anmlFood;
    }

    public void setLocation(String anmlLocation) {
        location = anmlLocation;
    }
}
