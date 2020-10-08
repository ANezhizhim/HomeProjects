package Lesson2;

public class Task10 {

    public static void main(String[] args) {

        int[] intArr = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int endNum = intArr.length - 1;

        for (int i = 0; i < endNum; i++) {
            if (intArr[i] == 0) {
                if (intArr[endNum] != 0) {
                    intArr[i] = intArr[endNum];
                    intArr[endNum] = 0;
                } else {
                    i--; //Если в конце массива элемент уже = 0 то , возвращаем счетчик цикла назад , чтоб еще раз повторить итерацию пропустив его
                }
                endNum--;
            }
        }
        for (int i = 0; i < intArr.length; i++) {
            System.out.println("Index[" + i + "]" + intArr[i]);
        }
    }
}
/*Замечание:
•	Задание 10: Вот это что-то очень сложное while ((--EndNum>i)&(intArr[EndNum]==0)){}.
 Подумайте над более простым решением

10. Дан массив целых чисел:
[15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52]. Переместить
нули в конец массива. Вывести результат в консоль
*/
