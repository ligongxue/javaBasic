package com.neuedu.Test4;

public class Truck extends Car{
    private  int payload;

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }
    //构造
    public Truck(int wheels, int weight, int loader, int payload)
    {
        super(wheels,weight,loader);
        this.payload=payload;
    }

}
