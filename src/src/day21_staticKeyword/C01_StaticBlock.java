package src.day21_staticKeyword;

public class C01_StaticBlock {

    C01_StaticBlock(){
        System.out.println("Constructor calisti");

    }

    public static void main(String[] args) {
        System.out.println("Main method calismaya basladi");

    }

    static {

        // static block'lar calass'taki tum yapilardan hatta
        // static block'ta istedigimiz bir veriable'a baslangic degeri atanmasi
        // kullanicidan yetki sorgulamasi gibi islemler yapilabilir.
        // main method calismadan once yapilmasi gereken islem oldugunda kullanilir.
        // main method'dan bile once calisir.
        // birden fazla static block varsa kendi aralarinda once olani calistirir.


        System.out.println("static block calismaya basladi");
    }

    static {

        System.out.println("alttaki static block calisti");
    }
}
