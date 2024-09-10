package Individu.ProjekMatematika;

public class MatematikaBeraksi {
    public static void main(String[] args){
        Matematika math = new Matematika();

        System.out.println("Pertambahan: 5.5 + 4.5 = " + math.pertambahan(5.5, 4.5));
        System.out.println("Pengurangan: 10 - 5 = " + math.pengurangan(10, 5));
        System.out.println("Perkalian: 5 * 5 = " + math.perkalian(5, 5));
        System.out.println("Pembagian: 21 / 7 = " + math.pembagian(21, 7));
    }
}
