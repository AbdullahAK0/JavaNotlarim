package src.day02_veriables_Scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // Kullanicidan bir sayi isteyin
        // ve sayinin karesini yazdirin
        System.out.println("lütfen karesini almak istediğiniz bir sayi giriniz");
        Scanner scan = new Scanner(System.in);
        double girilenSayi = scan.nextDouble();
        System.out.println("girilen sayinin karesi: " + girilenSayi*girilenSayi);
    }
}
