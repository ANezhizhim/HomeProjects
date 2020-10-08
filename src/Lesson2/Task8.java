package Lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int[] arrInt = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int intMax = Integer.MIN_VALUE;
        int intSumPositiv = 0;
        int intSumNegativ = 0;
        int intNumPositiv = 0;
        int intNumNegativ = 0;
        float fltMediumNegativ = 0;

        for (int i = 0; i < arrInt.length; i++) {
            intMax = Math.max(intMax, arrInt[i]);
            if (arrInt[i] < 0) {
                if (arrInt[i] % 2 == 0) intSumNegativ += arrInt[i];
                fltMediumNegativ += arrInt[i];
                intNumNegativ++;
            } else {
                intNumPositiv++;
                intSumPositiv += arrInt[i];
            }
        }
        fltMediumNegativ = fltMediumNegativ / intNumNegativ;
        System.out.println("максимальное значение: " + intMax);
        System.out.println("сумму положительных элементов: " + intSumPositiv);
        System.out.println("сумму четных отрицательных элементов: " + intSumNegativ);
        System.out.println("количество положительных элементов: " + intNumPositiv);
        System.out.println("среднее арифметическое отрицательных элементов: " + fltMediumNegativ);
    }
}


/*Замечание:
•	Задание 8: Почему intSumPositiv = intSumPositiv+Math.max(0, arrInt[i]);
нельзя перенести в else и убрать max?

Задание:
8. Дан массив целых чисел:
[1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]. Для данного
массива найти и вывести на экран:
 - максимальное значение
 - сумму положительных элементов
 - сумму четных отрицательных элементов
 - количество положительных элементов
 - среднее арифметическое отрицательных элементов

 */