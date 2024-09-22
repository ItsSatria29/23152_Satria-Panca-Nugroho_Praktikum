/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author user
 */
public class Action {

    /**
     * @param args the command line arguments
     */
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
