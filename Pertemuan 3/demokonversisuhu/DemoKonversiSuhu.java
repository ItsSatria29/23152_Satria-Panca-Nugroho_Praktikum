package demokonversisuhu;

public class DemoKonversiSuhu {

    public static void main(String[] args) {
        // Membuat objek dari KonversiSuhu2
        KonversiSuhu2 konversi = new KonversiSuhu2();
        
        // Nilai suhu dalam Celcius
        double suhuC = 100;
        
        // Memanggil method dari KonversiSuhu
        System.out.println("Suhu " + suhuC + "°C dalam Fahrenheit: " + konversi.CtoF(suhuC));
        System.out.println("Suhu " + suhuC + "°C dalam Reamur: " + konversi.CtoR(suhuC));
        
        // Memanggil method dari KonversiSuhu2
        System.out.println("Suhu " + konversi.CtoF(suhuC) + "°F dalam Reamur: " + konversi.FtoR (konversi.CtoF(suhuC)));
    }
    
}
