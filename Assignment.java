package binaryoperator;

public class Assignment {
    public static void main(String[] args) {
        // 1. Operator assignment dasar
        int angka = 10;
        String nama = "Arthur Erickson";

        //2. Operator assignment aritmatika
        int x = 5;
        x += 3; //x = x + 3
        System.out.println("Nilai x setelah += 3 adalah " + x);

        int y = 5;
        y -= 3; // y = y - 3
        System.out.println("Nilai x setelah -= 3 " + y);

        int z = 5;
        z *= 3; // z = z * 3
        System.out.println("Nilai x setelah *= 3" + z);

        int a = 20;
        a /= 4; // a = a / 4
        System.out.println("Nilai x setelah /= 3 adalah " + a);

        int b = 20;
        b %= 4; // b = b % 4
        System.out.println("Nilai x setelah %= 3 adalah " + b);


    }
}