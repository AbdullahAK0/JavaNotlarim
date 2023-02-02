package src.day19_arrayList_forEachLoop;

public class C06_ForEachLoop {

    public static void main(String[] args) {

        // Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin

        String cumle = "Java ogrenmek cok guzel";
        String harf = "a";

        String [] cumleArr= cumle.split("");

        int sayac = 0;

        for (String eachHarf:cumleArr) {

            if (eachHarf.equals(harf)){
                sayac++;
            }

        }
        if (sayac==0){
            System.out.println("harf cumlede kullanilmamis");
        }else {
            System.out.println(harf+" cumlede "+ sayac+ " defa kullanilmis");
        }
    }
}
