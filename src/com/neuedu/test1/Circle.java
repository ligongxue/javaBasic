package com.neuedu.test1;

public class Circle {
    //定义圆类，它有一个变量radius(半径)。从键盘输入数据，
    // 将半径传递给radius，编程计算并输出圆的周长和面积
    // （确保输入的数据不为负数）。
    //并对其进行测试
    private double radius;

    public Circle(double dRadius){
        this.radius = dRadius;
    }

    public double getLength(){
        return 2*Math.PI*this.radius;
    }

    public double getArea()
    {
        return Math.PI*this.radius*this.radius;
    }

}
