package Jobsheet6;
import java.util.Scanner;

public class MainDosen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen22 data = new DataDosen22();
        int pilih;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Usia Muda ke Tua - Bubble Sort)");
            System.out.println("4. Sorting DSC (Usia Tua ke Muda - Selection Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Kode: "); String kd = sc.nextLine();
                    System.out.print("Nama: "); String nm = sc.nextLine();
                    System.out.print("Jenis Kelamin (P/W): "); 
                    boolean jk = sc.nextLine().equalsIgnoreCase("P");
                    System.out.print("Usia: "); int usia = sc.nextInt();
                    data.tambah(new Dosen22(kd, nm, jk, usia));
                    break;
                case 2:
                    System.out.println("\n--- Daftar Seluruh Dosen ---");
                    data.tampil();
                    break;
                case 3:
                    data.sortingASC();
                    System.out.println("\nData berhasil diurutkan (Ascending)!");
                    data.tampil();
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("\nData berhasil diurutkan (Descending)!");
                    data.tampil();
                    break;
            }
        } while (pilih != 5);
    }
}