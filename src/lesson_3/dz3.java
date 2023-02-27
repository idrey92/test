package lesson_3;

// Напечатать четные числа от 100 до 150
public class dz3 {
    public static void main(String[] args) {
        for (int i = 100; i <= 150; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
