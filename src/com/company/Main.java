package com.company;
import java.util.ArrayList;

public class Main {

    static ArrayList<Figure> figures = new ArrayList<Figure>();

    public static void main(String[] args) {

        int number = (int)(Math.random() * 100);

        for(int i = 0; i < number; i++){
            int type = (int)(Math.random() * 4);
            switch (type){
                case 0: figures.add(new Square((int)(Math.random() * Color.values().length)));
                    break;
                case 1: figures.add(new Triangle((int)(Math.random() * Color.values().length)));
                    break;
                case 2: figures.add(new Circle((int)(Math.random() * Color.values().length)));
                    break;
                case 3: figures.add(new Trapezium((int)(Math.random() * Color.values().length)));
                    break;
            }
        }

        System.out.println("Number of figures: " + number);

        for(Figure fgr:figures){
            fgr.Print();
        }
    }
}

