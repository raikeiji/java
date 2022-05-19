package com.abstractss;

public abstract class Shape {
    
    String shape;

    Shape(){}

    Shape(String shape){
        this.shape = shape;
    }

    // abstract method
    public abstract void luas();

    void display(){
        System.out.println("Ukuran =  " + this.shape);
    }
}
