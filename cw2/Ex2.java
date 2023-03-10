package org.example.seminar2.cw2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Pow(a,b));

    }public static  int Pow(int num,int num2){
        if (num2==0){
            return 1;
        }return num*Pow(num,num2-1);
    }
}
