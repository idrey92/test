package lesson_5.dz;

import java.util.Scanner;

//Задача: Программеа вводит строки, пока пользоватль не введёт пустую строку (нажав enter).
// Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
//
//Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
//Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
//Программа выводит слова на экран.
public class dz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        String list = new String();
        while (true) {
            string = scanner.nextLine();
            if (string == "") {
                break;
            }
            list+=string;
        }

        String registr = list.toUpperCase();
        System.out.println(registr);
    }


}

