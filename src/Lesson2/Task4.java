package Lesson2;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        int input;
        int result;
        System.out.println("Task4. Введите целое число: ");
        Scanner exprScan = new Scanner(System.in);

        input = exprScan.nextInt();
        result=input;
        if (result > 0) {
            result++;
        } else if (result < 0) {
            result -= 2;
        } else {
            result = 10;
        }


        System.out.println("Ответ: " + result);


    }
}
