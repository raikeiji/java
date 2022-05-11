package com.heritage;

public class Nilai extends Mahasiswa {
    
    String nilaimah;
    Mahasiswa mahasiwa;

    Nilai(String nilaimah){
        this.nilaimah = nilaimah;
    }

    void getNamaMahsiwa(){
        System.out.println("Nama Mahasiswa adalah " + mahasiwa.namaMahasiswa);
    }
}
