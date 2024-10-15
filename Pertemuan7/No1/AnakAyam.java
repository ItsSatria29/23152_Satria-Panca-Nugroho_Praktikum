package Pertemuan7.No1;

public class AnakAyam {

    public static void main(String[] args) {
        System.out.println("Tek kotek, kotek kotek");
        System.out.println("Anak ayam turun berkotek\n");
        int anakAyam = 4;  // Mulai dari 4 anak ayam

        while (anakAyam > 0) {
            System.out.println("Anak ayam turunlah " + anakAyam);
            anakAyam--;
            if (anakAyam > 0) {
                System.out.println("Mati satu tinggalah " + anakAyam);
            } else {
                System.out.println("Mati satu tinggal induknya");
            }
            System.out.println();  // Untuk memberi jarak antar bait

            if (anakAyam == 3 || anakAyam == 1) {
                System.out.println("Tek kotek, kotek kotek");
                System.out.println("Anak ayam turun berkotek");
                System.out.println();  // Jarak antar bait
            }
        }
    }
}
