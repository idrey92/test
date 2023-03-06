package lesson_4.dz;

public class dz3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        while (a<10){
            b=1;
            a++;
            while (b<=10) {
                c= a * b;
                System.out.print(c + " ");
                b++;
            }
            System.out.println();
        }
    }
}
