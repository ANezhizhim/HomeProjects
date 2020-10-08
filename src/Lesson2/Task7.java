package Lesson2;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        int intCode;
        float fltCost = 0.0f, fltTime = 10.0f;
        String strTown = "";
        System.out.println("Введите целое число: ");
        Scanner scan1 = new Scanner(System.in);
        intCode = scan1.nextInt();
        switch (intCode) {
            case 905:
                fltCost = 4.1f * fltTime;
                strTown = "Москва";
                break;
            case 194:
                fltCost = 5.0f * fltTime;
                strTown = "Ростов";
                break;
            case 491:
                fltCost = 2.69f * fltTime;
                strTown = "Краснодар";
                break;
            case 800:
                fltCost = 5.0f * fltTime;
                strTown = "Киров";
                break;


        }
        System.out.println(strTown + ". Стоимость разговора :" + fltCost);
    }
}
