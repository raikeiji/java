package com.abstractss;

public class Persegi {

    int panjang, lebar;

    Persegi(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang(){
        return this.panjang;
    }

    public int getLebar(){
        return this.lebar;
    }

    public void luas(){
        System.out.println("Luas persegi " + this.panjang * this.lebar);
    }
}