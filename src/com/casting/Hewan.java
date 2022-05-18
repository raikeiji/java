package com.casting;

public class Hewan {

    String namaHewan;
    
    Hewan(){
        
    }

    Hewan(String namahewan){
        this.namaHewan = namahewan;   
    }

    void getNamaHewan(){
        System.out.println("Nama hewan = "+this.namaHewan);
    }

    void suaraHewan(){
        System.out.println("Anything he want to shout!");
    }
}
