package com.neuedu.test3;

public class Square {
    private int side;

    public Square(int side) {
        this.side = side;
    }
    public int getLength(){
        return 4*this.side;
    }
    public int getSquare(){
        return this.side*this.side;
    }
}
