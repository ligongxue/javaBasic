package com.neuedu.Test4;

public class Triangle extends Shape{
    private double  bian1;
    private double  bian2;
    private double  bian3;
    Triangle(double b1,double b2,double b3){
        bian1=b1;
        bian2=b2;
        bian3=b3;
    }
    public void zhouchang(){
        setL(bian1+bian2+bian3);

    }
}
