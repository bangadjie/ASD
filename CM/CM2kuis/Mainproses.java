package CM.CM2kuis;
import java.util.Scanner;

public class Mainproses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList ls = new DoubleLinkedList();

        // ls.tambahAntrean(new Pembeli("Ainra", "08224500000"));
        // ls.tambahAntrean(new Pembeli("Danra", "08224511111"));
        // ls.tambahAntrean(new Pembeli("Sanri", "08224522222"));
        
        int pilihan;
        do {
            System.out.println("=== Pilihlah Sesuai Pilihanmu ===");
            System.out.println("1. Tambahkan Antrian");
            System.out.println("2. Tambahkan Antrian Prioritas");//antrian prioritas
            System.out.println("3. Cetak Antrian");
            System.out.println("4. Hapus Antrian dan Pesan");
            System.out.println("5. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.println("==================================");
            pilihan = sc.nextInt();
            sc.nextLine();

            String nama = "";
            String noHP = "";
            Pembeli pembeliBaru = new Pembeli(nama, noHP);
            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Input  Data Pembli Baru ---");
                    System.out.print("Nama Pembeli : ");
                    nama = sc.nextLine();
                    System.out.print("No HP : ");
                    noHP = sc.nextLine();

                    pembeliBaru = new Pembeli(nama, noHP);
                    ls.tambahAntrean(pembeliBaru);
                    break;
                //pembuatan fungsi baru atran prioritas
                case 2:
                    System.out.println();
                    System.out.println("\n--- Input  Data Pembli Piroritas ---");
                    System.out.print("Nama Pembeli : ");
                    nama = sc.nextLine();
                    System.out.print("No HP : ");
                    noHP = sc.nextLine();

                    pembeliBaru = new Pembeli(nama, noHP);
                    ls.tambahAntreanPrioritas(pembeliBaru);
                    break;
                case 3:
                    System.out.println();
                    ls.cetakAntrian();
                    break;
                case 4:
                    if (ls.isEmptyPembeli()) {
                        System.out.println("\n Antrean kosong, gak ada pembeli yang di panggil");
                    }else{
                        System.out.println("\n--- Proses Transaksi Pembeli ---");
                        System.out.print("Masukkan Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Masukkan Nama Pesanan : ");
                        String namaPesanan = sc.nextLine();
                        System.out.print("Masukkan Harga        : ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        ls.hapusAntreandanPesanan(kode, namaPesanan, harga);
                    }
                    break;
                case 5:
                    System.out.println();
                    ls.cetakLaporanPesanan();
                    break;
                case 0:
                    System.out.println("terimakasih telah berkunjung");
                break;
            
                default:
                    System.out.println("\nSistem: Pilihan menu tidak valid. Coba lagi.");
            }
        } while (pilihan != 0);
    }
}
