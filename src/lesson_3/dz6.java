package lesson_3;
// Вывести сумму четных чисел от 10 до 50
public class dz6 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i <= 50; i++) {
            if (i%2 == 0 ){
                count+=i;
                            }
        }
        System.out.println(count);
    }
}
