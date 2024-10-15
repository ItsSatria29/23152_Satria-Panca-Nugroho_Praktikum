package Pertemuan7.No2;
import java.util.Scanner;

public class No2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ukuran tabel (1-5): ");
        int n = scanner.nextInt();

        if (n <= 5 && n > 0) {
            System.out.println();
            
            for (int i = 1; i <= n; i++) {
                System.out.print("\t" + i);
            }
            System.out.println();
            
            for (int i = 1; i <= n; i++) {
                System.out.print(i);
                
                for (int j = 1; j <= n; j++) {
                    System.out.print("\t" + (i * j));
                }
                System.out.println();
            }
        } else {
            System.out.println("Ukuran tabel harus antara 1-5.");
        }

        scanner.close();
    }    
}