package Individu.ProjekMatematika;

public class Matematika {
    public double pertambahan(double a, double b){
        return a + b;
    }

    public double pengurangan(double a, double b){
        return a - b;
    }

    public double perkalian(double a, double b){
        return a * b;
    }

    public double pembagian(double a, double b){
        if (b != 0){
            return (double) a / b;
        } else {
            throw new ArithmeticException("Pembagi tidak boleh nol");
        }
    }
}
