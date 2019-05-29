package com.neuedu.test3;

public class TestTuXin {
    public static void main(String[] args) {
        Circle c=new Circle(1);
        Square s=new Square(2);
        System.out.println("正方形的周长为："+s.getLength());
        System.out.println("正方形的面积为："+s.getSquare());
        System.out.println("圆的面积为："+c.getArea());
        System.out.println("圆的周长为："+c.getLength());
    }
}
