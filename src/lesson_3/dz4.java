package lesson_3;

//Сложить цифры в диапазоне от 10 до 20
public class dz4 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i <= 20; i++) {
            count += i;
        }
        System.out.println(count);
    }
}
