package src.day02_veriables_Scanner;

import java.util.Scanner;

public class C010_Scanner {
    public static void main(String[] args) {
         /*
        Soru 2- Kullanicidan bir double, bir de int sayi alip
        bunlarin toplamini ve carpimini yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen ondalikli bir sayi yaziniz");
        double ondalikliSayi = scan.nextDouble();
        System.out.println("lütfen bir tam sayi giriniz");
        int tamSayi = scan.nextInt();
        System.out.println("sayilarin toplami: " + (tamSayi+ondalikliSayi)+
                "\nsayilarin carpimi: "+ (tamSayi*ondalikliSayi));
    }
}
