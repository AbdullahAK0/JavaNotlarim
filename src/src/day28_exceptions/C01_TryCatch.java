package src.day28_exceptions;

import java.util.Scanner;

public class C01_TryCatch {

    public static void main(String[] args) {

        // kullanicidan iki tamsayi alip
        // sayilari birbirine bolup, sonucu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("birbirine bolmek icin 2 tamsayi giriniz");

        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        try {
            // 1- try bolumu : yapmak istedigimiz ama exception riski olusturan kodlar
            System.out.println("iki sayinin bolumu : "+ sayi1/sayi2);
        } catch (ArithmeticException e) {
            // 2- catch () : bekledigimiz muhtemel exception ve
            //            bu exc. gerceklesirse hata dokumanini store edebilecegimiz veriable

            System.out.println("bolecek sayi 0 olamaz");
            e.printStackTrace();
            // catch blogu : gerceklesirse calismasini istedigimiz kodlar
            //               burayi yazarken oncelikle
            //               exception olustugunda kodlarin calismasi dursun mu yoksa devam mi etsin
            //               karar vermeliyiz
        }


    }
}
