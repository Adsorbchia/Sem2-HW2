package org.example.seminar2.cw4;

import org.example.seminar2.cw4.model.Vector;

public class Ex4 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0,1.0,1.0);
        Vector vector2 = new Vector(1.0,2.0,1.0);
        System.out.println(vector1);
        System.out.println(vector2);
        System.out.println("длинна вектора = " +vector1.LengthVector());
        System.out.println(" скалярное произведение = " +vector1.scMulti(vector2));

    }

}
