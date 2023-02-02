package src.day10_StringManipulations_Forloops;

import java.util.Scanner;

public class C05_soru {
    public static void main(String[] args) {
         /*Kullanicidan bir cumle alin
        - cumlede ev geciyorsa, "home home sweet home" yazdirin
        - cumlede is geciyorsa, "calismak guzeldir"
        - ikisini de iceriyorsa "Hem ev lazim hem is"
        - hicbirini icermiyorsa "cok calisman lazim" yazdirin*/

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        String cumle1 = cumle.toLowerCase();

        if (cumle1.contains("ev") && !cumle1.contains("is")) {
            System.out.println("home sweet home");
        } else if (cumle1.contains("is") && !cumle1.contains("ev")) {
            System.out.println("calismak guzeldir");

        } else if (cumle1.contains("ev") && cumle1.contains("is")) {
            System.out.println("hem ev lazim hem is");

        } else {
            System.out.println("cok calismam lazim cok");

            // benim cozum
        }




        String str= "Evden calisiyorum, sirkete gitmeye gerek yok";
        String calisilacakStr=str.toLowerCase();
        if (calisilacakStr.contains("ev")&& calisilacakStr.contains(" is")){
            System.out.println("Hem ev lazim hem is");
        } else if (calisilacakStr.contains(" is")) {
            System.out.println("calismak guzeldir");
        } else if (calisilacakStr.contains("ev") ) {
            System.out.println("home home sweet home");
        }else{
            System.out.println("cok calisman lazim");

            // hocanin cozum
        }
    }


}
