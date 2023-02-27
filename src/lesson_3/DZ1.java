package lesson_3;
// Ввести с консоли число и определить положительное оно или отрицательное.

import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();
        if (num > 0) {
            System.out.println("Число положительное");
        } else if (num < 0) {
            System.out.println("Число отрицательное");
        } else if (num == 0) {
            System.out.println("Число не отрицательное и не положительное");
        }
    }
}
