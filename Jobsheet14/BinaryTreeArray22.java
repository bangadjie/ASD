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
    }
