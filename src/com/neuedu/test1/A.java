package com.neuedu.test1;
import java.util.Scanner;

public class A {
    //测试长方形
    public static void main(String[] args) {
        Rectangle oRec1=new Rectangle();
        System.out.println("默认长方形的周长为："+oRec1.getLength());
        System.out.println("默认长方形的面积为："+oRec1.getSquare());

        Rectangle oRec2 = new Rectangle(2);
        System.out.println("一个参数长方形的周长为："+oRec2.getLength());
        System.out.println("一个参数长方形的面积为："+oRec2.getSquare());

        Rectangle oRec3 = new Rectangle(2,3);
        System.out.println("两个参数长方形的周长为："+oRec3.getLength());
        System.out.println("两个参数长方形的面积为："+oRec3.getSquare());


        //测试圆
        double iRadius;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入圆的半径：");
        iRadius = sc.nextDouble();
        if(iRadius < 0){
            System.out.println("你输入的半径有误!");
        }
        else{
            Circle oCir = new Circle(iRadius);
            System.out.println("圆的周长为："+oCir.getLength());
            System.out.println("圆的面积为："+oCir.getArea());
        }


        //测试计算器
        Calculator oCal = new Calculator(12,6);
        System.out.println("两数之和为 ："+oCal.getAdd());
        System.out.println("两数之差为："+oCal.getSub());
        System.out.println("两数之积为："+oCal.getMul());
        System.out.print("两数之商为：");
        oCal.getDev();
    }
}
