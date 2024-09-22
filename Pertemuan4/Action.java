package Pertemuan4;

public class Action {
    public static void main(String[] args) {
        Kubus kubus = new Kubus(4);
        Balok balok = new Balok(5, 3, 2);

        // Menampilkan hasil perhitungan kubus
        System.out.println(kubus.getLuasPermukaan());
        System.out.println(kubus.getVolume());

        // Menampilkan hasil perhitungan balok
        System.out.println(balok.getLuasPermukaan());
        System.out.println(balok.getVolume());
    }
}
