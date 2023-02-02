package src.day13_methodOverloadingWhileLooop;

import java.util.Scanner;

public class C05_whileLoop {

    public static void main(String[] args) {

        // kullanicidan toplamak uzere sayi alin
        // girilen sayilarin toplami 500 olur veya gecerse
        // " bu kadar sayi yeter" deyip yazdirin

        // bu soruyu illa da forloop ile yapalim dersek
        // adim sayisini tahmin edi biraz abartabiliriz

        Scanner scan = new Scanner(System.in);
        int toplam=0;
        int sayi=0;

        for (int i = 1; i <10000 ; i++) {

            System.out.println("toplamak üzere tam sayi giriniz");
            sayi=scan.nextInt();

            toplam+=sayi;

            if (toplam>=500){
                System.out.println("bu kadar sayi yeter. Toplamlari "+ toplam+ " oldu");
                break;
            }
        }

        // ayni soruyu whilloop ile yapalim
        toplam=0;
        sayi=0;

        while (toplam<500){
            System.out.println("toplamak üzere tam sayi giriniz");
            sayi=scan.nextInt();

            toplam+=sayi;

            System.out.println("bu kadar sayi yeter. Toplamlari "+ toplam+ " oldu");
        }
    }
}
