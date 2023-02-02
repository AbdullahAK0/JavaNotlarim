package src.day11_Forloops;

public class C04_forloops {

    public static void main(String[] args) {

        // eger sart i'nin hicbir degeri icin true olmuyorsa
        // true olmuyorsa loop calisir ama loop buddy'si devreye hic girmediginden
        //  islem yapilmaz

        // input olarak girilen sayidan 1'e kadar oln tum sayilari yazdirin

        int input =-23;                             // eger kullanicinin pozitif ya da negatif girebilecegini ongorup
                                                    // ona gore kod yazmazsak, loop buddy'sinin hic calismadıgı durum
                                                    // olusabilir.

        if (input>1){

        for (int i = input; i >1 ; i--)
            System.out.print(i+" ");

        }else {
            for (int i =input; i <=1 ; i++) {
                System.out.println(i+" ");

            }
        }

        // eger sart i'nin tum degerleri icin true oluyorsa



        // teknik olarak sonsuz loop olusur
        // bilgisayarimiz sonsuza kadar calismaz ya RAM dolar ya da int sinirina kadar calisir
        // teknik olarak sonzuz loop olusur.

        // input olarak verilen sayidan 100'e kadar tum tam sayilari yazdirin

        input=10;

        for (int i = input; i <=100 ; i++) {
            System.out.println(i+" ");

        }

        //    for (int i = 1; i >0 ; i++) {   sonsuz looop aman calistirmaaaaa******************
        //    System.out.print(i+" ");

    }
}
