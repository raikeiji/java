package com.casting;

public class Main {
    public static void main(String[] args) {

        Anjing anjing = new Anjing("Anjing");

        anjing.getNamaHewan();

        Hewan casting1 = (Hewan) anjing;

        casting1.getNamaHewan();

        Anjing casting2 = (Anjing) casting1;

        casting2.getNamaHewan();
    }
}
