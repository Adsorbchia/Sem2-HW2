package org.example.seminar2.hw3;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, -5, 99, 44, 2, -3, 88, -11};
        int sum=0;
        for (int i = 0; i < array.length; i++) {

            if (array[i]>9 && array[i]<100){
                sum+=i;

            }

        }System.out.println(sum);
        newArray(array,sum);




    }
    public static void newArray(int []ar,int num){
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < 0) {
                ar[i]=num;
            }
      }
        System.out.println(Arrays.toString(ar));
    }
}
