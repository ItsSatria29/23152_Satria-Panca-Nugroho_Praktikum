/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

public class BangunRuang {
    private double luasPermukaan, volume;
    
    // Overload kubus
    protected BangunRuang(double sisi) {
        luasPermukaan = 6 * sisi * sisi;
        volume = Math.pow(sisi, 3);
    }

    // Overload balok
    protected BangunRuang(double panjang, double lebar, double tinggi) {
        luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        volume = panjang * lebar * tinggi;
    }

    protected String getLuasPermukaan() {
        return "Luas permukaan: " + luasPermukaan;
    }

    protected String getVolume() {
        return "Volume: " + volume;
    }
}

// Class Kubus
class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        super(sisi); // Memanggil konstruktor dari superclass
        this.sisi = sisi;
    }

    @Override
    public String getLuasPermukaan() {
        System.out.println("Kubus");
        return "Sisi: " + sisi + "\n" + super.getLuasPermukaan();
    }

    @Override
    public String getVolume() {
        return "Sisi: " + sisi + "\n" + super.getVolume();
    }
}


// Class Balok
class Balok extends BangunRuang {
    private double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar, tinggi); // Memanggil konstruktor dari superclass
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public String getLuasPermukaan() {
        System.out.println("\nBalok");
        return "Panjang: " + panjang + ", lebar: " + lebar + ", tinggi: " + tinggi + "\n" + super.getLuasPermukaan();
    }

    @Override
    public String getVolume() {
        return "Panjang: " + panjang + ", lebar: " + lebar + ", tinggi: " + tinggi + "\n" + super.getVolume();
    }
}

