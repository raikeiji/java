package com.polymorphism;

import java.rmi.StubNotFoundException;

public class Anjing extends Hewan {
    String namaHewan;

    // overriding method, the same method name in superclass

    Anjing(){}

    Anjing(String namaHewan){
        this.namaHewan = namaHewan;
    }

    @Override
    void getNamaHewan(){
        System.out.println("Nama Hewan " + this.namaHewan);
    }

    @Override
    void suaraHewan(){
        System.out.println("Guk Guk Guk!");
    }
}
