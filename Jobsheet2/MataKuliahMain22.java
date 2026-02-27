package Jobsheet2;

public class MataKuliahMain22 {
    public static void main(String[] args) {
        Matakuliah22 mk1 = new Matakuliah22(null, null, 0, 0);
        mk1.kodeMK = "ASD";
        mk1.nama = "Algoritma Struktur Data";
        mk1.sks = 2;
        mk1.jmlJam = 4;

        Matakuliah22 mk2 = new Matakuliah22("PASD", "Praktik Algoritma Struktur Data", 2, 6);

        System.out.println("=== Data Matakuliah 1 ===");
        mk1.tampilInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(4);
        mk1.kurangiJam(1);
        mk1.tampilInformasi();

        System.out.println("=== Data Matakuliah 2 ===");
        mk2.tampilInformasi();
        mk2.tambahJam(4);
        mk2.tampilInformasi();
        System.out.println("coba mengurangi sampai 0");
        mk2.kurangiJam(10);
        mk2.tampilInformasi();
    }
}
