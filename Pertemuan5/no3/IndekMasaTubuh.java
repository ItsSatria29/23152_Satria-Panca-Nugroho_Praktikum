package Pertemuan5.no3;
import java.util.Scanner;

public class IndekMasaTubuh {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Berat Badan (kg): ");
        double beratBadan = input.nextDouble();
        
        System.out.print("Tinggi Badan (m): ");
        double tinggiBadan = input.nextDouble();
        
        double imt = beratBadan / (tinggiBadan * tinggiBadan);
        
        String kategori;
        
        if (imt >= 40){
            kategori = "Sangat Gemuk";
        } else if (imt >= 30 && imt <= 39.9){
            kategori = "Gemuk";
        } else if (imt >= 25 && imt <= 29.9){
            kategori = "Berat Badan Lebih";
        } else if (imt >= 18.5 && imt <= 24.5){
            kategori = "Berat Badan Ideal";
        } else {
            kategori = "Berat Badan Kurang";
        }
        
        System.out.println("\nIndeks Masa Tubuh: " + imt);
        System.out.println("Kategori: " + kategori);
        
        input.close();
    }
    
}
