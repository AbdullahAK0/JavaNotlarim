package src.day12_MethodCreation;

public class C01_Method {
    public static void main(String[] args) {

        // methodlar bazen cok basit islemleri bazen de komplex islemleri yapabilir.
        // biz o islemleri nasil yapabiliriz diye dusunmek yerine
        // hazir methodu kullanmayi tercih ederiz.
        // bizden sonra kodu inceleyecek kimseler de hazir method islemlerinden
        // ne yapmak istedigimizi kolayca anlarlar
        // ayrica kodu her defasinda yazdigimizda yapabilecegimiz muhtemel hatalardan kurtulmus oluruz

        String str = "Java'da yolu yariladik";
        str.isEmpty(); // boelan sonuc dondu ama kullanmadim.

        str.isBlank();

        // methodun dondurdugu sonucu kullnmak istersek ya yazdirmaliyiz
        System.out.println(str.isBlank());// false

        // ya da ileride donen sonucu ileride kullanacaksak atama yapabiliriz.

       String strBuyukHali=str.toLowerCase();


    }
}
