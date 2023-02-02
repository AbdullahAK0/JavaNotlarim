package src.day08_StringManipulations;

public class C05_charAt {
    public static void main(String[] args) {
        String str= "Java guzeldir"; // 13 karakter var bosluk da bir karakterdir.

        // java'da index 0'dan baslar
        // j==> 0. index, r==>12. index
        // charAt(index) ile istedigimiz index'deki karakteri yazdirabiliriz.

        // il a'yi yazdiralim
        System.out.println(str.charAt(1));

        // sondan ikinci harfi yazdiralim
        System.out.println(str.charAt(13-2)); // karakter sayisi -2 index'deki eleman

        // sondan 4. karakteri buyuk olarak yazdirin
        System.out.println(str.toUpperCase().charAt(13-4));

        // charAt() metodu bize char dondurdugu icin touppercase calismaz
        // String metodlari charAT() ile kullanmak isterseniz
        // charAt()'den once kullanmalisiniz

        // System.out.println(str.charAt(13)); // String index out of range: 13
        // eger index olarak karakter sayisi veya daha
        // buyuk bir deger girersek o index'i bulamayacagi icin hata verir
    }
}
