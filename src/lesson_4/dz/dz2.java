package lesson_4.dz;

import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) {
        //Вводить с клавиатуры числа.
        //Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
        //-1 должно учитываться в сумме.
        //
        //Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
        //
        //while (true) {
        //    int number = считываем число;
        //    if (проверяем, что number -1)
        //        break;
        //}
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        System.out.println("Введите число:");
        while(true){
            number = scanner.nextInt();
            if (number == -1){
                break;
            }
        }
    }
}
