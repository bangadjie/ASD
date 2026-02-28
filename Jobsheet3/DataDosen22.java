package Jobsheet3;

public class DataDosen22 {
    
    public void dataSemuaDosen(Dosen22[] arrayOfDosen){
        System.err.println("\n====== DATA SEMUA DOSEN ======");
        for(Dosen22 dsn : arrayOfDosen) {
            System.out.println("Kode : " + dsn.kode);
            System.out.println("Nama : " + dsn.nama);
            System.out.println("Jenis Kelamin : " + dsn.jenisKelamin);
            System.out.println("Usia : " + dsn.usia);
            System.out.println("=============================");
        }
    }

    public void jmlDosenPerJenisKelamin(Dosen22[] arrayOfDosen){
        int pria = 0, wanita = 0;
        for(Dosen22 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin.equalsIgnoreCase("Pria")) {
                pria++;
            }else if(dsn.jenisKelamin.equalsIgnoreCase("Wanita")){
                wanita++;
            }
        }
        System.out.println("\n====== Jumlah Dosen Per Gender ======");
        System.out.println("Dosen Pria : " + pria);
        System.out.println("Dosen Wanita : " + wanita);
    }

    public void rataUsiaDosenPerJenisKelamin(Dosen22[] arrayOfDosen){
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for(Dosen22 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin.equalsIgnoreCase("Pria")){
                totalUsiaPria += dsn.usia;
                jmlPria++;
            }else{
                totalUsiaWanita += dsn.usia;
                jmlWanita++;
            }
        }
        System.out.println("\n====== RATA-RATA USIA PER GENDER ======");
        System.out.println("Rata-rata Usia Pria : " + (jmlPria > 0 ? (double)totalUsiaPria/jmlPria : 0));
        System.out.println("Rata-rata Usia Wanita : " + (jmlWanita > 0 ? (double)totalUsiaWanita/jmlWanita : 0));
    }

    public void dosenPalingTua(Dosen22[] arrayOfDosen) {
        Dosen22 palingTua = arrayOfDosen[0];
        for (Dosen22 dsn : arrayOfDosen) {
            if (dsn.usia > palingTua.usia) {
                palingTua = dsn;
            }
        }
        System.out.println("\n========== DOSEN PALING TUA ==========");
        System.out.println("Nama : " + palingTua.nama + " (Usia: " + palingTua.usia + ")");
    }

    public void dosenPalingMuda(Dosen22[] arrayOfDosen) {
        Dosen22 palingMuda = arrayOfDosen[0];
        for (Dosen22 dsn : arrayOfDosen) {
            if (dsn.usia < palingMuda.usia) {
                palingMuda = dsn;
            }
        }
        System.out.println("\n========== DOSEN PALING MUDA ==========");
        System.out.println("Nama : " + palingMuda.nama + " (Usia: " + palingMuda.usia + ")");
    }
}
