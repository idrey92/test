package lesson_2;

//Напиши программу. которая будет проверять попало ли целое число, которое мы ей подадим
//в интервал от 50 до 100 и сообщить результат на экран в следующем виде:
//"Число number не содержится в интервале." или "Число number содержится в интервале.", где number - число, которое мы ей подадим.
//
//
//Пример для числа 112:
//Число 112 не содержится в интервале.
//
//Пример для числа 60:
//Число 60 содержится в интервале.
public class DZ1 {
    public static void main(String[] args) {
        int number = 60;
        if (number >= 50 && number <= 100) {
            System.out.println("Число " + number + " содержится в интервале");
        } else {
            System.out.println("Число" + number + " не содержится в интервале");
        }
    }
}

