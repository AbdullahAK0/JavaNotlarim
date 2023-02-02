package src.day10_StringManipulations_Forloops;

public class C03_replaceAll {
    public static void main(String[] args) {

        // BU METİNDEKİ SAYILARDAN KURTULUN
        String str = "Ja1va 56Guz,zel-dir";

        System.out.println(str.replace("1", "")
                .replace("5", "").
                replace("6", "")); // Java Guz,zel-dir

        str = "Ja1va4 56G7uz,z9el-d0ir8";

        /*  replace methodu zaten istenen degisikligi
            verilen ozellige uyan tum degerler icin yapar.

            eger genellemeyi butun sayilari butun space'leri butun ozel karakterleri
             gibi genisletmek istersek replace methodu yerine replaceAll methodunu kullaniriz

            Java bu genellemeleri yazabilmemiz icin regex(regular expression) tanimlamistir.

            \\d : butun digit'ler

         */
        str=str.replaceAll("\\d","");

        System.out.println(str); // Java Guz,zel-dir

        // ozel karakterlerden de kurtulun
        // space de ozel karakter oldugundan bu durumda space'in yok olmamasi icin
        // once space yerine metinde olmayan bir deger atayalim

        str=str.replace(" ","5");

        str=str.replaceAll("\\W",""); // Java5Guzeldir

        str=str.replace("5"," ");

        System.out.println(str);

        // BURADAKİ HARF SAYİSİNİ BULUN

        String input3 = "Ali Can, Merve Star, Mark Tom";
        input3 = input3.replaceAll("\\W","");
        System.out.println(input3.length()); // 22


    }
}
