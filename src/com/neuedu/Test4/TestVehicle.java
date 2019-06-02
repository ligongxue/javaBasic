package com.neuedu.Test4;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle a = new Vehicle(4,3);
        System.out.println("a有："+a.getWheels()+"个轮子\t："+a.getWeight()+"吨重");


        Car  b= new Car(4,3,4);
        System.out.println("b有："+b.getWheels()+"个轮子\t："+b.getWeight()+"吨重\t可以坐"+b.getLoader()+"个人");

        Truck  c= new Truck(6,10,5,10);
        System.out.println("c有："+c.getWheels()+"个轮子\t："+c.getWeight()+"吨重\t可以坐"+c.getLoader()+"个人\t载重"+c.getPayload()+"吨");

    }
}
