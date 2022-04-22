package com.settergetter;

class Data{

    public int intPublic;
    private int intPrivate;
    private double doublePrivate;
     
    public Data(){
        this.intPublic = 0;
        this.intPrivate = 5;
    }

    // show everything

    void display(){

        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);

    }

    // GETTER

    public int getIntPrivate(){
        return this.intPrivate; // simple method, but return private value
    }

    // SETTER

    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }
}

class Segitiga{
    
    private int alas;
    private int tinggi;

    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getAlas(){
        return this.alas;
    }

    public void setAlas(int alas){
        this.alas = alas;
    }

    public int getTinggi(){
        return this.tinggi;
    }

    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }

    public int getLuas(){
        return (alas*tinggi)/2;
    }
}

public class Main {
    public static void main(String[] args) {
        Data data = new Data();

        // read and write in public
        data.intPublic = 10; // read
        System.out.println("public : " + data.intPublic); // write

        // read only with GETTER
        int number = data.getIntPrivate(); 
        System.out.println("GETTER : " + number);

        // write only with SETTER
        data.setDoublePrivate(0.05);
        data.display();

        // testing segitiga class

        Segitiga segi3 = new Segitiga(10,10);

        System.out.println("Luas segitita dengan alas dengan (alas "+ segi3.getAlas()+ " x tinggi " + segi3.getTinggi() + " ) / 2 = " + segi3.getLuas());

        segi3.setAlas(20);

        System.out.println("Luas segitita dengan alas dengan (alas "+ segi3.getAlas()+ " x tinggi " + segi3.getTinggi() + " ) / 2 = " + segi3.getLuas());

    }
}
