package com.tutorial;

import java.net.SocketTimeoutException;

class Mahasiswa{

    String nama;
    String NIM;
    int umur;
    double IPK;

    // Constructur, first object called in first code running

    Mahasiswa(){

        System.out.println("constructor example");

    }

    // Constructor with parameter

    Mahasiswa(String namaMahasiswa, String NIMMahasiswa, int umurMahasiswa, double IPKMahasiswa){

        this.nama = namaMahasiswa;
        this.NIM = NIMMahasiswa;
        this.umur = umurMahasiswa;
        this.IPK = IPKMahasiswa;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(umur);
        System.out.println(IPK);

        // called method static

        Main.testing();

    }

    // method without return and without parameter

    void showData(){

        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
        System.out.println("Umur : " + this.umur);
        System.out.println("IPK  : " + this.IPK);
    }

    // method without return and with parameter

    void setName(String name){

        this.nama = name;

    }

    // method with return and without parameter

    String getName(){
        
        return this.nama;

    }

    String getNIM(){

        return this.NIM;

    }

    int getUmur(){

        return this.umur;

    }

    double getIPK(){

        return this.IPK;

    }


    // method with return and with parameter

    String messageFromStudent(String message){

        return message +" "+ this.nama;
    }

}

public class Main {
    public static void main(String[] args) {
       
        // Class and Object

        Mahasiswa m1 = new Mahasiswa();
        m1.nama = "Angel";
        m1.NIM = "125314112";
        m1.umur = 24;
        m1.IPK = 3.45;

        System.out.println(m1.nama);
        System.out.println(m1.NIM);
        System.out.println(m1.umur);
        System.out.println(m1.IPK);

        Mahasiswa m2 = new Mahasiswa();
        m2.nama = "Bertus";
        m2.NIM = "125314000";
        m2.umur = 32;
        m2.IPK = 3.67;

        System.out.println(m2.nama);
        System.out.println(m2.NIM);
        System.out.println(m2.umur);
        System.out.println(m2.IPK);

        // Construction running example

        Mahasiswa m3 = new Mahasiswa("Engel", "1234445", 45, 4.00);


        // run method static

        testing();

        // run method without return and without parameter

        Mahasiswa m4 = new Mahasiswa("Ayu", "623482323", 32, 4.00);
        m4.showData();

        // run method without return and with parameter

        m4.setName("Lukita");
        m4.showData();

        // run method with return and withour parameter

        System.out.println(m4.getName());
        System.out.println(m4.getNIM());
        System.out.println(m4.getUmur());
        System.out.println(m4.getIPK());

        // run method with return and with parameter

        String messages = m4.messageFromStudent("Thanks for calling me!");

        System.out.println(messages);
    }

    // method static example

    static void testing(){
        System.out.println("method static example");
    }
}