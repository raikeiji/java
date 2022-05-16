package com.super_heritage;

import java.rmi.StubNotFoundException;

public class Anjing extends Hewan {
    String namaHewan;

    // overriding method, the same method name in superclass

    Anjing(String namaHewan){
        this.namaHewan = namaHewan;
    }

    void getNamaHewan(){
        // implementasi super heritage
        System.out.println("Nama Hewan = " + super.namaHewan);
    }
}
