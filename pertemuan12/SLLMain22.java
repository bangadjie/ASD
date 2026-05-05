package pertemuan12;

public class SLLMain22 {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();

        MHSiswa22 mhs1 = new MHSiswa22("21212203", "Dirga", "4D", 3.6);
        MHSiswa22 mhs2 = new MHSiswa22("22212202", "Cintia", "3C", 3.5);
        MHSiswa22 mhs3 = new MHSiswa22("23212201", "Bimon", "2B", 3.8);
        MHSiswa22 mhs4 = new MHSiswa22("24212200", "Alvaro", "1A", 4.0);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
