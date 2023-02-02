package src.day23_dateTime_varargs;

public class C08_Varargs {

    public static void main(String[] args) {

        // argument olarak tam sayilar alip
        // ilk sayi haric digerlerini toplayip
        // bulunan toplami ilk argument ile carpip
        // sonucu yazdiran bir method olusturun
        // not: argument sayisi degisik olabilir.

        islemYap(4,5,6,7,8); // 104
        islemYap(4); // 0
        // islemYap(); en az ilk sayiyi yazmamiz gerek
    }

    private static void islemYap(int ilkSayi, int... geriyeKalanlar) {

        int geriyeKalanlarToplami=0;

        for (int each:geriyeKalanlar) {
            geriyeKalanlarToplami+=each;
        }
        System.out.println(geriyeKalanlarToplami*ilkSayi);
    }
}
