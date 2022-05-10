package com.static_part;

import java.util.ArrayList;

class Mahasiswa{

    // static attribute
    public static String namaMahasiswa;
    static String mataKuliah;
    
    // static Arraylist attribute
    
    public static ArrayList<String> listMataKuliah = new ArrayList<String>();
    public static ArrayList<String> listNamaMahasiwa = new ArrayList<String>();

    Mahasiswa(String namaMahasiwa, String mataKuliah){

        this.namaMahasiswa = namaMahasiwa;
        this.mataKuliah = mataKuliah;
        // adding value in mataKuliah attribut with data String
        Mahasiswa.listMataKuliah.add(this.mataKuliah);
        Mahasiswa.listNamaMahasiwa.add(this.namaMahasiswa);

    }

    void show(){
        System.out.println("Nama Mahasiswa : " + this.namaMahasiswa);
    }

    void setMataKuliah(String mataKuliah){
        this.mataKuliah = mataKuliah;
    }

    // make static method

    static ArrayList<String> getMataKuliahList(){
        return Mahasiswa.listMataKuliah;
    }

    static ArrayList<String> getNamaMahasiswaList(){
        return Mahasiswa.listNamaMahasiwa;
    }

}
public class Main{

    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa("Budi", "Statistic");
        Mahasiswa mahasiswa2 = new Mahasiswa("Agus", "Pramuka");
        Mahasiswa mahasiswa3 = new Mahasiswa("Engel", "Math");

        // call getMataKuliahJurusan

        System.out.println("Semua matakuliah = " + Mahasiswa.getMataKuliahList());

        System.out.println("Semua nama mahasiswa = " + Mahasiswa.getNamaMahasiswaList());
    }
}