package lesson_4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InterruptedException {
        //int a = 5;
        //  while (a>0){
        //  System.out.println(a);
        //Thread.sleep(1000);
        //a++;
        //   }

        // int[] arr = new int[5];
        //int[] arr2 = {11,22,33,44,55};
//       //System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=i;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(i);
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                even += arr[i];
            } else {
                odd += arr[i];
            }
        }
        if (even > odd) {
            System.out.println("Четных больше");
        }else
        {
            System.out.println("Нечетных больше");
        }
    }
}

