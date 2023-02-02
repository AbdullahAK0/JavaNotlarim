package src.day10_StringManipulations_Forloops;

public class C01_nullPointer {
    public static void main(String[] args) {
        String str1="";
        String str2="    ";
        String str3;
        String str4=null;

        System.out.println(str1.length()); // 0
        System.out.println(str2.length()); // 4

        System.out.println(str1.isEmpty()); // true
        System.out.println(str2.isEmpty()); // false

        System.out.println(str1.isBlank()); // true
        System.out.println(str2.isBlank()); // true

        // null bir deger degil isaretcidir ( null pointer)
        // null pointer : non primitive bir objenin olusturuldugunu
        // ancak bilincli olarak deger atanmadıgını isaretler
        // str4'un degeri null'dır cumlesi yanlis
        // str4 null olarak isaretlenmistir

        // System.out.println(str3.length());
        // System.out.println(str3.concat("Ali Can"));
        // System.out.println(str3.substring(3, 4));
        /*
            Java bir veriable'i olusturup deger atanmamasına izin verir
            bir veriable'i deger atamadan olusturabilirsiniz ANCAK KULLANAMAZSINIZ
            deger atanmayan bir veriable'ı kullanırsanız
            java CTE verir.

            null pointer ise bu veriable'a bir deger atanmadıgını vu bunun bilincli bir tercih oldugunu Java'ya söyler
            dolayısıyla Java calismaya devam etmesine sizin verir
            Ancak deger atanmadigi icin method'larla kullanmaya calisirsaniz NullPointerException verir
         */

        str4=null;
        // System.out.println(str4.length()); NullPointerException
        // System.out.println(str4.substring(3, 4));

        System.out.println(str4); // null
        System.out.println(str4+"Ali Can"); // nullAli Can
        // System.out.println(str4.concat("Ali Can")); // nullPointerException



    }
}
