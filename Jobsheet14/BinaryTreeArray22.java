package Jobsheet14;

public class BinaryTreeArray22 {
        MahaSiswa22[] dataMahasiswa;
        int idxLast;

        public BinaryTreeArray22(){
            this.dataMahasiswa = new MahaSiswa22[10];
        }
        void populateData(MahaSiswa22 dataMhs[], int idxLast){
            this.dataMahasiswa = dataMhs;
            this.idxLast = idxLast;
        }
        void traverseInOrder(int idxStart){
            if (idxStart <= idxLast) {
                if (dataMahasiswa[idxStart+1] != null) {
                    traverseInOrder(2*idxStart+1);
                    dataMahasiswa[idxStart].tampilInformasi();
                    traverseInOrder(2*idxStart+2);
                }
            }
        }
        
    
    // TUGAS 4 (Poin 1): Method add() untuk Memasukkan Data ke Array BST
    public void add(MahaSiswa22 dataMhs) {
        // Jika array masih kosong, dataBaru otomatis jadi Root di indeks 0
        if (dataMahasiswa[0] == null) {
            dataMahasiswa[0] = dataMhs;
            idxLast = 0;
            return;
        }

        int currentIdx = 0;
        while (currentIdx < dataMahasiswa.length) {
            // Sifat BST: IPK data baru dibandingkan dengan IPK data di indeks saat ini
            if (dataMhs.ipk < dataMahasiswa[currentIdx].ipk) {
                int leftIdx = 2 * currentIdx + 1; // Rumus mencari indeks anak kiri

                // Proteksi jika indeks melebihi kapasitas panjang array yang disediakan
                if (leftIdx >= dataMahasiswa.length) {
                    System.out.println("Array Full! Tidak bisa menampung data baru.");
                    break;
                }
                // Jika slot anak kiri kosong, langsung tempatkan data baru di sini
                if (dataMahasiswa[leftIdx] == null) {
                    dataMahasiswa[leftIdx] = dataMhs;
                    if (leftIdx > idxLast)
                        idxLast = leftIdx; // Perbarui batas indeks terakhir
                    break;
                }
                currentIdx = leftIdx; // Jika sudah ada isinya, geser current ke anak kiri

            } else {
                int rightIdx = 2 * currentIdx + 2; // Rumus mencari indeks anak kanan

                // Proteksi batas kapasitas array
                if (rightIdx >= dataMahasiswa.length) {
                    System.out.println("Array Full! Tidak bisa menampung data baru.");
                    break;
                }
                // Jika slot anak kanan kosong, langsung tempatkan data baru di sini
                if (dataMahasiswa[rightIdx] == null) {
                    dataMahasiswa[rightIdx] = dataMhs;
                    if (rightIdx > idxLast)
                        idxLast = rightIdx; // Perbarui batas indeks terakhir
                    break;
                }
                currentIdx = rightIdx; // Jika sudah ada isinya, geser current ke anak kanan
            }
        }
    }

    // TUGAS 4 (Poin 2): Traverse PreOrder (Root -> Kiri -> Kanan)
    public void traversePreOrder(int idxStart) {
        // Proteksi mutlak agar tidak NullPointerException saat membaca indeks kosong
        if (idxStart > idxLast || idxStart >= dataMahasiswa.length || dataMahasiswa[idxStart] == null) {
            return;
        }

        // 1. Cetak informasi data Parent / Root saat ini
        dataMahasiswa[idxStart].tampilInformasi();
        System.out.println("-------------------------");

        // 2. Lakukan rekursif untuk menelusuri anak kiri (2 * idx + 1)
        traversePreOrder(2 * idxStart + 1);

        // 3. Lakukan rekursif untuk menelusuri anak kanan (2 * idx + 2)
        traversePreOrder(2 * idxStart + 2);
    }
    }
