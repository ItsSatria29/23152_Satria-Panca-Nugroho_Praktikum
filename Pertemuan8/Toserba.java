package Pertemuan8;
import java.util.Scanner;

public class Toserba {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] kode = {"A001", "A002", "A003"};
        String[] nama = {"Buku", "Pensil", "Pulpen"};
        int[] harga = {5000, 3000, 4000};
        
        System.out.print("Masukkan jumlah item barang: ");
        int jumlah = input.nextInt();
        System.out.println();
        
        // Array untuk menyimpan data setiap transaksi
        String[] Kode = new String[jumlah];
        int[] jumlahBeli = new int[jumlah];
        int[] totalBayarPerItem = new int[jumlah];
        
        int totalBayar = 0;
        
        // Input data untuk setiap item
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode Barang: ");
            kode[i] = input.next();
            
            System.out.print("Masukkan Jumlah Beli: ");
            jumlahBeli[i] = input.nextInt();
            
            // Mencari indeks barang berdasarkan kode
            int indeksBarang = -1;
            for (int j = 0; j < kode.length; j++) {
                if (kode[j].equals(kode[i])) {
                    indeksBarang = j;
                    break;
                }
            }
            
            // Menghitung total bayar per item
            if (indeksBarang != -1) {
                totalBayarPerItem[i] = jumlahBeli[i] * harga[indeksBarang];
                totalBayar += totalBayarPerItem[i];
            } else {
                System.out.println("Kode barang tidak ditemukan.");
                totalBayarPerItem[i] = 0;
            }
            System.out.println();
        }
        
        // Menampilkan struk pembelian
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("******************************");
        System.out.println("No  Kode Barang   Nama Barang   Harga    Jumlah Beli   Jumlah Bayar");
        System.out.println("====================================================================");
        
        for (int i = 0; i < jumlah; i++) {
            int indeksBarang = -1;
            for (int j = 0; j < kode.length; j++) {
                if (kode[j].equals(kode[i])) {
                    indeksBarang = j;
                    break;
                }
            }
            
            if (indeksBarang != -1) {
                System.out.printf("%-4d%-13s%-13s%-8d%-13d%-10d\n", 
                                  (i + 1), kode[i], nama[indeksBarang], 
                                  harga[indeksBarang], jumlahBeli[i], totalBayarPerItem[i]);
            }
        }
        
        System.out.println("====================================================================");
        System.out.printf("Total Bayar%46d\n", totalBayar);
        
        input.close();
    }
    
}
