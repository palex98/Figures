package com.company;

public class Trapezium extends Figure {
    double a;
    double b;
    double h;

    public Trapezium(int _color){
        super(_color);
        a = (int)(Math.random() * 10) + 1;
        b = (int)(Math.random() * 10) + 1;
        h = (int)(Math.random() * 5) + 1;
    }

    double CalculateMiddleLine(){
        return (a+b)/2;
    }

    public void Draw(){
        System.out.println("Drawing TRAPEZIUM...");
    }

    public double GetSquare(){
        return CalculateMiddleLine()*h;
    }

    public void Print(){
        System.out.println("Figure: TRAPEZIUM " + "Square: " + GetSquare() + " Length of middle line: " + CalculateMiddleLine() + " Color: " + GetColor());
    }
}
