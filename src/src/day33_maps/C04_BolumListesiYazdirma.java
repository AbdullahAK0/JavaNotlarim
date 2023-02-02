package src.day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

import static day32_sets_maps.MapMethodDepo.bolumListesiOlusturma;

public class C04_BolumListesiYazdirma {

    public static void main(String[] args) {

        // verilen bolumdeki ogrencilerin
        // No,isim,soyisim, sinif'larini yazdiran
        // bir method olusturun

        Map<Integer, String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        bolumListesiOlusturma(ogrenciMap, "TM");
    }

    }

