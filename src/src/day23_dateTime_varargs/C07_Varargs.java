package src.day23_dateTime_varargs;

public class C07_Varargs {

    public static void main(String[] args) {

        // kac tane string argument yazilirsa yazilsin
        // argumentlerin en uzun olaninş yazdiran bir method olusturun
        // not: en uzun kelime olarak birden fazla kelime varsa ilkini yazdiralim.

        enUzunuYazdir("ilyas","berivan","murat");
        enUzunuYazdir("mehmet", "vahit","nurcan","Java","zafer");

    }

    private static void enUzunuYazdir(String... kelimeler) {

        String enUzunKelime=kelimeler[0];
        for (String eachkelime:kelimeler) {
            if (enUzunKelime.length()<eachkelime.length()){ // ilkini yazmasi icin < veya buyuk isareti
                enUzunKelime=eachkelime;                    // en sondaki uzunu yazmasi icin <=,>= kullanmaliyiz
            }

        }
        System.out.println(enUzunKelime);
    }
}
