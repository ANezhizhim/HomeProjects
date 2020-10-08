package Lesson4.Task2;

public class Engine {
    private int power;
    private String manufacturer;

    public Engine(int engPower, String engManufacturer) {
        this.power = engPower;
        this.manufacturer = engManufacturer;
    }

    public int getPower(){
        return this.power;
    }
    public String getManufacturer(){
        return this.manufacturer;
    }


}
