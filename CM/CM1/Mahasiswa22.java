package CM.CM1;

public class Mahasiswa22 {
    String nim;
    String nama;
    String prodi;

    Mahasiswa22(){
    }
    Mahasiswa22(String nm, String name, String prd){
        nim = nm;
        nama = name;
        prodi = prd;
    } 
    void tampilInformasiMhs(){
        System.out.printf("%-10s | %-15s | %-20s\n ", nim, nama, prodi);
    }
}
