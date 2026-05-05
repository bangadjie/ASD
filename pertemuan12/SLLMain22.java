package pertemuan12;

import java.util.Scanner;

public class SLLMain22 {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();

        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU SINGLE LINKED LIST MAHASISWA =====");
            System.out.println("1. Tambah data depan");
            System.out.println("2. Tambah data belakang");
            System.out.println("3. Tambah data setelah key");
            System.out.println("4. Tambah data indeks tertentu");
            System.out.println("5. Ambil data index tertentu");
            System.out.println("6. Cari index mahasiswa dari nama");
            System.out.println("7. Hapus data depan");
            System.out.println("8. Hapus data belajang");
            System.out.println("9. hapus data dari nama");
            System.out.println("10. Hapus data dari index tertentu");
            System.out.println("11. tampilkan semua data");
            System.out.println("0. Keluar ");
            System.out.print("SIlahkan Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    sll.addFirst(inputDataMahasiswa(sc));
                    break;
                case 2:
                    sll.addLast(inputDataMahasiswa(sc));
                    break;
                case 3:
                    System.out.print("Masukkan Nama Key (setelah siapa): ");
                    String key = sc.nextLine();
                    sll.insertAfter(key, inputDataMahasiswa(sc));
                    break;
                case 4:
                    System.out.print("Masukkan Indeks: ");
                    int idxAdd = sc.nextInt();
                    sc.nextLine();
                    sll.insertAt(idxAdd, inputDataMahasiswa(sc));
                    break;
                case 5:
                    System.out.print("Masukkan Indeks yang dicari: ");
                    int idxGet = sc.nextInt();
                    sll.getData(idxGet);
                    break;
                case 6:
                    System.out.print("Masukkan Nama yang dicari: ");
                    String namaCari = sc.nextLine();
                    int hasilIdx = sll.indexOf(namaCari);
                    if (hasilIdx != -1) {
                        System.out.println("Mahasiswa ditemukan di indeks: " + hasilIdx);
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;
                case 7:
                    sll.removeFirst();
                    break;
                case 8:
                    sll.removeLast();
                    break;
                case 9:
                    System.out.print("Masukkan Nama yang ingin dihapus: ");
                    String namaHapus = sc.nextLine();
                    sll.remove(namaHapus);
                    break;
                case 10:
                    System.out.print("Masukkan Indeks yang ingin dihapus: ");
                    int idxRem = sc.nextInt();
                    sll.removeAt(idxRem);
                    break;
                case 11:
                    sll.print();
                    break;
                case 0:
                    System.out.println("Keluar program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }

    // Method pembantu agar tidak menulis input berulang-ulang
    public static MHSiswa22 inputDataMahasiswa(Scanner sc) {
        System.out.print("Masukkan NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine(); // Clear buffer
        return new MHSiswa22(nim, nama, kelas, ipk);
    }
}
        // MHSiswa22 mhs1 = new MHSiswa22("24212200", "Alvaro", "1A", 4.0);
        // MHSiswa22 mhs2 = new MHSiswa22("23212201", "Bimon", "2B", 3.8);
        // MHSiswa22 mhs3 = new MHSiswa22("22212202", "Cintia", "3C", 3.5);
        // MHSiswa22 mhs4 = new MHSiswa22("21212203", "Dirga", "4D", 3.6);

        // sll.print();
        // sll.addFirst(mhs4);
        // sll.print();
        // sll.addLast(mhs1);
        // sll.print();
        // sll.insertAfter("Dirga", mhs3);
        // sll.insertAt(2, mhs2);
        // sll.print();

        // System.out.println("dara index 1 : ");
        // sll.getData(1);

        // System.out.println("data mahasiswa an Bimon berapa pada index : "+sll.indexOf("bimon"));
        // System.out.println();

        // sll.removeFirst();
        // sll.removeLast();
        // sll.print();
        // sll.removeAt(0);
        // sll.print();