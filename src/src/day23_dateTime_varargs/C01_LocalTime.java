package src.day23_dateTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {

    public static void main(String[] args) {

        LocalTime zaman = LocalTime.now();
        System.out.println(zaman); // 12:10:55.961492200

        System.out.println(zaman.getMinute()); // 11

        System.out.println(zaman.withSecond(0).withNano(0)); // 12:12
        System.out.println(zaman.withSecond(1).withNano(1)); // 12:22:01.000000001

        System.out.println(zaman.plusHours(100).plusMinutes(100)); // 18:03:28.765096300

        // bir for loop ile 1'den 10000'e kadar olan sayilari yanyana yazdirin
        // bu islem icin gecen zamani bulun
        LocalTime basZamani=LocalTime.now();

        System.out.println("baslangic "+basZamani);

        for (int i = 1; i <=10000 ; i++) {
            System.out.print(i+" ");
        }
        LocalTime bitZamani=LocalTime.now();

        System.out.println("");
        System.out.println("bitis "+bitZamani);

        System.out.println("Islem suresi : " +
                (bitZamani.getNano()-basZamani.getNano())
                +" nano saniye");

        /*
            Olusturdugumuz time veya date guncel zamani veya tarihi tutmaya devam eden bir sayac degil
            olusturdugumuz satirdaki zamani veya tarih'i sistemden alip kaydeden bir variable'dir

            ilerleyen satirlarda guncel zaman veya tarihe ihtiyacimiz oldugunda
            yeni bir time veya date objesi olusturup
            o andaki degeri alabiliriz.
         */
    }
}
