package com.company;

public class Circle extends Figure {
    double radius;

    public Circle(int _color){
        super(_color);
        radius = (int)(Math.random() * 10) + 1;
    }

    double CalculateCircumference(){
        return 2*Math.PI*radius;
    }

    public void Draw(){
        System.out.println("Drawing CIRCLE...");
    }

    public double GetSquare(){
        return Math.PI*Math.pow(radius, 2);
    }

    public void Print(){
        System.out.println("Figure: CIRCLE " + "Square: " + GetSquare() + " Circumference: " + CalculateCircumference() + " Color: " + GetColor());
    }
}
