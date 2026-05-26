package Jobsheet14;

public class BinaryTreeMain22 {
    public static void main(String[] args) {
        BinaryTreeArray22 bta = new BinaryTreeArray22();
        // MahaSiswa22 mhs1 = new MahaSiswa22 ("244160121", "Ali", "A", 3.57);
        // MahaSiswa22 mhs2 = new MahaSiswa22 ("244160221", "Badar", "B", 3.85);
        // MahaSiswa22 mhs3 = new MahaSiswa22 ("244160185", "Candra", "C", 3.21);
        // MahaSiswa22 mhs4 = new MahaSiswa22 ("244160220", "Dewi", "B", 3.54);
        // MahaSiswa22 mhs5 = new MahaSiswa22 ("244160131", "Devi", "A", 3.72);
        // MahaSiswa22 mhs6 = new MahaSiswa22 ("244160205", "Ehsan", "D", 3.37);
        // MahaSiswa22 mhs7 = new MahaSiswa22 ("244160170", "Fizi", "B", 3.46);

        // MahaSiswa22[] datMahaSiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        // int idxLast = 6;
        // bta.populateData(datMahaSiswas,idxLast);
        // System.out.println("\nInorder Tracersal Mahasiswa: ");
        // bta.traverseInOrder(0);

        System.out.println("Masukkan data array");
        bta.add(new MahaSiswa22("2541070","Adjie", "TI-1G", 3.66));

         bta.add(new MahaSiswa22("244160121", "Ali", "A", 3.57));
         bta.add(new MahaSiswa22("244160221", "Badar", "B", 3.85));
         bta.add(new MahaSiswa22("244160185", "Candra", "C", 3.21));
         bta.add(new MahaSiswa22("244160131", "Devi", "A", 3.72));
         System.out.println("Hasil Travesal Preorder tugas 4b");
         bta.traversePreOrder(0);

        // BinaryTree22 bst = new BinaryTree22();
        
        // bst.add(new MahaSiswa22 ("244160121", "Ali", "A", 3.57));
        // bst.add(new MahaSiswa22 ("244160221", "Badar", "B", 3.85));
        // bst.add(new MahaSiswa22 ("244160185", "Candra", "C", 3.21));
        // bst.add(new MahaSiswa22 ("244160220", "Dewi", "B", 3.54));

        // System.out.println("\nDaftar semua mahasiswa (in oder traversal):");
        // bst.traverseInOrder (bst.root);

        // System.out.println("\nPencarian data mahasiswa:");
        // System.out.print("Cari mahasiswa dengan ipk: 3.54 ");
        // String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        // System.out.println(hasilCari);

        // System.out.print("Cari mahasiswa dengan ipk: 3.22: ");
        // hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        // System.out.println(hasilCari);

        // bst.add(new MahaSiswa22 ("244160131", "Devi", "A", 3.72));
        // bst.add(new MahaSiswa22 ("244160205", "Ehsan", "D", 3.37));
        // bst.add(new MahaSiswa22 ("244160170", "Fizi", "B", 3.46));

        // System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        // System.out.println("InOrder Traversal:");
        // bst.traverseInOrder (bst.root);

        // System.out.println("\nPreOrder Traversal:");
        // bst.traversePreOrder(bst.root);

        // System.out.println("\nPostOrder Traversal:");
        // bst.traversePostOrder (bst.root);

        // System.out.println("\nPenghapusan data mahasiswa");
        // bst.delete(3.57);

        // System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal) ");
        // bst.traverseInOrder (bst.root);

        
        // bst.add(new MahaSiswa22 ("244160121", "Ali", "A", 3.57));
        // bst.add(new MahaSiswa22 ("244160221", "Badar", "B", 3.85));
        // bst.add(new MahaSiswa22 ("244160185", "Candra", "C", 3.21));
        // bst.add(new MahaSiswa22 ("244160220", "Dewi", "B", 3.54));
        // bst.add(new MahaSiswa22 ("244160131", "Devi", "A", 3.72));
        // bst.add(new MahaSiswa22 ("244160205", "Ehsan", "D", 3.37));
        // bst.add(new MahaSiswa22 ("244160170", "Fizi", "B", 3.46));

        
    }
}
