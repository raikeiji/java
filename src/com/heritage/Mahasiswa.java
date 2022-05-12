package com.heritage;

public class Mahasiswa {
    
    String namaMahasiswa;

    Mahasiswa(){

    }
    
    Mahasiswa(String namaMahasiswa){
        this.namaMahasiswa = namaMahasiswa;
    }

    void show(){
        System.out.println("Nama Mahasiwa adalah " + namaMahasiswa);
    }
}
