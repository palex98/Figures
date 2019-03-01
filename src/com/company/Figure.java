package com.company;

public abstract class Figure implements Printable{
    Color color;

    public abstract void Draw();
    public abstract double GetSquare();

    public Figure(int _color){
        color = Color.values()[_color];
    }

    public  Color GetColor(){
        return color;
    }
}