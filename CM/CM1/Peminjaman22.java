package CM.CM1;

import Jobsheet5.Mahasiswa;

public class Peminjaman22 {
    Mahasiswa22 mhs;
    Buku22 buku;
    int lamaPinjam, batasPinjam = 5, terlambat, denda;

    Peminjaman22() {
    }

    Peminjaman22(Mahasiswa22 mhs, Buku22 buku, int lmPin) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lmPin;
    }

    void tampilInformasiPeminjaman() {
        System.out.printf("%-15s | %-20s | %-5s | %-10s | %-10s\n", mhs.nama, buku.judul, lamaPinjam, terlambat, denda);
    }

    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    void insertionSort(Peminjaman22[] daftarPeminjaman) {
        for (int i = 1; i < daftarPeminjaman.length; i++) {
            Peminjaman22 temp = daftarPeminjaman[i];
            int j = i;
            while (j > 0 && daftarPeminjaman[j - 1].denda < temp.denda) {
                daftarPeminjaman[j] = daftarPeminjaman[j - 1];
                j--;
            }
            daftarPeminjaman[j] = temp;
        }
    }    

    void sortNIM(Peminjaman22[] daftarPeminjaman) {
        for (int i = 1; i < daftarPeminjaman.length; i++) {
            Peminjaman22 temp = daftarPeminjaman[i];
            int j = i;

            int nimTemp = Integer.parseInt(temp.mhs.nim);

            while (j > 0) {
                int nimKiri = Integer.parseInt(daftarPeminjaman[j - 1].mhs.nim);

                if (nimKiri > nimTemp) {
                    daftarPeminjaman[j] = daftarPeminjaman[j - 1];
                    j--;
                } else {
                    break;
                }
            }
            daftarPeminjaman[j] = temp;
        }
    }

    // int findBinarySearch(Peminjaman22[] daftarPeminjaman, double cari, int left, int rigth) {
    //     int midNIM;
    //     if (rigth >= left) {
    //         midNIM = (left + rigth) / 2;
    //         int tengah = Integer.parseInt(daftarPeminjaman[midNIM].mhs.nim);
    //         if (cari == tengah) {
    //             return (midNIM);
    //         } else if (midNIM > cari) {
    //             return findBinarySearch(daftarPeminjaman, cari, left, midNIM - 1);

    //         } else {
    //             return findBinarySearch(daftarPeminjaman, cari, midNIM + 1, rigth);
    //         }
    //     }
    //     return -1;
    // } 
    
    //serching denda di atas nol
    int sequentialSearchByName(Peminjaman22[] daftarPeminjaman, String cari) {
        for (int i = 0; i < daftarPeminjaman.length; i++) {
            if (daftarPeminjaman[i].mhs.nama.equalsIgnoreCase(cari)) {
                return i;
            }
        }
        return -1;
    }

}
