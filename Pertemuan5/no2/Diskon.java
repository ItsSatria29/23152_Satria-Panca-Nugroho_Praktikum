package Pertemuan5.no2;
import java.util.Scanner;

public class Diskon {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Total pemnbelian: Rp.");
        double totalBeli = input.nextDouble();
        
        double diskon;
        double jumlahBayar;
        
        if (totalBeli < 50000){
            diskon = totalBeli * 0.5;
        } else {
            diskon = totalBeli * 0.20;
        }
        
        jumlahBayar = totalBeli - diskon;
        
        System.out.println("Besarnya potongan = Rp." + diskon);
        System.out.println("Jumlah yang harus dibayarkan = Rp." + jumlahBayar);

        input.close();
    }
    
}
