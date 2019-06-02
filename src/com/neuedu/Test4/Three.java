package com.neuedu.Test4;

import java.util.Scanner;

public class Three {
    //输入两个正整数m和n，求其最大公约数和最小公倍数。
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("请输入数字:");
        int num1=input.nextInt();
        Scanner input1 =new Scanner(System.in);
        System.out.print("请输入数字:");
        int num2=input1.nextInt();
        int m = deff(num1, num2); // 调用deff函数
        System.out.println("最大公约数：" + m);
        int n = num1 * num2 / m; // 通过最大公约数能直接得到最小公倍数
        System.out.println("最小公倍数：" + n);
    }
    public static int deff(int num1, int num2) {
        if (num1 < num2) // 如果第一个数小于第二个数
        {
            int a; // 通过一个数进行交换位置
            a = num2;
            num2 = num1;
            num1 = a;
        }
        while (num2 != 0) // 当第二个数不等于零的事情，循环
        {
            if (num1 == num2) // 如果第一个数和第二个数相等
            {
                return num1; // 则第一个数就是最大公约数
            } else {
                int b = num1 % num2;
                num1 = num2;
                num2 = b;
            }
        }
        return num1;
    }
}
