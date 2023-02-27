package lesson_3;
//Ввести с клавиатуры три числа, вывести на экран среднее из них.
//Т.е. не самое большое и не самое маленькое.
//Если все числа равны, вывести любое из них.
import java.util.Scanner;

public class dz9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числа: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a == b && b == c) {
            System.out.println(a);
        } else if (a < b && b < c || c < b && b < a) {
            System.out.println(b);
        } else if (b < a && a < c || c < a && a < b) {
            System.out.println(a);
        } else if (b < c && c < a || a < c && c < b) {
            System.out.println(c);
        }
    }
}
