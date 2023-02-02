package src.day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {

        // tum ogrencileri 101=Ali-Can-11-M-MF seklinde yazdirin
        // {101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF}

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

        System.out.println("No Ogrenci Bilgileri");
        System.out.println("====================");

        // once ogrenci numaralarini elde edelim

        Set<Integer> ogrenciNoSeti=ogrenciMap.keySet();
        System.out.println(ogrenciNoSeti); // [101, 102, 103, 104, 105, 106]

        for (Integer eachKey:ogrenciNoSeti
             ) {
            System.out.println(eachKey + "="+ogrenciMap.get(eachKey));
        }

        /*
            Aslinda bizden istenen Map'in icindeki elementler
            Java Map'deki elementleri key-value ikilisi olarak
            birlikte alabilmemiz icin bir class daha olusturmustur
            bu class'in adi ENTRY'dir.

            entry'ler de Map ile ayni data yapisina sahip olmalidir.
            ornegin ogrencimap'ini dusunursek entry'ler

            Entry<Integer,String>
         */

        Set<Map.Entry<Integer,String>> ogrenciEntrySet=ogrenciMap.entrySet();

        System.out.println("No Ogrenci Bilgileri");
        System.out.println("====================");

        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySet
             ) {

            System.out.println(eachEntry);

        }



    }
}
