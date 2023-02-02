package src.day02_veriables_Scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
         /*
        Soru 3- Kullanicidan ismini, soyismini ve yasini alip,
        asagidaki formmatta yazdirin.
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen adinizi giriniz");
        String isim = scan.nextLine();
        System.out.println("lütfen soy isminizi giriniz");
        String soyIsim = scan.nextLine();
        System.out.println("lütfen yasinizi giriniz");
        int yas = scan.nextInt();

        System.out.print("isminiz: "+ isim + "\nsoyIsminiz: "+soyIsim+ "\nyasiniz: " +yas+ "\nkaydiniz basariyla tamamlanmistir");
    }
}
