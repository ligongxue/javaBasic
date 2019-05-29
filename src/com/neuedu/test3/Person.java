package com.neuedu.test3;

public class Person {
    private String name;
    private double height;
    private int age;

    public Person() {

    }
    public Person(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public void sayHello(){
        System.out.println("hello,my name is "+name);
    }
}
