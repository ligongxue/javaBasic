package com.neuedu.Test4;

public class Twq {
    //判断101-200之间有多少个素数，并输出所有素数。
    public static void main(String[] args) {
        int i, j;
        for (i = 101; i <= 200; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                        break;
                } else {
                    if (j == i - 1) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
