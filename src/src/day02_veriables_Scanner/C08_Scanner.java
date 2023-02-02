package src.day02_veriables_Scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
         /*
        Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        dikdortgenin alanini yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen dikdörtgenin iki kenar uzunlugunu giriniz");
        double kenar1 = scan.nextDouble();
        double kenar2= scan.nextDouble();
        double dikdortgenAlanı = kenar1*kenar2;
        System.out.println("dikdortgenin alanı: "+ dikdortgenAlanı);

    }
}

