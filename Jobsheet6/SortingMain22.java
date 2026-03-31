package Jobsheet6;

public class SortingMain22 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30, 20, 2, 8, 14};
        int c[] = {40, 10, 4, 9, 3};
    
        System.out.println("===Hasil===");
        Sorting22 dataurut1 = new Sorting22(a, a.length);

        System.out.println("Data Awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data Sudah di urutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();
        
        Sorting22 dataurut2 = new Sorting22(b, b.length);

        System.out.println("Data Awal 2");
        dataurut2.tampil();
        dataurut2.selectionSort();
        System.out.println("Data Sudah di urutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();

        Sorting22 dataurut3 = new Sorting22(c, c.length);

        System.out.println("Data Awal 3");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data Sudah di urutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();
    }

}
