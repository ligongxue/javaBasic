package com.neuedu.worker;

import java.util.ArrayList;
import java.util.List;


public class TestStudent {

    public static void main(String[] args) {

        List <Student> list = new ArrayList<>();

        list.add(new Student("Tom", 18, 100,"class05"));
        list.add(new Student("Jerry", 22, 70,"class04"));
        list.add(new Student("Owen", 25, 90,"class05"));
        list.add(new Student("Jim", 30,80 , "class05"));
        list.add(new Student("Steve", 28, 66, "class06"));
        list.add(new Student("Kevin", 24, 100, "class04"));


        int sum = 0;
        for(int i =0;i<list.size();i++)
        {
            sum=sum+list.get(i).getAge();
        }
        System.out.println("平均年龄："+sum/list.size());
        int sum1 = 0;
        for(int i =0;i<list.size();i++)
        {
            sum1=sum1+list.get(i).getScore();
        }
        System.out.println("平均成绩："+sum1/list.size());




    }

}
