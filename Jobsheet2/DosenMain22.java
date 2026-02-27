package Jobsheet2;

public class DosenMain22 {
    public static void main(String[] args) {
        Dosen22 dsn1 = new Dosen22(null, null, false, 0, null);
        dsn1.idDosen = "DSN01";
        dsn1.nama = "Dr. Andi Wijaya";
        dsn1.statusAktif = true;
        dsn1.thnBergabung = 2015;
        dsn1.bidangKeahlian = "Kecerdasan Buatan";

        Dosen22 dsn2 = new Dosen22("DSN02", "Ir. Maya Sari", false, 2020, "Rekayasa Perangkat Lunak");

        System.out.println("--- Informasi Dosen 1 ---");
        dsn1.tampilInformasi();
        System.out.println("Masa Kerja: " + dsn1.masaKerja(2026) + " tahun");
        dsn1.ubahKeahlian("Data Science");
        
        System.out.println("\n--- Informasi Dosen 2 ---");
        dsn2.tampilInformasi();
        dsn2.setStatusAktif(true);
        System.out.println("Masa Kerja: " + dsn2.masaKerja(2026) + " tahun");
        dsn2.tampilInformasi();
    }
}

