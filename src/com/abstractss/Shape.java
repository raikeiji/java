package com.abstractss;

public abstract class Shape {
    
    String shape;

    Shape(){}

    Shape(String shape){
        this.shape = shape;
    }

    void display(){
        System.out.println("Ukuran =  " + this.shape);
    }
}
