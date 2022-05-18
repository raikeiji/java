package com.polymorphism;

public class Main {
    public static void main(String[] args) {

        // Polymorphism

        Hewan hewan = new Hewan();
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();
    
        hewan.suaraHewan();
        kucing.suaraHewan();
        anjing.suaraHewan();
    }
}
