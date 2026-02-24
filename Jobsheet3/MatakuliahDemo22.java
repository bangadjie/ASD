package Jobsheet3;

import java.util.Scanner;

public class MatakuliahDemo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlahEks = Integer.parseInt(sc.nextLine());
        Matakuliah22 [] arrayOfMatakuliah = new Matakuliah22[jumlahEks];

        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("Kode : ");
            kode = sc.nextLine();
            System.out.print("Nama : ");
            nama = sc.nextLine();
            System.out.print("Sks : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------");

            arrayOfMatakuliah[i] = new Matakuliah22 (kode, nama, sks,jumlahJam);
        }

        for(int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode          : "+ arrayOfMatakuliah[i].kode);
            System.out.println("Nama          : "+ arrayOfMatakuliah[i].nama);
            System.out.println("Sks           : "+ arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam    : "+ arrayOfMatakuliah[i].jumlahJam);
            System.out.println("---------------------------------");
        }
    }
}
