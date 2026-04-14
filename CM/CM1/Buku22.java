package CM.CM1;

public class Buku22 {
    String kodeBK;
    String judul;
    String thnTerbit;

    Buku22(){
    }
    Buku22(String kdbk, String jdl,String thnTer){
        kodeBK = kdbk;
        judul = jdl;
        thnTerbit = thnTer;
    }
    void tampilInformasiBuku(){
        System.out.printf("%-10s | %-15s | %-15s\n ", kodeBK, judul, thnTerbit);
    }
}
