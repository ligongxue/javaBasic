package com.neuedu.Test4;

import java.util.Scanner;

public class One {
    //验证“鬼谷猜想”：对任意自然数，若是奇数，就对它乘以 3 再加 1；若是

    //偶数，就对它除以 2，这样得到一个新数，再按上述计算规则进行计算，一直进

    //行下去，最终必然得到 1。
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("请输入数字:");
        int a=input.nextInt();
        while(a!=1){
            if(a%2==0){
                //偶数
                a=a/2;
            }
            else{
                a=a*3+1;
            }
        }
        System.out.println(a);
    }

}
