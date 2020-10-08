package Lesson2;

public class Task9 {

    public static void main(String[] args) {


        int[] intArr = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        int intBuff, maxIndex = intArr.length - 1;
        int num = (intArr.length) / 2;

        for (int i = 0; i < num; i++) {
            intBuff = intArr[i];
            intArr[i] = intArr[maxIndex - i];
            intArr[maxIndex - i] = intBuff;
        }
        for (int i = 0; i < intArr.length; i++) {
            System.out.println("Index[" + i + "]" + intArr[i]);
        }

    }
}
/* Замечания:

•	Задание 9: Убрать закомментированный код. Переменные с большой буквы не называем

9. Дан массив целых чисел:
[15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52].
Переставить элементы массива в обратном порядке.
Вывести результат в консоль

 */