package Jobsheet1;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = sc.nextInt();
        sc.nextLine(); 

        String[] namaMK = new String[jumlahMK];
        int[] bobotSKS = new int[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] nilaiSetara = new double[jumlahMK];

        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("\nData Mata Kuliah ke-" + (i + 1));
            System.out.print("Masukkan nama mata kuliah: ");
            namaMK[i] = sc.nextLine();
            System.out.print("Masukkan bobot SKS       : ");
            bobotSKS[i] = sc.nextInt();
            System.out.print("Masukkan nilai Angka     : ");
            nilaiAngka[i] = sc.nextDouble();
            sc.nextLine(); 

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A"; nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+"; nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B"; nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+"; nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C"; nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D"; nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E"; nilaiSetara[i] = 0.0;
            }
        }

        double totalBobotXSetara = 0;
        int totalSKS = 0;

        System.out.println("\nHasil Konversi Nilai");
        System.out.println("================================================================");
        System.out.println("MK\t\tNilai Angka\tNilai Huruf\tBobot Nilai");
        System.out.println("----------------------------------------------------------------");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.println(namaMK[i] + "\t\t" + nilaiAngka[i] + "\t\t" + nilaiHuruf[i] + "\t\t" + nilaiSetara[i]);
            
            totalBobotXSetara += (nilaiSetara[i] * bobotSKS[i]);
            totalSKS += bobotSKS[i];
        }
        double ipSemester = totalBobotXSetara / totalSKS;
        System.out.println("================================================================");
        // System.out.println("Total SKS   : " + totalSKS);
        System.out.println("IP : " + ipSemester);
        
        sc.close();
    }

}
