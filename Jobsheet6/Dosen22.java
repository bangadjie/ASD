package Jobsheet6;

public class Dosen22 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen22(String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    void tampil() {
        System.out.println("Kode         : " + kode);
        System.out.println("Nama         : " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia         : " + usia);
    }
}