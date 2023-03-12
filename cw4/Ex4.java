package org.example.seminar2.cw4;

import org.example.seminar2.cw4.model.Vector;

public class Ex4 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0,1.0,1.0);
        Vector vector2 = new Vector(1.0,2.0,1.0);
        System.out.println(vector1);
        System.out.println(vector2);
        System.out.println("длинна вектора = " + vector1.LengthVector());
        System.out.println("скалярное произведение = " + vector1.scMulti(vector2));
        System.out.println("векторное произведение = " + vector1.vectorMulti(vector2));
        System.out.println("Косинус угла = " + vector1.cosVector(vector2));
        System.out.println("Сумму векторов = " + vector1.sumVector(vector2));
        System.out.println("Разность векторов = " + vector1.differenceVector(vector2));

    }

}
