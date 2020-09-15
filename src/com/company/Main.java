package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Verilen sayinin faktoriyeli: " + faktoriyel(5));
        System.out.println("Faktoriyelin rakamlarinin toplami: " + rakamlarinToplami(faktoriyel(5)));
    }

    // Verilen sayinin faktoriyelini alir
    public static int faktoriyel(int sayi) {
        if (sayi == 1)
            return sayi;
        else
            return (faktoriyel(sayi - 1)) * sayi;
    }

    // Verilen sayinin rakamlarini toplar
    public static int rakamlarinToplami(int sayi) {
        int toplam = 0;

        // 0
        while (sayi != 0) {
            toplam = toplam + (sayi % 10);
            sayi = sayi / 10;
        }

        return toplam;
    }
}
