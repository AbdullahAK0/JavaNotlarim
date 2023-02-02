package src.day23_dateTime_varargs;

public class C06_Varargs {

    public static void main(String[] args) {

        // oyle bir method olusturalim ki
        // kac tane argument yazarsam yazayim
        // argumentlerin toplamini versin

        topla(5, 6);
        topla(5, 6, 6, 2, 2);
        topla(1, 5, 5, 6, 7, 9, 5, 6);
        
        /*
            varargs array alt yapisini kullanir
            temel argument sayisi degisse bile
            ayni data turundeki tum argumentleri alabilecek bir parametre olusturmaktadir.
         */
    }

    private static void topla(int... sayilar) {

        int toplam1 = 0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam1 += sayilar[i];

        }
        System.out.println(toplam1);
        
        int toplam2 = 0;
        for (int each:sayilar) {
            toplam2+=each;
            
        }
        System.out.println(toplam2);
    }
}
