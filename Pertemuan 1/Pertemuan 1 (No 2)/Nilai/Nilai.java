package Nilai;

public class Nilai {
    private String nim;
    private String nama;
    private double nilaiAbsen;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;

    public Nilai(String nim, String nama, double nilaiAbsen, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiAbsen = nilaiAbsen;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public void cetakNilai() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Nilai Absen [10%]: " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%]: " + nilaiTugas);
        System.out.println("Nilai UTS [30%]: " + nilaiUTS);
        System.out.println("Nilai UAS [40%]: " + nilaiUAS);
        double nilaiAkhir = nilaiAbsen * 0.1 + nilaiTugas * 0.2 + nilaiUTS * 0.3 + nilaiUAS * 0.4;
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}
