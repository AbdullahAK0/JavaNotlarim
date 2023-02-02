package src.day08_StringManipulations;

public class C07_substring {
    public static void main(String[] args) {

        String str = "java ogren, isi kap";

        System.out.println(str.length()); // karakter sayısı : // 19

        // metnin tam ortasındaki karakteri bulun.

        System.out.println(str.charAt(str.length()/2)); // 'n' ortadaki karakter

        // son karakteri yazdırın

        System.out.println(str.charAt(str.length()-1)); //  'p' son karakteri verir

        // bir karakteri degil de verilen
        // String'in icerdigi bir metin parvcasini elde etmek istersek

        System.out.println(str.substring(0,4));

        // ogren kısmını yazdır

        System.out.println(str.substring(5,10));

        // substrings (bas bitis) metodunda
        // baslangic olarak yazilan index dahil(inclusive
        //  bitis olarak yazilan index harictir(exclusive).

        // str'dan kap yazdıralim

        System.out.println(str.substring(19-3));
        System.out.println(str.substring(16,19));
        System.out.println(str.substring(16));
        System.out.println(str.substring(str.length()-3));

        // substring kullanarak sadece j harfini yazdirin.

        System.out.println(str.substring(0,1));

        // substrin kullanarak 9. index'deki harfi buyuk olarak yazdirin

        System.out.println(str.substring(9,10).toUpperCase());// N
        System.out.println(str.toUpperCase().charAt(9)); // N

        // charAt() kullanmak yerine substrin kullanmak
        // daha avantajli olabilir. cunku substrin kullanildiginda  ifade hala string
        // oldugundan method kullanmaya devam edebiliriz.

        System.out.println(str.substring(5,5)); // hic bir sey yazdirmaz
        System.out.println("===========");

        System.out.println(str.substring(4,3));

        System.out.println(str.substring(25,28));

        System.out.println(str.substring(str.length())); // hiclik yazdirir
        // System.out.println(str.charAt(str.length())); // StringIndexOutOfBoundsException
        // System.out.println(str.substring(str.length()+1)); // StringIndexOutOfBoundsException
        System.out.println("=======");

    }
}
