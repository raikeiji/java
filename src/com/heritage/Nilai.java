package com.heritage;

public class Nilai extends Mahasiswa {
    
    int nilaimah;
    
    Nilai(int nilaimah){
        super();
        this.nilaimah = nilaimah;
    }

    void getNilai(){
        System.out.println("Nilai Mahasiswa = " + nilaimah);
    }
}
