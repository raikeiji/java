package com.static_part;

class Mahasiswa{

    public static String namaMahasiswa = "Ari";

    Mahasiswa(String namaMahasiwa){

        this.namaMahasiswa = namaMahasiwa;

    }

    void show(){
        System.out.println("Nama Mahasiswa : " + this.namaMahasiswa);
    }

}
public class Main{

    public static void main(String[] args) {

        // menampilkan nama mahasiswa menggunakan kelas static
        System.out.println(Mahasiswa.namaMahasiswa);

        // menampilkan nama mahasiwa menggunakan objek mahasiswa

        Mahasiswa mahasiswa = new Mahasiswa("Budi");
        System.out.println("Nama Mahasiswa : " + mahasiswa.namaMahasiswa);
    }
}