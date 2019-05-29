package com.neuedu.test3;

public class PersonCreate extends  Person{
    public static void main(String[] args) {
        Person p1=new Person("张三",1.73,33);
        Person p2=new Person("李四",1.74,44);
        p1.sayHello();
        p2.sayHello();
    }
}
