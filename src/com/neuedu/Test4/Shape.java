package com.neuedu.Test4;

public class Shape {
    //5 编写一个Shape类，具有属性：周长和面积；
    // 定义其子类三角形和矩形，分别具有求周长的方法。
    // 定义主类E，在其main方法中创建三角形和矩形类的对象，
    // 并赋给Shape类的对象a、b，使用对象a、b来测试其特性。
    private double l;
    private double s;

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }
}
