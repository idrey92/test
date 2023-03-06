package lesson_4.dz;

import java.util.Scanner;

public class dz1 {
    public static void main(String[] args) {
        //Печать только четных чисел массива
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int [5];
        System.out.println("ВВедите 5 чисел");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0 && arr[i] != 0){
                System.out.println(arr[i]);
            }
        }
    }
}
