package src.day11_Forloops;

public class C09_NestedLoop {
    public static void main(String[] args) {

        // input olarak verilen kenar uzunluklarına gore
        // asagıdaki sekli cizdirin

        int kisaKenar=5;
        int uzunKenar=8;

        /*
            * * * * * * * *   // bir satiri nasil yazdiracagimizi inner loop ile belirliyoruz
            * * * * * * * *
            * * * * * * * *
            * * * * * * * *
            * * * * * * * *
         satirdaki islemin kac kere tekrar edecegini ise outer loop belirler

         */

        for (int i = 1; i <=kisaKenar ; i++) {
            for (int j = 1; j <=uzunKenar ; j++) {
                System.out.print("* ");

            }
            System.out.println("");// satir ile islemimiz bittiginde alt satira gecmesi icin

        }
    }
}
