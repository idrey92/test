package lesson_3;

import java.util.Scanner;

//Разработать программу определения числа дней в месяце, если он задан номером от 1 до 12.
// Спросить у пользователя номер месяца от 1 до 12 и вывести в консоль количество дней.
public class dz2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер месяца от 1 до 12: ");
        int month = in.nextInt();
        if (month>7){
            month++;
        }
        if (month == 2) {
            System.out.println("В месяце 28 дней, 29 в високосный год");
        } else if (month % 2 == 0) {
            System.out.println("В месяце 30 дней");
        } else {
            System.out.println("В месяце 31 день");
        }
    }
}
