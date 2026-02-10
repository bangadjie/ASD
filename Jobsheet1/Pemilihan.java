package Jobsheet1;

import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("===== INPUT DATA MAHASISWA =====");
        // System.out.print("Nama : ");
        // String Nama = sc.nextLine();
        // System.out.print("NIM : ");
        // long NIM = sc.nextLong();

        String nilaiHuruf1 = "";
        String Status1 = "";

        System.out.println("=== Masukkan Nilai Mahasiswa ===");
        // Whele
        System.out.print(" Masukkan nilai Tugas : ");
        int nilaiTgs1 = sc.nextInt();
        System.out.print(" Masukkan nilai Kuis : ");
        int nilaiKuis = sc.nextInt();
        System.out.print(" Masukkan nilai Uts : ");
        int nilaiUts1 = sc.nextInt();
        System.out.print(" Masukkan nilai UAS : ");
        int nilaiUas1 = sc.nextInt();

        if ((0 < nilaiTgs1 && nilaiTgs1 > 100) || (0 < nilaiKuis && nilaiKuis > 100)
                || (0 < nilaiUts1 && nilaiUts1 > 100) || (0 < nilaiUas1 && nilaiUas1 > 100)) {
            System.out.println("===============================================");
            System.out.println("===============================================");
            System.out.println("Nilai Tidak Valid");
            System.out.println("===============================================");
            System.out.println("===============================================");
        } else {
            double nilaiAkhir1 = (nilaiTgs1 * 0.2) + (nilaiKuis * 0.2) + (nilaiUts1 * 0.3) + (nilaiUas1 * 0.3);
            if (80 < nilaiAkhir1 && nilaiAkhir1 <= 100) {
                nilaiHuruf1 = "A";
            } else if (73 < nilaiAkhir1 && nilaiAkhir1 <= 80) {
                nilaiHuruf1 = "B+";
            } else if (65 < nilaiAkhir1 && nilaiAkhir1 <= 73) {
                nilaiHuruf1 = "B";
            } else if (60 < nilaiAkhir1 && nilaiAkhir1 <= 65) {
                nilaiHuruf1 = "C+";
            } else if (50 < nilaiAkhir1 && nilaiAkhir1 <= 60) {
                nilaiHuruf1 = "C";
            } else if (39 < nilaiAkhir1 && nilaiAkhir1 <= 50) {
                nilaiHuruf1 = "D";
            } else if (0 < nilaiAkhir1 && nilaiAkhir1 <= 39) {
                nilaiHuruf1 = "E";
            }

            if (nilaiHuruf1.equals("D") || nilaiHuruf1.equals("E")) {
                Status1 = "Maaf Anda Tidak Lulus";
            } else {
                Status1 = "Selamat Anda Lulus";
            }

            // System.out.println("========== HASIL PENILAIAN AKADEMIK ==========");
            // System.out.println("Nama : " + Nama);
            // System.out.println("NIM : " + NIM);

            System.out.println("===============================================");
            System.out.println("===============================================");
            System.out.println("Nilai Akhir : " + nilaiAkhir1);
            System.out.println("Nilai Huruf : " + nilaiHuruf1);
            System.out.println("===============================================");
            System.out.println("===============================================");
            System.out.println(Status1);

            sc.close();
        }
    }
}