package src.day09_StringManipulations;

public class C07_ilkTest {
    public static void main(String[] args) {

        // Gittigimiz web sayfasından aldigimiz String
        // arama sonuclarında arama sayisinin
        // 50'den fazla oldugunu test edin

        String input = "1-48 of 87 results for \"nutella\"";
        int indexOf=input.indexOf("of");
        int indexResults=input.indexOf("results");
        String sonucSayisiString=input.substring(indexOf+3,indexResults-1);

        // arama sonucunun 50'den fazla oldugunu test edin

        int sonucSayisiInt= Integer.parseInt(sonucSayisiString);

        if (sonucSayisiInt>50){
            System.out.println("arama sonucu 50'den fazla nutella arama testi PASSED");
        }else {
            System.out.println("istenen kadar sonuc yok, nutella arama testi FAILED");
        }

    }
}
