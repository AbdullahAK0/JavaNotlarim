package src.day22_immutableClasses;

public class C03_ImmutableClasses {
    public static void main(String[] args) {



        String str ="Java";

        str.replace("J","H"); // Java

        System.out.println(str);

        str=str.replace("J","H");
        System.out.println(str); // Hava

        str=str.toLowerCase();

        System.out.println(str); // hava

        // asagidaki kod calisirsa Java kac obje olusturur?

        String a = "ABC";

        for (int i = 0; i <10 ; i++) {

            a=a+i;                               // TOPLAM 11 TANE OBJE OLUSTU
                                                 // EN SON 1 TANEYİ KULLANİYORUZ GERİ KALAN 10 OBJE GARBAGE COLLECTOR TARAFINDAN TOPLANIR.
        }
        System.out.println(a); // ABC0123456789
}
}
