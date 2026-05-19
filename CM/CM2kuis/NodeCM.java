package CM.CM2kuis;

public class NodeCM {
    public static class NodePembeli{
        Pembeli data1;
        NodePembeli next1;
        NodePembeli prev1;

        public NodePembeli(NodePembeli prev, Pembeli data, NodePembeli next){
            this.prev1 = prev;
            this.data1 = data;
            this.next1 = next;
        }
    }

    public static class NodePesanan{
        Pesanan data2;
        NodePesanan next2;
        NodePesanan prev2;

        public NodePesanan(NodePesanan prev, Pesanan data, NodePesanan next){
            this.prev2 = prev;
            this.data2 = data;
            this.next2 = next;
        }
    }
}
