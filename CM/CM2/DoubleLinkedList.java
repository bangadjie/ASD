package CM.CM2;
import CM.CM2.NodeCM.NodePembeli;
import CM.CM2.NodeCM.NodePesanan;


public class DoubleLinkedList {
    NodePembeli head1;
    NodePembeli tail1;
    NodePesanan head2;
    NodePesanan tail2;
    int size;

    public DoubleLinkedList(){
        head1 = null;
        tail1 = null;
        head2 = null;
        tail2 = null;
        size = 0;
    }

    public boolean isEmptyPembeli(){
        return head1 == null;
    }

    public boolean isEmptyPesanan(){
        return head2 == null;
    }

    public void tambahAntrean(Pembeli dataBaru){
        NodePembeli newNode = new NodePembeli(null, dataBaru, null);

        if (isEmptyPembeli()) {
            head1 = tail1 = newNode;
        }else{
            tail1.next1 = newNode;
            newNode.prev1 = tail1;
            tail1 = newNode;
        }
        size++;
        // System.out.println("Sistem: " + dataBaru.namaPembeli + "Masuk antrean.");
    }

    public void cetakAntrian(){
        if (isEmptyPembeli()) {
            System.out.println("------------------------------------");
            System.out.println("Daftar Antrian Pembeli: KOSONG");
            System.out.println("------------------------------------");
            return;
        }
            System.out.println("------------------------------------");
            System.out.println("Daftar Antrian Pembeli");
            System.out.println("------------------------------------");
            System.out.println("No Antrian\tNama\t\tNo HP");
            System.out.println("------------------------------------");

            NodePembeli current = head1;
            int nomer = 1;

            while (current != null) {
                System.out.println(nomer + "\t\t" + current.data1.namaPembeli + "\t\t" + current.data1.NoHp);
            
            current = current.next1; 
            nomer++;
        }
        System.out.println("====================================");
    }

    public void hapusAntreandanPesanan(int kode, String namaMakanan, int harga){
            if (isEmptyPembeli()) {
                System.out.println("Tidak ada antrean pembeli");
                return;
            }

            Pembeli pembeliSekarang = head1.data1;

            if (head1 == tail1) {
                head1 = tail1 = null;
            }else{
                head1 = head1.next1;
                head1.prev1 = null;
            }
            size--;

            Pesanan pesananBaru = new Pesanan(kode, namaMakanan, harga);
            NodePesanan newNodePesanan = new NodePesanan(null, pesananBaru, null);

            if (isEmptyPesanan()) {
                head2 = tail2 = newNodePesanan;
            }else{
                tail2.next2 = newNodePesanan;
                newNodePesanan.prev2 = tail2;
                tail2 = newNodePesanan;
            }
            System.out.println("\n------------------------------------------------");
        System.out.println(pembeliSekarang.namaPembeli + " ke kasir sa memesan " + namaMakanan);
        System.out.println("------------------------------------------------");
        }
        
        public void sortingPesanan(){
            if (isEmptyPesanan()) {
                return;
            }
            boolean swapped;
            NodePesanan current;

            do {
                swapped = false;
                current = head2;
                while (current.next2 != null) {
                    if (current.data2.namaPesanan.compareToIgnoreCase(current.next2.data2.namaPesanan) > 0) {
                        Pesanan temp = current.data2;
                        current.data2 = current.next2.data2;
                        current.next2.data2 = temp;

                        swapped = true;
                    }
                    current = current.next2;
                }
            } while (swapped);
        }

        public void cetakLaporanPesanan(){
            if (isEmptyPesanan()) {
            System.out.println("------------------------------------");
            System.out.println("Laporan Pesanan: BELUM ADA TRANSAKSI");
            System.out.println("------------------------------------");
            return;
        }

        sortingPesanan();

        System.out.println("--------------------------------------");
        System.out.println("  LAPORAN PESANAN (URUT NAMA PESANAN) ");
        System.out.println("--------------------------------------");
        System.out.println("Kode Pesanan\tNama Pesanan\tHarga");
        System.out.println("------------------------------------");

        NodePesanan current = head2;
        int totalPendapatan = 0;

        while (current != null) {
            System.out.println(current.data2.kodePesanan + "\t\t" + current.data2.namaPesanan + "\t\t" + current.data2.harga);
            totalPendapatan += current.data2.harga;
            current = current.next2;
        }
        System.out.println("------------------------------------");
        System.out.println("TOTAL PENDAPATAN RESTORAN: Rp " + totalPendapatan);
        System.out.println("====================================");
        }
        //serching pesanan
        
}
