package lesson_3;

import java.util.Scanner;

//Ввести с клавиатуры два числа m и n.
//Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
public class dz7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа : ");
        int m = in.nextInt();
        int n = in.nextInt();
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
