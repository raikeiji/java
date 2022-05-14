package com.overriding;

import java.rmi.StubNotFoundException;

public class Anjing extends Hewan {
    String namaHewan;

    // overriding method, the same method name in superclass

    Anjing(String namaHewan){
        this.namaHewan = namaHewan;
    }

    void getNamaHewan(){
        System.out.println("Nama Hewan " + this.namaHewan);
    }
}
