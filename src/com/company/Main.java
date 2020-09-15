package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Faktoriyel: " + faktoriyel(6));
        System.out.println("Rakamlarin toplami: " + rakamlarinToplami(faktoriyel(6)));
    }

    // Verilen sayinin faktoriyelini alir
    public static int faktoriyel(int sayi) {
        // recursion

        if (sayi == 1)
            return sayi;
        else
            return (faktoriyel(sayi - 1)) * sayi;
    }

    // Verilen sayinin rakamlarinin toplamini alir
    public static int rakamlarinToplami(int sayi) {
        // int sayi = 324 / 10 ===> 32
        // 3249 % 10 = 9
        // 3 / 10 = 0

        int toplam = 0;

        while (sayi != 0){
            toplam = toplam + (sayi % 10);
            sayi = sayi / 10;
        }

        return toplam;
    }
}
