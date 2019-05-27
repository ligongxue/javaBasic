package com.neuedu.test1;

public class Calculator {
    //定义一个计算器类，包括加、减、乘、除运算。
    //并对其进行测试
    private int sum1;
    private int sum2;

    public Calculator(int a, int b){
        this.sum1 = a;
        this.sum2 = b;
    }

    public int getAdd(){
        return this.sum1 + this.sum2;
    }

    public int getSub(){
        return this.sum1 - this.sum2;
    }

    public int getMul(){
        return this.sum1 * this.sum2;
    }

    public void getDev() {
        if (this.sum2 == 0) {
            System.out.print("分子不能为零！");
        } else {
            System.out.print(this.sum1 / this.sum2);
        }
    }
}
