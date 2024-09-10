package latihan;

import java.util.Scanner;

public class Soal1 {
    /**
     * Buatlah sebuah program yang mencari nilai maksimum dari 2 bilangan
     *
     */

    public static void main(String[] args) {
        int[] bilagan = new int[2];
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Bilangan Pertama : ");
        bilagan[0] = input.nextInt();

        System.out.println("Masukan Bilangan Kedua : ");
        bilagan[1] = input.nextByte();

        if (bilagan [1] > bilagan[0]) {
            System.out.println(bilagan[1]);
        }else {
            System.out.println(bilagan[0]);
        }
    }
}