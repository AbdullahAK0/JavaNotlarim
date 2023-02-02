package src.day10_StringManipulations_Forloops;

import java.util.Scanner;

public class C09_Forloop {
    public static void main(String[] args) {

        // kullanicidan baslangic ve bitis degerlerini alip
        // bu sinirlar dahil olarak bu sayilar arasinda 5'in kati olanlari yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir baslangic degeri giriniz");
        int baslangic = scan.nextInt();

        System.out.println("lutfen bir bitis degeri giriniz");
        int bitis = scan.nextInt();

        for (int i = baslangic; i <=bitis ; i++) {

            if (i%5==0)
                System.out.print(i+ " ");


        }
    }
}
