package src.day06_IfElse_Statement;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {
        // kullanıcıdan bir karakter isteyin
        //girilen karakterin buyuk harf olup olmadıgını yazdırın

            Scanner scan = new Scanner(System.in);
            System.out.println("lutfen bir karakter giriniz");
            char girilenKarakter = scan.next().charAt(0);
            if (girilenKarakter>='A'  && girilenKarakter<='Z') {
            System.out.println("girilen karakter buyuk harf");}
            else {
            System.out.println("girilen karakter buyuk harf degil");
        }



    }
}
