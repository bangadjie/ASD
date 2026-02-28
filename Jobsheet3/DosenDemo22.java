package Jobsheet3;

import java.util.Scanner;

public class DosenDemo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen22[] arrayOfDosen = new Dosen22[3];
        String kode, nama, jenisKelamin, dummy;
        int usia;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode : ");
            kode = sc.nextLine();
            System.out.print("Nama : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            jenisKelamin = sc.nextLine();
            System.out.print("Usia : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("==================================");

            arrayOfDosen[i] = new Dosen22(kode, nama, jenisKelamin, usia);
        }

            DataDosen22 helper = new DataDosen22();
            helper.dataSemuaDosen(arrayOfDosen);
            helper.jmlDosenPerJenisKelamin(arrayOfDosen);
            helper.rataUsiaDosenPerJenisKelamin(arrayOfDosen);
            helper.dosenPalingTua(arrayOfDosen);
            helper.dosenPalingMuda(arrayOfDosen);

        int count = 1;
        for (Dosen22 dsn : arrayOfDosen) {
            System.out.println("==== Kumpulan Data Dosen ====");
            System.out.println("Data Dosen ke-" + count);
            System.out.println("Kode : " + dsn.kode);
            System.out.println("Nama : " + dsn.nama);
            System.out.println("Jenis Kelamin : " + dsn.jenisKelamin);
            System.out.println("Usia : " + dsn.usia);
            System.out.println("------------------------------");
            count++;
        }
    }
}
