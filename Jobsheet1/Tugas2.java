package Jobsheet1;

import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal kuliah (n): ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];
        inputJadwal(jadwal, sc);

        int pilihan;
        do {
            System.out.println("\n=== MENU MANAJEMEN JADWAL ===");
            System.out.println("1. Tampilkan Seluruh Jadwal");
            System.out.println("2. Cari Jadwal Berdasarkan Hari");
            System.out.println("3. Cari Jadwal Berdasarkan Mata Kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanSemuaJadwal(jadwal);
                    break;
                case 2:
                    System.out.print("Masukkan Hari yang dicari: ");
                    String hariCari = sc.nextLine();
                    tampilkanBerdasarkanHari(jadwal, hariCari);
                    break;
                case 3:
                    System.out.print("Masukkan Nama Mata Kuliah yang dicari: ");
                    String mkCari = sc.nextLine();
                    tampilkanBerdasarkanMK(jadwal, mkCari);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);

        sc.close();
    }

    public static void inputJadwal(String[][] jadwal, Scanner sc) {
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("\nInput Jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari Kuliah      : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam Kuliah       : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    public static void tampilkanSemuaJadwal(String[][] jadwal) {
        System.out.println("\n-----------------------------------------------------------------------");
        System.out.println("Nama Mata Kuliah\t| Ruang\t\t| Hari\t\t| Jam");
        System.out.println("-----------------------------------------------------------------------");
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println(jadwal[i][0] + "\t| " + jadwal[i][1] + "\t| " + jadwal[i][2] + "\t| " + jadwal[i][3]);
        }
    }

    public static void tampilkanBerdasarkanHari(String[][] jadwal, String hari) {
        System.out.println("\nJadwal pada hari " + hari + ":");
        boolean ditemukan = false;
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println("- " + jadwal[i][0] + " (" + jadwal[i][3] + ") di " + jadwal[i][1]);
                ditemukan = true;
            }
        }
        if (!ditemukan)
            System.out.println("Tidak ada jadwal pada hari tersebut.");
    }

    public static void tampilkanBerdasarkanMK(String[][] jadwal, String mk) {
        System.out.println("\nInformasi Mata Kuliah " + mk + ":");
        boolean ditemukan = false;
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println("Ruang: " + jadwal[i][1] + ", Hari: " + jadwal[i][2] + ", Jam: " + jadwal[i][3]);
                ditemukan = true;
            }
        }
        if (!ditemukan)
            System.out.println("Mata kuliah tidak ditemukan.");
    }
}
