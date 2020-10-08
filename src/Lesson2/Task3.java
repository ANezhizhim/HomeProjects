package Lesson2;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        int input;
        System.out.println("Task3. Введите целое число: ");
        Scanner exprScan = new Scanner(System.in);
        input = exprScan.nextInt();
        if (input > 0) {
            input++;
        }

        System.out.println("Ответ: " + input);
    }
}
