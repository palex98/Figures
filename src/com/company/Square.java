package com.company;

public class Square extends Figure {
    double sideLength;

    public Square(int _color){
        super(_color);
        sideLength = (Math.random() * 10) + 1;
    }

    public void Draw(){
        System.out.println("Drawing SQUARE...");
    }

    public double GetSquare(){
        return sideLength*sideLength;
    }

    public void Print(){
        System.out.println("Figure: SQUARE " + "Square: " + GetSquare() + " Length of side: " + sideLength + " Color: " + GetColor());
    }
}
