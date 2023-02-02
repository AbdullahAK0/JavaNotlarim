package src.day22_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {

    public static void main(String[] args) {

        // verilen bir List'de degisiklik yapan 2 method olusturun
        // 1.method list'in elementlerine yeni deger atayip yazdirsin
        // 2.method, list'e yeni bir list degeri atayip, yeni list'e
        //   elementler ekleyip yazdirsin
        // her iki method'u cagirdiktan sonra main method'daki list'i yazdiralim

        List<Integer> sayiar = new ArrayList<>();
        sayiar.add(10);
        sayiar.add(34);
        sayiar.add(45);
        System.out.println(sayiar); // [10, 34, 45]

        elemanlariDegistir(sayiar);

        System.out.println("1. method calll'dan sonra sayilar: "+sayiar); // [25, 54, 67]

        yeniListAta(sayiar);

        System.out.println("2. method call'dan sonra sayilar: "+sayiar); // [25, 54, 67]

        /*
            Java PassByValue kullanir.

            PassByValue, methoda gonderilen veriable'in kendisini degil degerini gondermek demektir.
            primitive data turleri veya String gonderdigimizde methodda yapilan degisiklik methodda kalir.
            main methodda atama yapilmadikca main methoddaki veriable'in degeri degismez.

            Ancak PassByValue coklu element iceren array ve List gibi yapilar icin de gecerlidir
            ancak coklu elemmenti value olarak methoda gonderemediginden array veya Lit'in adresini gonderir.
            Eger methodda elementlere atama yapilirsa main methoddaki elementler de degismis olur.
            Eger List veya array'e yeni bir list veya array degeri atanirsa bu atama methodda kalir
            main methoddaki l,st veya array degismez.

            Araba ayni kaldigi muddetce icindekilerin degismesi PassByValue'ya aykiri degildir.
         */

    }
    public static void elemanlariDegistir(List<Integer> sayilar){

        sayilar.set(0,25);
        sayilar.set(1,54);
        sayilar.set(2,67);
        System.out.println("elemanlariDegistir methodunda list: "+ sayilar); // [25, 54, 67]

    }

    public static void yeniListAta(List<Integer> sayilar){

        sayilar= new ArrayList<>();
        sayilar.add(34);
        sayilar.add(98);
        sayilar.add(11);
        System.out.println("yeniListAta methodunda sayilar List'inin son hali: "+sayilar); // [34, 98, 11]
    }
}
