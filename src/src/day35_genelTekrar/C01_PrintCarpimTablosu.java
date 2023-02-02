package src.day35_genelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_PrintCarpimTablosu {

    public static void main(String[] args) {

        // kullanicidan bir rakam alin ve carpim tablosu olusturun

      /*  Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz");
        int rakam=0;
        for (int i = 2; i <= rakam; i++) {
            for (int j = 1; j <= rakam; j++) {
                System.out.print(i * j + " \n");

            }

        }

       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz");
        int rakam = 0;

        while (rakam <= 1 || rakam >= 10) {

            try {

                System.out.println("Carpim tablosu olusturmak icin bir rakam giriniz");
                rakam = scan.nextInt();

                if (rakam > 1 && rakam < 10) {
                    break;
                }
                System.out.println("Carpim tablosu icin 1'den buyuk pozitif bir rakam girmelisiniz");
            } catch (InputMismatchException e) {
                System.out.println("Carpim tablosu icin 1'den buyuk pozitif bir rakam girmelisiniz");
                scan.next();


            }

            }
        for (int i = 2; i <= rakam; i++) {
            for (int j = 1; j <= rakam; j++) {
                int carpim=i*j;
                System.out.printf("%-2d  ",carpim);
            }
            System.out.println("");
        }
    }
}
