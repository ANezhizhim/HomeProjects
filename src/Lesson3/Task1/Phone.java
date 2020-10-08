package Lesson3.Task1;

public class Phone {
    private String number;
    private String model;
    private float weight;

    public Phone(String phNumber, String phModel, float phWeight) {
        this.number = phNumber;
        this.model = phModel;
        this.weight = phWeight;
    }

    public Phone(String phNumber, String phModel) {
        this.number = phNumber;
        this.model = phModel;
    }
    public String getNumber(){
        return this.number;
    }

    public String getModel(){
        return this.model;
    }

    public float getWeight(){
        return this.weight;
    }

    public Phone() {
        this("8-800", "Стационарный");
    }

    public void receiveCall(String name) {
        System.out.println("Звонит: " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит: " + name + ", Номер: " + number);
    }



    public void sendMessage1(String... numbers) {

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Номер : " + numbers[i]);
        }
    }
}
