package com.heritage;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mah = new Mahasiswa("Engelbert");

        System.out.println("Nama Mahasiswa " + mah.namaMahasiswa);

        mah.show();

        Nilai nilai = new Nilai(80);
        nilai.getNilai();

        // implementasi menggunakan kelas heritage
        System.out.println("Siswa " + nilai.namaMahasiswa + " mendapatkan nilai sebesar " + nilai.nilaimah);
    }
}
