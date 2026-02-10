package Jobsheet1;

public class Fungsi {
    
    static int H_Aglonema = 75000;
    static int H_Keladi = 50000;
    static int H_Alocasia = 60000;
    static int H_Mawar = 10000;

    public static void main(String[] args) {
        
        int[][] stockBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        System.out.println("Laporan Cabang Royal Garden");
        Pendapatan(stockBunga);
    }

    public static void Pendapatan(int[][] stock){
        for(int i = 0; i < stock.length; i++) {
            int total = (stock[i][0] * H_Aglonema) + 
                        (stock[i][1] * H_Keladi) + 
                        (stock[i][2] * H_Alocasia) + 
                        (stock[i][3] * H_Mawar);

            String status = (total > 1500000) ? "Sangat Baik" : "Perlu Evaluasi";
            System.out.println("RoyalGarden " + (i + 1) + " " + total + "| Status" + status );
        }
    }
}
