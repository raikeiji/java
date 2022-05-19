package com.abstractss;

public class Segitiga extends Shape{
    
    String shape;
    

    Segitiga(String shape){
        this.shape = shape;
    }

    Segitiga(int alas, int tinggi){
        super.alas = alas;
        super.tinggi = tinggi;
    }

    @Override
    public void display(){
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
