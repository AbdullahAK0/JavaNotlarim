package src.day13_methodOverloadingWhileLooop;

import java.util.Random;
import java.util.Scanner;

public class C07_BasitOyun {

        public static void main(String[] args) {
        /*
            random olarak 1 ile 100 arasinda bir sayi olusturun
            kullanicidan bu sayiyi bilmesini isteyin
            kullanici her deger girdiginde
            tuttugumuz sayi ile karsilastirip tahminini buyult/kucult diyelim
            kullanici tuttugumuz sayiyi bildiginde
            tahmin sayisini ve
            - 3 veya daha az tahminde bildiyse "Vaowww"
            - 4-8 tahminde bildiyse "Aferin"
            - daha fazla tahminde bildiyse "basarisiz"
            yazdirin
         */

            Scanner input = new Scanner(System.in);

            Random rnd = new Random();

            System.out.println("Sayı tahmin oyununa hoş geldiniz!");

            System.out.println("Lütfen 1-100 arasında bir sayı giriniz: ");
            // Kullanıcıdan sayı alıyoruz
            int tahmin = input.nextInt();
            // Bilgisayardan rastgele sayı alıyoruz
            int sayi = rnd.nextInt(101);
            int sayac = 0;

            while (tahmin != sayi) {
                if(tahmin < 0 || tahmin > 100 ) {
                    System.out.println("1 ile 100 arasında bir değer giriniz: ");
                    tahmin = input.nextInt();}
                else if (tahmin < sayi) {
                    System.out.println("Daha büyük bir sayı giriniz: ");
                    tahmin = input.nextInt();
                    sayac++;
                }
                else{
                    System.out.println("Daha küçük bir sayı giriniz: ");
                    tahmin = input.nextInt();
                    sayac++;

                }

            }

            // Eğer sayımız ve tahmin birbirine eşitse while döngüsüne girmez
            // ve print komutunu yazdırırız

            if (sayac<=3){
                System.out.println("waoooww");
            }else if (sayac>=4 && sayac<=8) {
                System.out.println("aferin");
            }else {
                System.out.println("basarisiz");
            }
        }
}

