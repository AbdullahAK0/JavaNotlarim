package src.day06_IfElse_Statement;

import java.util.Scanner;

public class C01_IfElseStatement {
    public static void main(String[] args) {
        /*Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen” yazdirin,
        degilse “Eskenar degil” yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ucgenin kenar uzunluklarını giriniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>0){
            System.out.println("eskenar ucgen");
        }else {
            System.out.println("eskenar ucgen degil");}

        /* if ile baslayan bir kod else ile bitiyorsa
        input un tum degerlerini kapsar
        yani girilen her deger için if ya da else blok calisir.
         */
    }
}
