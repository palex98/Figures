package com.company;

public class Triangle extends Figure {
    double a;
    double b;

    public Triangle(int _color){
        super(_color);
        a = (int)(Math.random() * 10) + 1;
        b = (int)(Math.random() * 10) + 1;
    }

    double CalculateHypotenuse(){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public void Draw(){
        System.out.println("Drawing TRIANGLE...");
    }

    public double GetSquare(){
        return (a*b)/2;
    }

    public void Print(){
        System.out.println("Figure: TRIANGLE " + "Square: " + GetSquare() + " Hypotenuse: " + CalculateHypotenuse() + " Color: " + GetColor());
    }
}
