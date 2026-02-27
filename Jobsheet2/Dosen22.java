package Jobsheet2;

public class Dosen22 {
    String idDosen, nama, bidangKeahlian;
    int thnBergabung;
    boolean statusAktif;

    public Dosen22(String idDosen, String nama,boolean statusAktif, int thnBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.thnBergabung = thnBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi(){
        System.out.println("==============================");
        System.out.println("Id Dosen : " + idDosen);
        System.out.println("Nama : " + nama);
        System.out.println("status : " + statusAktif);
        System.out.println("Tahun Bergabung : " + thnBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("==============================");
    }

    void setStatusAktif(boolean status){
        this.statusAktif = status;
        System.out.println("Status Aktif "+ nama + "sekarang menjadi " + (statusAktif ? "Aktif" : "Tidak Aktif") );
    }

    int masaKerja(int thnSekarang){
        return thnSekarang - thnBergabung;
    }

    void ubahKeahlian(String bidang){
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian " + nama + " berhasil diubah ke: " + bidangKeahlian);
    }
}
