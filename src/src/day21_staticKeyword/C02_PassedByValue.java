package src.day21_staticKeyword;

public class C02_PassedByValue {

    public static void main(String[] args) {

        /*
        Java PassByValue kullanir
        Yannni method'lar arasinda gonderilen variable'larin
        kendileri degil, value'lari diger method'a yollanir.
         */

        int fiyat = 100;
        // fiyat uzerinden %10 indirim yapip indirimli fiyati donduren bir method olusturun
        System.out.println(indirimYap10(100));

        System.out.println(fiyat);

        // Eger indirimli fiyatin kalici olarak fiyatimizi degistirmesini istiyorsak
        // atama yapariz.

        fiyat=indirimYap10(fiyat);


    }

    public static int indirimYap10(int fiyat){
        fiyat=fiyat*90/100;
        return fiyat;
    }
}
