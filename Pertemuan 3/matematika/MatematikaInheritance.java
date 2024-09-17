package matematika;

public class MatematikaInheritance {

    public static void main(String[] args) {
        Matematika2 math = new Matematika2();
        
        // Memanggil method Matematika
        System.out.println("Penjumlahan 5 + 3: " + math.pertambahan(5, 3));
        System.out.println("Pengurangan 5 - 3: " + math.pengurangan(5, 3));
        System.out.println("Perkalian 5 * 3: " + math.perkalian(5, 3));
        System.out.println("Pembagian 6 / 3: " + math.pembagian(6, 3));
        
        // Memanggil method modulus Matematika2
        System.out.println("Modulus 5 % 3: " + math.modulus(5, 3));
    }
    
}
