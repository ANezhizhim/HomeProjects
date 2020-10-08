package Lesson3.Task2;

public class ZooParkApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Wiscas", "Room", "Barsic");
        cat.makeNoise();
        cat.setFood("Рыба");
        cat.setLocation("Квартира");

        Dog dog = new Dog("Chappi", "Yard", "Sharik");
        dog.makeNoise();
        dog.setFood("Кость");
        dog.setLocation("Будка");

        Hourse hourse = new Hourse("Hay", "Meadow", "Pegas");
        hourse.makeNoise();
        hourse.setFood("Чипсы");
        hourse.setLocation("Ипподром");

        Veterinar veterinar = new Veterinar();

        Animal []animals = {cat, dog, hourse};
        for (Animal anm : animals) {
            veterinar.treatAnimal(anm);
        }

    }

}

/* Замечание2:
Задание 2: Animal – все поля protected, хотя в наследниках используется только name, предлагаю его сотавить protected,
 остальные сделать приватными

 */

/* Замечание:
•	Задание 2: Animal: добавить конструктор. String anml_food – переменные в camelCase.
 Зачем вводить поля, которые никак не заполняются? Переделать их на private.
 Cat, Dog, Horse – добавить конструкторы со всеми параметрами и вызовом родительского.
 Main2 – почему Main2?
 Cat Cat1=new Cat("Barsic"); - наименование переменных с маленькой буквы и опять же вопрос почему cat1? Где cat2?

Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
Класс Animal содержит переменные food, location и методы
makeNoise, eat, sleep. Метод makeNoise, например, может выводить
на консоль "Такое
-то животное спит". Dog, Cat, Horse
переопределяют методы makeNoise, eat. Добавьте переменные в
классы Dog, Cat, Horse, характеризующие только этих животных.
Создайте класс Ветеринар, в котором определите метод void
treatAnimal(Animal animal). Пусть этот метод распечатывает food и
location пришедшего на прием животного. В методе main создайте
массив типа Animal, в который запишите животных всех имеющихся
у вас типов. В цикле отправляйте их на прием к ветеринару.

 */