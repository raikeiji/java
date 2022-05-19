package com.abstractss;

public class Segitiga extends Shape{
    
    String shape;
    int alas, tinggi;

    Segitiga(String shape){
        this.shape = shape;
    }

    Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    void display(){
        System.out.println("Ukuran =  " + this.shape);
    }

    public int getAlas(){
        return this.alas;
    }

    public int getTinggi(){
        return this.tinggi;
    }

    // method abstract have to be implemented in subclass
    public void luas(){
       System.out.println("Luas segitiga = " + (this.alas*this.tinggi)/2);
    }
}
