package Lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int input;
        System.out.println("Введите целое число: ");
        Scanner exprScan = new Scanner(System.in);
        input = exprScan.nextInt();
        System.out.println("Ответ: " + input % 10);


    }
}
/* Замечания2:
Задание 1: Вы ввели переменную a, лучшне стало, почему бы ее не назвать, например, input? Так же будет намного понятней если код разрастется.
 */

/* Замечания1:
•	Переменные и методы должны иметь говорящие названия, исключения – циклы (int i, j –счетчики циклов и это понятно). Что значит intA? Актулаьно для всех заданий
•	Названия методов и переменных не должно быть с большой буквы. Вместо ExprScan должно быть exprScan и так далее. Проверьте все задания

 */