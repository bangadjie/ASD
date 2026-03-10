package Jobsheet5;

public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa[] mhs = new Mahasiswa[8];
        
        mhs[0] = new Mahasiswa("Ahmad", "220101001", 2022, 78, 82);
        mhs[1] = new Mahasiswa("Budi", "220101002", 2022, 85, 88);
        mhs[2] = new Mahasiswa("Cindy", "220101003", 2021, 90, 87);
        mhs[3] = new Mahasiswa("Dian", "220101004", 2021, 76, 79);
        mhs[4] = new Mahasiswa("Eko", "220101005", 2023, 92, 95);
        mhs[5] = new Mahasiswa("Fajar", "220101006", 2020, 88, 85);
        mhs[6] = new Mahasiswa("Gina", "220101007", 2023, 80, 83);
        mhs[7] = new Mahasiswa("Hadi", "220101008", 2020, 82, 84);

        HitungNilai hitung = new HitungNilai();
        int jumlahData = mhs.length;

        System.out.println("=== HASIL PERHITUNGAN NILAI MAHASISWA ===");
        
        int tertinggiUTS = hitung.maxUTS(mhs, 0, jumlahData - 1);
        System.out.println("a) Nilai UTS Tertinggi (Divide and Conquer): " + tertinggiUTS);
        
        int terendahUTS = hitung.minUTS(mhs, 0, jumlahData - 1);
        System.out.println("b) Nilai UTS Terendah (Divide and Conquer): " + terendahUTS);
        
        double rataRataUAS = hitung.rataUAS(mhs);
        System.out.println("c) Rata-rata Nilai UAS (Brute Force): " + rataRataUAS);
    }
}
