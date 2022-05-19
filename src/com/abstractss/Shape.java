package com.abstractss;

public abstract class Shape {
    
    String shape;
    
    // Protected attributed can be access only by subclass
    protected int alas;
    protected int tinggi;

    Shape(){}

    Shape(String shape){
        this.shape = shape;
    }

    // abstract method
    public abstract void luas();

    // implemented protected method, which can only imlemented in subclass
    protected void display(){
        System.out.println("Ukuran =  " + this.shape);
    }
}
