package com.super_heritage;

public class Main {
    public static void main(String[] args) {
        
        Anjing anjing = new Anjing("Anjing");

        // implementasi objek pada kelas Anjing

        System.out.println("Nama hewan = " + anjing.namaHewan);
        
        // implementasi super heritage

        anjing.getNamaHewan();
    }
}
