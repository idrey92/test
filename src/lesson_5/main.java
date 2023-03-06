package lesson_5;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // primitive
        // linked
        // - мы создали сами
        // - написаны до нас в Java
        // - написан до нас другими компаниями
        //        Cat cat = new Cat();
        //        String hello = "Hello world";
        //        String hello2 = new String() ;
        //        String hello3 = new String ("Hello world");
        //        int a = hello.length();
        //        System.out.println(a);
        //        String five = "5";
        //        Integer parseFive = Integer.parseInt(five);
        //        System.out.println(parseFive);
        Scanner scanner = new Scanner(System.in);

        String textUser = scanner.nextLine();
//
//       // Integer a = scanner.nextInt();
//       // 1.Replace some characters
//       String replaced = textUser.replace("_","");
//        System.out.println(replaced);
//
//        // change register
//
//        String lowerCase = replaced.toLowerCase();
//        System.out.println(lowerCase);
        // 3.check 1 @
        // test@mail.ru
        String [] array = textUser.split("@");
        if (array.length == 2){
            System.out.println("email ok");
        } else {
            System.out.println("Email is not correct");
            return;
        }
        // 4. Check domen
        String partBeforeDog = array[0];
        String partAfterDog = array[1];

        if (partAfterDog.endsWith(".ru")){
            System.out.println("email is ok");
        }else {
            System.out.println("Email is not correct");
        }

    }
}
