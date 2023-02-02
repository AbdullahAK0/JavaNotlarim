package src.day05_IfStatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {
        // Ogrenciden notunu rakam olarak alip harf olarak yazdirin
        // 0- 49,999 DD
        // 50-64,999 CC
        // 65-84,999 BB
        // 85-100 AA
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");
        double girilenNot = scan.nextDouble();

        if (0 <= girilenNot && girilenNot <= 50)
        {
            System.out.println("notunuz DD, maalesef kaldiniz");
        }

        if (50 <= girilenNot && girilenNot <= 65)
        {
            System.out.println("notunuz CC, tebrikler gectiniz");
        }
        if (65 <= girilenNot && girilenNot <= 85)
        {
            System.out.println("notunuz BB, tebrikler gectiniz");
        }
        if (85 <= girilenNot && girilenNot <= 100)
        {
            System.out.println("notunuz AA, tebrikler gectiniz");
        }
    }
}