package src.day09_StringManipulations;

import java.util.Scanner;

public class C04_endsWith {
    public static void main(String[] args) {
        String str= "Java ogrenen issiz kalmaz";
        System.out.println(str.endsWith("kalmaz")); // true

        System.out.println(str.endsWith("Java ogrenen issiz kalmaz"));

        System.out.println(str.endsWith("")); // true

        /*SORU : kullanicidan bir mail alin
        - mail @ icermiyorsa “gecersiz mail”
        - mail @gmail.com icermiyorsa, “mail gmail olmali”
        - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”
        yazdirin.*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen e mailinizi giriniz");
        String girilenMail= scan.nextLine();

        if(!girilenMail.contains("@")){
            System.out.println("gecersiz mail");
        } else if (!girilenMail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");

        } else if (!girilenMail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");

        }else {
            System.out.println("gecerli mail");

    }
}
}
