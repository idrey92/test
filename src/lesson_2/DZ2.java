package lesson_2;

//Напиши программу, которая по номеру месяца должна определить время года (зима, весна, лето, осень)
// и вывести на экран.
//
//Пример для номера месяца 2:
//зима
//
//Пример для номера месяца 5:
//весна
public class DZ2 {
    public static void main(String[] args) {
        int a = 7;
        if (a <= 2 || a == 12) {
            System.out.println("Зима");
        } else if (a >= 3 && a <= 5) {
            System.out.println("Весна");
        } else if (a >= 6 && a <= 8) {
            System.out.println("Лето");
        } else if (a >= 9 && a <= 11) {
            System.out.println("Осень");
        }
    }
}
