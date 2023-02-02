package src.day32_sets_maps;

import java.util.Map;

public class C06_Value {

    public static void main(String[] args) {

        // mapOlustur methodu bize bir map donduruyor
        // biz o class'daki map'i kullanmak istiyoruz ama
        // her sferinde o class'a gidip o map'i yeniden olusturmamiz isimize yaramaz

        // bu class'da bir map olusturmak istedigimizde
        // new HashMap<> yazıyoruz
        // ancak bu bize bos bir map getiriyor
        // bu kodun yerine MapMethodDepo'dan ogrenciMapOlustur method'unu calistirirsak
        // biz de onu icinde oldugumuz class'da olusturdugumuz ogrenciMap'e atama yapariz

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap.put(110,"Cemal-Han-12-M-MF");

        System.out.println(ogrenciMap);
        // {101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF, 110=Cemal-Han-12-M-MF}

        System.out.println(ogrenciMap.keySet()); // [101, 102, 103, 104, 105, 106, 110]

        System.out.println(ogrenciMap.values());
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Cemal-Han-12-M-MF]

        // verilen ismin ogrenciMap'de olup olmadigini kontrol edip
        // true veya false donen bir method olusturun

        boolean sonuc=MapMethodDepo.isimIleOgrenciArama(ogrenciMap,"Ali");

        System.out.println(sonuc); // true

        System.out.println(MapMethodDepo.isimIleOgrenciArama(ogrenciMap,"Kemal")); // false
        System.out.println(MapMethodDepo.isimIleOgrenciArama(ogrenciMap,"Ahmet")); // false

    }


    }

