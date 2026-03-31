package Jobsheet6;
import java.util.Scanner;
public class MahasiswaDemo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi22 list = new MahasiswaBerprestasi22();
        Mahasiswa22 m1 = new Mahasiswa22("123", "Zidan", "2A", 3.2);
        Mahasiswa22 m2 = new Mahasiswa22("124", "Ayu", "2A", 3.5);
        Mahasiswa22 m3 = new Mahasiswa22("125", "Sofi", "2A", 3.1);
        Mahasiswa22 m4 = new Mahasiswa22("126", "Sita", "2A", 3.9);
        Mahasiswa22 m5 = new Mahasiswa22("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (Desk) : ");
        list.bubbleSort();
        list.tampil();

        MahasiswaBerprestasi22 listS = new MahasiswaBerprestasi22();
        System.out.println("\n=== SELECTION SORT (ASCENDING - INPUT) ===");
        System.out.print("Masukkan jumlah mahasiswa (Max 5): ");
        int jml = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < jml; i++) {
            System.out.println("Input Mahasiswa ke-" + (i + 1));
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            listS.tambah(new Mahasiswa22(nim, nama, kelas, ipk));
        }
        listS.selectionSort();
        listS.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC) : ");
        list.selectionSort();
        list.tampil();
    }
}