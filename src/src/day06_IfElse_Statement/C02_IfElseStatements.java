package src.day06_IfElse_Statement;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {
        // kullanıcıdan ucgenin kenar uzunluklarini aliniz
        // ucgen ikiz kenar ise "ikizkenar ucgen" degil ise "ikizkenar ucgen degil" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ucgenin kenar uzunluklarini giriniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if ((kenar1==kenar2 && kenar1!=kenar3 ) ||
                (kenar2==kenar3 && kenar2!=kenar1 ) ||
                (kenar3==kenar1 && kenar3!=kenar2 )){
            System.out.println("ikizkenar ucgen");
        }else {
            System.out.println("Ikizkenar degil");}


    }
}
