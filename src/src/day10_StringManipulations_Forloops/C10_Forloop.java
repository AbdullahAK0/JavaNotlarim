package src.day10_StringManipulations_Forloops;

public class C10_Forloop {
    public static void main(String[] args) {

        // input olarak verilen sayidan baslayarak
        // 7'ser 7'ser artirarak input olarak verilen bitis sayisina kadar
        // -tum sayilari
        // -kac adet sayi oldugunu
        // -ve bu sayilarin toplaminin kac oldugunu yazdirin

        int inputBas=34;
        int inputBit=563;

        int sayac=0;
        int toplam=0;

        for (int i = inputBas; i <=inputBit ; i+=7) {
            System.out.println(i+ " ");
            sayac++;
            toplam+=i;

        }

        System.out.println("");
        System.out.println("Toplam " + sayac + " sayi var\n Bu sayilarin toplami " + toplam);
    }
}
