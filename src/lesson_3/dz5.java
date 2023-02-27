package lesson_3;
//   Вывести цифры от 10 до 40,  пропустив при этом цифры от 15 до 20
public class dz5 {
    public static void main(String[] args) {
        for (int i = 10; i <= 40 ; i++) {
            if (i<15 || i>20){
                System.out.println(i);
            }
        }
    }
}
