package com.abstractss;

public class Main {
    public static void main(String[] args) {

        // can not make object in abstract class
        // Shape asdasd = new Shape();

        Segitiga sgtg = new Segitiga("Segitiga");
        sgtg.display();

        Segitiga luas = new Segitiga(6, 8);

        System.out.println("Alas = " + luas.getAlas());
        System.out.println("Tinggi = " + luas.getTinggi());

        luas.luas();
    }
}
