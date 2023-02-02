package src.day19_arrayList_forEachLoop;

public class C03_ForEachLoop {

    public static void main(String[] args) {

        /* eger coklu element iceren bir yapidaki tum elementlere
        ayni islemi yapmak istiyrsak
        index'den bagimsiz olarak for each loop kullanilacaktir

        for each loop'da 3 seyi belirtmemiz gerekir
        1- getirilecek elementlerin data turu
        2- getirilen elemente verilecek isim(genelde each veya w kullanilir.)
        3- nereden getirilecegi

         */


        int[] arr = {3,5,7,6,5,2,6,};

        // bu array'in tum elementlerini yazdirin

        for (int each:arr) {
            System.out.print(each+" ");

        }
        System.out.println("");

        // tum elementleri toplayalim

        int toplam=0;

        for (int each:arr) {
            toplam+=each;
        }
        System.out.println("sayilarin toplami: "+toplam);

        // tum sayiların karelerini toplayalim

        toplam=0;

        for (int each:arr) {

            toplam+=each*each;

        }
        System.out.println("sayilarin kareleri toplami: "+toplam);
    }
}
