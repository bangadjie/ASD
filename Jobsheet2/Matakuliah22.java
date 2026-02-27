package Jobsheet2;

public class Matakuliah22 {
    String kodeMK, nama;
    int sks, jmlJam;

    public Matakuliah22(String kodeMK, String nama, int sks, int jmlJam){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jmlJam = jmlJam;
    }

    void kurangiJam(int jam){
        if (this.jmlJam >= jam) {
            this.jmlJam -= jam;
            System.out.println("Jumlah jam berhasil di kurangi, sekarang menjadi: "+ this.jmlJam);
        }else{
            System.out.println("Jam tidak dapat di kurangi");
        }
    }

    void tambahJam(int jam){
            this.jmlJam += jam;
            System.out.println("Jumlah jam berhasil di tambahkan, sekarang menjadi: "+ this.jmlJam);
    }

    void ubahSKS(int sksBaru){
        this.sks = sksBaru;
        System.out.println("Sks telah diubah menjadi: " + this.sks);
    }

    void tampilInformasi(){
        System.out.println("==============================");
        System.out.println("Kode Matakuliah : " + kodeMK);
        System.out.println("Nama : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah Jam : " + jmlJam);
        System.out.println("==============================");
    }
}
