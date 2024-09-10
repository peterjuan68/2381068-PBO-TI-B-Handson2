package latihan;

import java.util.Scanner;

public class Soal2 {
    /**
     * Buatlah sebuah program yang mencari nilai maksimum dari 3 bilangan
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Angka ke-1 : ");
        int angka1 = input.nextInt();

        System.out.println("Masukan Angka ke-2 : ");
        int angka2 = input.nextInt();

        System.out.println("Masukan Angka ke-3 : ");
        int angka3 = input.nextInt();

        if (angka1 > angka2 && angka1 > angka3) {
            System.out.println("Angka Terbesar " + angka1);

        } else if (angka2 > angka1 && angka2 > angka3) {
            System.out.println("Angka Terbesar " + angka2);

        }else{
            System.out.println("Angka Terbesar " + angka3);

        }
    }
}