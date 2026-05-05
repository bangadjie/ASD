package pertemuan12;

public class MHSiswa22 {
    String nim, nama, kelas;
    double ipk;

    public MHSiswa22(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilkaninformasi() {
        System.out.println(nim + " - " + nama + " - " + kelas + " - " + ipk);
    }
    
}
