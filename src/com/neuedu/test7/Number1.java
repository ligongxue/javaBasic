package com.neuedu.test7;

import java.util.ArrayList;

public class Number1 {
    //定义一个方法listTest(ArrayList<Integer> al, Integer s)，
    //要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
    static int listTest(ArrayList<Integer> al, Integer s)
    {
        return al.indexOf(s);
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(4);
        al.add(3);
        al.add(5);
        System.out.println(Number1.listTest(al,3));
    }
}
