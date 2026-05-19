package CM.CM2kuis;

public class Pesanan {
    int kodePesanan, harga;
    String namaPesanan;

    public Pesanan(int kodePesanan, String namaPesanan, int harga){
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }
    public void tampilkanPesanan(){
        System.out.println(kodePesanan + "-" + namaPesanan + "-" + harga);
    }
}
