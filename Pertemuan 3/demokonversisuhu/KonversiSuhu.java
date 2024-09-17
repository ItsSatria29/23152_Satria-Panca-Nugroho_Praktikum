package demokonversisuhu;

public class KonversiSuhu {
    // Method untuk mengonversi dari Celcius ke Fahrenheit
    public double CtoF(double celcius) {
        return (celcius * 9/5) + 32;
    }
    
    // Method untuk mengonversi dari Celcius ke Reamur
    public double CtoR(double celcius) {
        return celcius * 4/5;
    }
}
