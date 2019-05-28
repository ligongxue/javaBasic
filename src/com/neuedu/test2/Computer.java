package com.neuedu.test2;

public class Computer {
    private String color;
    private int cpu;
    public Computer(){

    }
    public Computer(String color,int cpu){
        this.color=color;
        this.cpu=cpu;
    }
    public void sh(){
        System.out.println("颜色"+color+"cpu"+cpu);
    }
}
