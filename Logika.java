package binaryoperator;

public class Logika {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // AND (&&)
        boolean hasilAnd = a && b;
        System.out.println("a AND b = " + hasilAnd);

        // OR (||)
        boolean hasilOr = a || b;
        System.out.println("a OR b = " + hasilOr);
    }
}