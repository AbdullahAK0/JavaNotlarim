package src.day03_dataCasting_Matematiksel_Islemler;

import java.util.Scanner;

public class C06_DataCasting {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan bir double, bir  tamsayi alin,
        // double sayiyi tam sayiya bolun
        // ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir ondalikli sayi giriniz");
        double ondalikliSayi = scan.nextDouble();
        System.out.println("lütfen bir tam sayi giriniz");
        int tamSayi= scan.nextInt();
        System.out.println((int)ondalikliSayi/tamSayi);
    }
}
