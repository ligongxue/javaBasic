package com.neuedu.test2;

public class Computer {
    private char color;
    private int cpu;
    public Computer(){
        this.color='黑';
        this.cpu=12;
    }
    public Computer(char color,int cpu){
        this.color=color;
        this.cpu=cpu;
    }
    public void sh(){
        System.out.println("颜色"+color+"cpu"+cpu);
    }
}
