package src.day28_exceptions;

import java.util.Scanner;

public class C02_TryCatch {

    public static void main(String[] args) {

        /*

            Try-catch bloklarinin amaci
            riski sifir yapmak degil
            kodun iyi analiz yapip
            Java'nin cozemeyecegi durumlarda ne yapmasini istedigimiz
            kendisine soylemktir.

            Java try blogunda handle edemeyecegi bir sorunla karsilasirsa
            siz o sorunu deklare edinceye kadar yani
            catch() satirina kadar calismayi durudurur.

            bu durumda sorun olan satir ile catch() satiri arasindaki kodlar calismaz.

         */


        // kullanicidan iki tamsayi alip
        // sayilari birbirine bolup, sonucu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("birbirine bolmek icin 2 tamsayi giriniz");

        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        try {
            System.out.println("iki sayinin bolumu : "+ sayi1/sayi2);

            System.out.println("kontrol1");
            System.out.println("kontrol2");
            System.out.println("kontrol3");
        } catch (ArithmeticException e) {
            System.out.println("bolen sayi 0 olamaz");
            e.printStackTrace();
        }
    }
}
