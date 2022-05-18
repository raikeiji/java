package com.polymorphism;

public class Hewan {

    String namaHewan;
    String umurHewan;

    Hewan(){
        
    }

    Hewan(String namahewan, String umurHewan){
        this.namaHewan = namahewan;
        this.umurHewan = umurHewan;
    }

    void getNamaHewan(){
        System.out.println(this.namaHewan);
    }

    void suaraHewan(){
        System.out.println("Anything he want to shout!");
    }
}
