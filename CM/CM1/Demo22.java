package CM.CM1;

import java.util.Scanner;

public class Demo22 {
    public static void main(String[] args) {
        // Array objek mahasiswa
        Mahasiswa22[] daftarMahasiswa = new Mahasiswa22[3];
        daftarMahasiswa[0] = new Mahasiswa22("22001", "Andi", "Teknik Informatika");
        daftarMahasiswa[1] = new Mahasiswa22("22002", "Budi", "Teknik Informatika");
        daftarMahasiswa[2] = new Mahasiswa22("22003", "Citra", "Sistem Informasi Bisnis");

        // array objek buku
        Buku22[] daftarBuku = new Buku22[4];
        daftarBuku[0] = new Buku22("B001", "Algoritma", "2020");
        daftarBuku[1] = new Buku22("B002", "Basis Data", "2019");
        daftarBuku[2] = new Buku22("B003", "Pemrograman", "2021");
        daftarBuku[3] = new Buku22("B004", "Fisika", "2020");

        // array objek peminjaman
        Peminjaman22[] daftarPeminjaman = new Peminjaman22[5];
        daftarPeminjaman[0] = new Peminjaman22(daftarMahasiswa[0], daftarBuku[0], 7);
        daftarPeminjaman[1] = new Peminjaman22(daftarMahasiswa[1], daftarBuku[1], 3);
        daftarPeminjaman[2] = new Peminjaman22(daftarMahasiswa[2], daftarBuku[2], 10);
        daftarPeminjaman[3] = new Peminjaman22(daftarMahasiswa[2], daftarBuku[3], 6);
        daftarPeminjaman[4] = new Peminjaman22(daftarMahasiswa[0], daftarBuku[1], 4);

        Scanner sc = new Scanner(System.in);
        int pilihan;

        for (Peminjaman22 pinjam : daftarPeminjaman) {
            pinjam.hitungDenda();
        }

        do {
            System.out.println("\n=== MENU MANAJEMEN JADWAL ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Menampilkna Denda di atas 0");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("=== Daftar Mahasiswa ===");
                    for (Mahasiswa22 mhs : daftarMahasiswa) {
                        mhs.tampilInformasiMhs();
                    }
                    break;
                case 2:
                    System.out.println("=== Daftar Buku ===");
                    for (Buku22 buku : daftarBuku) {
                        buku.tampilInformasiBuku();
                    }
                    break;
                case 3:
                    System.out.println("=== Daftar Peminjaman ===");
                    System.out.printf("%-15s | %-20s | %-5s | %-10s | %-10s\n",
                            "Nama", "Judul Buku", "Lama", "Terlambat", "Denda");
                    System.out.println("---------------------------------------------------------------------------");
                    for (Peminjaman22 pinjam : daftarPeminjaman) {
                        pinjam.tampilInformasiPeminjaman();
                    }
                    break;
                case 4:
                    System.out.println("=== Data diurutkan berdasarkan denda ===");
                    daftarPeminjaman[0].insertionSort(daftarPeminjaman);

                    System.out.printf("%-15s | %-20s | %-5s | %-10s | %-10s\n",
                            "Nama", "Judul Buku", "Lama", "Terlambat", "Denda");
                    System.out.println("---------------------------------------------------------------------------");

                    for (Peminjaman22 pinjam : daftarPeminjaman) {
                        pinjam.tampilInformasiPeminjaman();
                    }
                    break;
                case 5:
                    System.out.println("=== Menampilkna Denda di atas 0 ===");
                    //cari denda di atas 0
                    System.out.printf("%-15s | %-20s | %-5s | %-10s | %-10s\n",
                            "Nama", "Judul Buku", "Lama", "Terlambat", "Denda");
                    System.out.println("---------------------------------------------------------------------------");
                    for (Peminjaman22 pinjam : daftarPeminjaman) {
                        if (pinjam.denda > 0) {
                            pinjam.tampilInformasiPeminjaman();
                        }
                    }


                    // daftarPeminjaman[0].sortNIM(daftarPeminjaman);

                    // System.out.print("Masukkan NIM yang dicari: ");
                    // String cariNIM = sc.nextLine();
                    // // int target = Integer.parseInt(cariNIM);
                    // int posisi = daftarPeminjaman[0].sequentialSearchByName(daftarPeminjaman, cariNIM);

                    // if (posisi != -1) {
                    //     System.out.println("Data Ditemukan!");
                    //     daftarPeminjaman[posisi].tampilInformasiPeminjaman();
                    // } else if {
                    //     System.out.println("Data tidak ditemukan!");
                    // }else{
                        // System.out.println("Data tidak ditemukan!");
                        // }
                    // break;
                case 0:
                    System.out.println("=== Terimakasih Sudah Mampir ===");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();

    }
}
