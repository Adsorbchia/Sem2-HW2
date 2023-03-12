package org.example.seminar2.hw2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size ; i++) {
            array[i] =sc.nextInt();
        }
        System.out.println(CheckNum(array)? "последовательность возрастающая":
                "Нет, последовательность не является возрастающей");
        }

    /**
     *
     * @param ar массив целых чисел
     * @return true, если последовательность возрастающая
     */

    public static Boolean CheckNum(int ar[]){
        for (int i = 0; i < ar.length-1; i++) {
            if (ar[i]>ar[i+1]){
                return false;
            }

        }
       return true;
    }
}
