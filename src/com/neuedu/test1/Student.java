package com.neuedu.test1;

public class Student {
    //定义一个学生类 包括 姓名 年龄 分数的特征
    //创建五个学生对象 对其中特征进行赋值 赋值后
    //根据分数从大到小进行排序
    private String name;
    private int age;
    private int score;
    public Student(String name,int age,int score){
        this.name=name;
        this.age=age;
        this.score=score;
    }
}
