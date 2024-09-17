package matematika;

public class Matematika2 extends Matematika{
    public int modulus(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Modulus by zero is not allowed");
        }
        return a % b;
    }
}
