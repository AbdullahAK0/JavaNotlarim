package src.day12_MethodCreation;

public class C02_MethodOlusturma {
    public static void main(String[] args) {

        // verilen iki sayiyi carpip sonucu yazdiran bir method olusturun
        // bir method ancak method call yapildiginda calisir
        // method call icin method adi ve parametrelere uygun argument yazilmalidir.
        // method call icinde yazilan degerlere veriable ya da argument denir
        carpYazdir(5,8);
        carpYazdir(7.4,8.6);
        // carpYazdir("ali","veli"); istenen double yazilan String
        // argumenle parametreler uygun degilse CTE olur.

    }

    public static void carpYazdir(double sayi1,double sayi2){
        System.out.println(sayi1*sayi2);


    }
}

