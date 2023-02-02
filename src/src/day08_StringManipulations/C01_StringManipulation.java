package src.day08_StringManipulations;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {
        // Kullanicidan gun ismini isteyin,
        // girilen gun hafta ici ise "Simdi calisma zamani tatile ... gun daha var"
        // seklinde hafta sonu tatiline kac gun kaldıgini yazdirin
        // girilen gun hafta sonu ise "Simdi dinlenme zamani yazdirin;

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gun ismini giriniz");
        String girilenGun = scan.next();
        String kullanilacakGun=girilenGun.toLowerCase();

        /* string ifadeler case sensetive'dir
        kulanicinin Pazar, PAzar.... GİBİ 32 farkli yazma ihtimali var

        kullanicinin girdiği degeri direk kalici olarak degistirmek tercih edilmez.
         */

        switch (kullanilacakGun){
            case "pazartesi":
                System.out.println(girilenGun + " calisma zamani, tatile 5 gun var");
                break;
            case "sali":
                System.out.println(girilenGun + " Simdi calisma zamani, tatile 4 gun var");
                break;
            case "carsamba":
                System.out.println(girilenGun + " Simdi calisma zamani, tatile 3 gun var");
                break;
            case "persembe":
                System.out.println(girilenGun + " Simdi calisma zamani, tatile 2 gun var");
                break;
            case "cuma":
                System.out.println(girilenGun + " Simdi calisma zamani, tatile 1 gun var");
                break;
            case "cumartesi":
            case "pazar"    :
                System.out.println(girilenGun + " Simdi tatil zamani");
                break;
            default:
                System.out.println("girilen gun hatali");

        }


    }
}
