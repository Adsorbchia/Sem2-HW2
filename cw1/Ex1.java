package org.example.seminar2.cw1;

import java.util.Scanner;

public class Ex1 {
// Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a= sc.nextInt();
    int res =0;
    for (int i = 0; i < n-1; i++) {
        int b = sc.nextInt();
        if (a%10==5 && b%2==0){
            res+=a;
        }
        a=b;
    }System.out.println(res);
}
}
