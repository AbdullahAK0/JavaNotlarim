package src.day06_IfElse_Statement;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {
        // Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu
        //buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char girilenKarakter = scan.next().charAt(0);

        if (girilenKarakter>='a' && girilenKarakter<='z'){
            System.out.println((char)(girilenKarakter-32));
            System.out.println((Character.toUpperCase(girilenKarakter)));
        }
        else{
            System.out.println(girilenKarakter);}


    }
}
