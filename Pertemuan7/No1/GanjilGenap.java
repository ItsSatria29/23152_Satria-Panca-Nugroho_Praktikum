package Pertemuan7.No1;

public class GanjilGenap {

    public static void main(String[] args) {
        System.out.println("Bilangan Genap dari 0 - 20:");
        int i = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println("\n\nBilangan Ganjil dari 0 - 20:");
        int j = 0;
        do {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
            j++;
        } while (j <= 20);
    }
    
}
