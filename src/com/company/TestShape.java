package com.company;

public class TestShape {
    public static void test(){
        Shape s1 = new Rectangle("red", 4, 5);
        System.out.println(s1);
        System.out.println("Площадь равна " + s1.getArea());

        Shape s2 = new Triangle("blue", 4, 5);
        System.out.println(s2);
        System.out.println("Площадь равна "+ s2.getArea());

        Shape s3 = new Shape("green");
        System.out.println(s3);
        System.out.println("Area is " + s3.getArea());
    }
}
