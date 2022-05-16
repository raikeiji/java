package com.super_heritage;

public class Hewan {

    String namaHewan = "kucing";
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
}
