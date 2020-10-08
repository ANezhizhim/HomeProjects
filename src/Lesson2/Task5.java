package Lesson2;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        int min;
        int array[];
        array = new int[3];
        Scanner exprScan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Task5. Введите " + (i + 1) + "-е целое число: ");
            array[i] = exprScan.nextInt();
        }

        min = array[0];
        for (int i = 1; i < 3; i++)
            if (min > array[i]) {
                min = array[i];
            }

        System.out.println("Ответ: " + min);

    }

}
/* Замечание2:
Задание 5: Почему переменные не в camelCase, а используется подчеркивание?
 min_a – можно переименовать в minElement или просто min, arr_a в array

 */


/* Замечание1:
•	Задание 5: Считывание надо сделать через цикл

 */