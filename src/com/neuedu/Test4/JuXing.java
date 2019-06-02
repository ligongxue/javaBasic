package com.neuedu.Test4;

public class JuXing extends Shape{
    private double width;
    private double height;
    JuXing(double w,double h){
        width=w;
        height=h;
    }
    public void zhouchang(){
        setL(2*(width+height));
    }
}
