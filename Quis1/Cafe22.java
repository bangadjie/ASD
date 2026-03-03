package Quis1;

import java.util.Scanner;

public class Cafe22 {

    // class bernama Cafe22 dan CafeMain

    // atribut
    // - Pelanggan : String
    // -Produk : String
    // -Harga : double

    // Method
    // -inputjmlProduk : void();
    // -menghitungtotalharga:void();
    // tampildataOrder:void();
    // public String Admin;
    // public String Pelanggan;
    public String Produk;
    public double Harga;
    public int jmlProduk;

    public Cafe22(String Produk, double Harga, int jmlProduk) {
        this.Produk = Produk;
        this.Harga = Harga;
        this.jmlProduk = jmlProduk;
    }

    void tambahProduk(Scanner sc) {
        System.out.print("Masukkan jumlah produk: ");
        int jumlahProduk = sc.nextInt();
        sc.nextLine();

        Cafe22[] arrayOfCafe = new Cafe22[jumlahProduk];
        String Produk, dummy;
        double Harga;
        int jmlProduk;

        for (int i = 0; i < jumlahProduk; i++) {
            System.out.println("Masukkan Data Produk ke-" + (i + 1));
            System.out.print("Nama Produk : ");
            Produk = sc.nextLine();
            System.out.print("Harga : ");
            dummy = sc.nextLine();
            Harga = Double.parseDouble(dummy);
            System.out.print("Jumlah Produk : ");
            dummy = sc.nextLine();
            jmlProduk = Integer.parseInt(dummy);
            System.out.println("==================================");

            arrayOfCafe[i] = new Cafe22(Produk, Harga, jmlProduk);
        }
    }
    
    // int count = arrayOfCafe.length + 1;

    void menghitungTotalHarga() {
        double totalHarga = Harga * jmlProduk;
        System.out.println("Total Harga : " + totalHarga);
    }

    void tampilkanDataProduk() {
        System.out.println("-----DATA PRODUK----");
        System.out.println("Nama Produk : " + Produk);
        System.out.println("Harga : " + Harga);
        System.out.println("Jumlah Produk : " + jmlProduk);
        System.out.println("------------------------------");
    }

    void tampilDataOrder() {
        System.out.println("----DATA ORDER----");
        System.out.println("Nama Produk : " + Produk);
        System.out.println("Harga : " + Harga);
        System.out.println("Jumlah Produk : " + jmlProduk);
        System.out.println("------------------------------");
    }
}
