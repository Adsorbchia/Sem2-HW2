package org.example.seminar2.cw2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        int b = sc.nextInt();
        double result=1;
        if (b<0){
            a=1/a;
            b=-b;
            for (int i = 0; i < b; i++) {
                result*=a;
            }
            System.out.println(result);
        }
        else {
        System.out.println(Pow(a,b));

    }sc.close();}
        public static  double Pow(double num,int num2){
        if (num2==0){
            return 1;
        }return num*Pow(num,num2-1);
    }
}
