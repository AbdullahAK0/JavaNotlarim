package src.day02_veriables_Scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        // Kullanicidan ismini alin
        // ve girilen ismi buyuk harflerle yazdirin
        // Kullanicidan deger almak icin 3 islem yapmamiz gerekir
        // 1.adim scanner objesi olusturmak
        Scanner scan = new Scanner(System.in);
        // 2.adim kullaniciya ne istediginizi soyleyin

        System.out.println("lütfen isminizi giriniz");
        // 3.adim kullanicinin girecegi degeri kaydedeceginiz bir variable olusturun
        //   scan objesi ile ilgili method'u kullanarak kullanicin girdigi degeri
        //   olusturdugunuz variable'a atayin
        String isim = scan.nextLine();
        // Artik kullanicinin girdigi deger girilenisim variable'inda kayitli
        System.out.println("girilen isim: "+ isim.toUpperCase());
    }
}
