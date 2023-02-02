package src.day35_genelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_BolmeIslemSonucunuCarpmaIleBulma {

    public static void main(String[] args) {

        // Kullaniciden bolunecek sayi bolecek sayiyi alip
        // bolme isleminin sonucunu, carpma islemi ile bulan
        // ve yazdiran bir method olusturun
        // bu islemi kullanici Q'ya basincaya kadar devam ettirin.

        Scanner scan=new Scanner(System.in);
        boolean devamEdelimMi=true;
        int bolunecekSayi=1;
        int bolenSayi=1;

        do {
            System.out.println("Lutfen bolunecek tamsayiyi girin,\nbitirmek icin Q'ya basin");
            try {
                bolunecekSayi=scan.nextInt();
                System.out.println("Lutfen bolecek sayiyi giriniz");
                bolenSayi=scan.nextInt();

                bolumSonucunuYazdir(bolunecekSayi,bolenSayi);

            } catch (InputMismatchException e) {

                String girilenStr=scan.next();

                // 23. satirda nextInt() ile degeri alamadiysa exception olusacak
                // bu satira gelecek ve biz o degeri nextLine() ile alacagiz

                if (girilenStr.equalsIgnoreCase("q")){
                    devamEdelimMi=false;
                }else {
                    System.out.println("Bolunecek sayi tamsayi olmalidir.");
                }

            }

        }while (devamEdelimMi);


    }

    private static void bolumSonucunuYazdir(int bolunecekSayi, int bolenSayi) {

        // bolunecek sayi ve bolen sayi negatif veya pozitif olabilir
        // bu durumda öncelikle isaret kontrolu yapmamiz lazim
        // isaret sorununu cozmek icin once islem sonucunun isaretini belirleyip
        // sonra sayilari isaretten bagimsiz hale getirelim

        int sonucIsareti=1;

        if (bolunecekSayi*bolenSayi<0){
            sonucIsareti=-1;
        }

        bolunecekSayi=bolunecekSayi>=0 ? bolunecekSayi : bolunecekSayi*(-1);
        bolenSayi=bolenSayi>=0 ? bolenSayi : bolenSayi*(-1);

        int bolumSonucu=1;

        while (bolumSonucu*bolenSayi<bolunecekSayi){
            bolumSonucu++;
        }
        bolumSonucu--;

        System.out.println("Bolme isleminin sonucu : "+bolumSonucu*sonucIsareti);


    }


}
