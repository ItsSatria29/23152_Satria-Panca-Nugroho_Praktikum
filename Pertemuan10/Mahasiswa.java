
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan10;

/**
 *
 * @author user
 */
public class Mahasiswa {
    private String npm, nama, alamat, matKul;
    private double nilaiAkhir;

    public Mahasiswa(String npm, String nama, String alamat, String mataKuliah, double nilaiAkhir) {
        this.npm = npm;
        this.nama = nama;
        this.alamat = alamat;
        this.matKul = mataKuliah;
        this.nilaiAkhir = nilaiAkhir;
    }

    public String getAlamat(){
        return alamat;
    }
    
    public String getNPM(){
        return npm;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getMataKuliah(){
        return matKul;
    }
    
    public double getNilaiAkhir(){
        return nilaiAkhir;
    }
}
