package src.day12_MethodCreation;

public class C04_Faktoryel {

    public static void main(String[] args) {

        // verilen bir sayinin 1'den kucuk bir pozitif tamsayi oldugunu kontrol edin
        // kucukse bir method olusturup faktoryel degerini yazdirin.
        // sayi istenen aralikta degilse uyari yazdirin
        int input = 12;
        if (input > 0 && input < 15) {
            faktoryelYazdir(input);

        } else {
            System.out.println("girilen sayi 15'den kucuk tam sayi olmalidir.");


        }
        faktoryelYazdir(13);
    }

    public static void faktoryelYazdir(int sayi){
       int faktoryelSonucu=1;
        for (int i = sayi; i >=1 ; i--) {
            faktoryelSonucu*=i; // her loop da gelen sayiyi onceki deger ile carp

        }
        System.out.println("girilen " +sayi+ "icin faktoryel "+faktoryelSonucu);
    }
}
