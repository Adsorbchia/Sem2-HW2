package org.example.seminar2.hw1;

import java.util.Scanner;

public class Tsk1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            if (isSimple(num)) {
                sum += num;
            }
        }
        System.out.println(sum);
        sc.close();


    }
        /**
         *
         */
        public static Boolean isSimple ( int n){
            if (n < 2) {
                return false;
            }
            if (n==2){
                return true;
            }
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }

            }
            return true;
        }
    }