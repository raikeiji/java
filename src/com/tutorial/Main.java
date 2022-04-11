package com.tutorial;

class Mahasiswa{

    String Nama;
    String NIM;
    int umur;
    double IPK;

}

public class Main {
    public static void main(String[] args) {
       
        Mahasiswa m1 = new Mahasiswa();
        m1.Nama = "Angel";
        m1.NIM = "125314112";
        m1.umur = 24;
        m1.IPK = 3.45;

        System.out.println(m1.Nama);
        System.out.println(m1.NIM);
        System.out.println(m1.umur);
        System.out.println(m1.IPK);

        Mahasiswa m2 = new Mahasiswa();
        m2.Nama = "Bertus";
        m2.NIM = "125314000";
        m2.umur = 32;
        m2.IPK = 3.67;

        System.out.println(m2.Nama);
        System.out.println(m2.NIM);
        System.out.println(m2.umur);
        System.out.println(m2.IPK);

    }    
}
