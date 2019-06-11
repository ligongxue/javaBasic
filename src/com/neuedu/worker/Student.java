package com.neuedu.worker;

public class Student {
    private String name;

    private int age;

    private int score;

    private String classNum;

    public Student(String name, int age, int score, String classNum) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.classNum = classNum;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }
}
