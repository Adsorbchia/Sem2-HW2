package org.example.seminar2.cw3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    /**
     * Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент вдвое больше второго
      */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(array));
        int res=0;
        for (int i = 0; i < size-2; i++) {
            if (array[i]/array[i+1]==2 && array[i]%array[i+1]==0){
                res+=1;

            }

        }
        System.out.println(res);
        sc.close();
    }
}
