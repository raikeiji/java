package com.abstractss;

public class Segitiga extends Shape{
    
    String shape;

    Segitiga(String shape){
        this.shape = shape;
    }

    @Override
    void display(){
        System.out.println("Ukuran =  " + this.shape);
    }
}
