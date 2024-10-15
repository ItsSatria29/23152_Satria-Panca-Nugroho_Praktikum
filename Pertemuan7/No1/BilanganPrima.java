package Pertemuan7.No1;

public class BilanganPrima {

    // Method untuk mengecek bilangan prima
    public static boolean isPrima(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    
    // class Main
    public static void main(String[] args) {
        System.out.println("Bilangan Prima dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nBilangan Bukan Prima dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            if (!isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
}
