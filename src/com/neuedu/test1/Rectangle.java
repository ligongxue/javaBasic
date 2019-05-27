package com.neuedu.test1;

public class Rectangle {
    //定义长方形类，含：
    //特征：宽、高（整型）；
    //方法：求周长、面积；
    //方法3个：（1）无参——宽、高默认值为1；
    // （2）1个参数——宽、高均为参数值；
    // （3）2个参数——宽、高各为参数值。
    //并对其进行测试
    //a长  b宽
    private int a;
    private int b;
    public Rectangle(){
        this.a=1;
        this.b=1;
    }
    public Rectangle(int iIndex){
        this.a=iIndex;
        this.b=iIndex;
    }
    public Rectangle(int iHeight, int iWidth){
        this.a=iHeight;
        this.b=iWidth;
    }
    public int getLength(){
        return  2*(this.a+this.b);
    }
    public int getSquare(){
        return this.a*this.b;
    }
}
