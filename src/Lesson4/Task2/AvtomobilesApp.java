package Lesson4.Task2;

public class AvtomobilesApp {

    public static void main(String[] args) {
        Engine manEngine = new Engine(380, "MAN Engine");
        Lorry MAN = new Lorry("MAN", "Грузовой", 20, manEngine);
        MAN.start();
        MAN.turnLeft();
        MAN.turnRight();
        MAN.stop();
        MAN.printInfo();

        Engine bmwEngine = new Engine(450, "BMW Engine");
        SportCar BMW = new SportCar("BMW750", "Спортивный", 320, bmwEngine);
        BMW.start();
        BMW.turnLeft();
        BMW.turnRight();
        BMW.stop();
        BMW.printInfo();

    }
}
/*
Замечания:

Engine – почему поля protected? SportCar, Lorry – почему поля protected?

1. Создать абстрактный класс класс Car, и класс Engine
2. Класс Engine содержит поля - мощность, производитель.
3. Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, мотор типа Engine. Абстрактные методы start(), stop(), и реализованные методы turnRight(), turnLeft()
4. Методы turnRight() и  turnLeft() выводят на экран: "Поворот направо" или "Поворот налево".
5. Абстрактный метод printInfo(), который выводит полную информацию об автомобиле, и моторе.
6. Создать производный от Car класс  - Lorry (грузовик), характеризуемый также грузоподъемностью кузов, реализовать методы start(), stop(). Метод start – выводит на экран «Грузовик поехал», метод stop -   «грузовик остановился».
7.  Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью start(), stop(). Метод start – выводит на экран «SportCar поехал», метод stop -  «SportCar остановился».



 */