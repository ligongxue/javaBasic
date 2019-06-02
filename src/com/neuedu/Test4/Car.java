package com.neuedu.Test4;

public class Car extends Vehicle{
    private int loader;

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }
    //构造
    public Car(int wheels, int weight,int loader)
    {
        super(wheels,weight);
        this.loader=loader;
    }
}
