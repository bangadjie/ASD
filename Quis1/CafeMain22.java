package Quis1;
import java.util.*;
public class CafeMain22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            Cafe22 cafe = new Cafe22("americano", 10000, 2);
            cafe.menghitungTotalHarga();
            cafe.tampilDataOrder();
            
            cafe.tampilkanDataProduk();
            cafe.tambahProduk(sc);
            cafe.tampilkanDataProduk();
    }
}
