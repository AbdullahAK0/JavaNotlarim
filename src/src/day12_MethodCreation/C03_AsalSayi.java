package src.day12_MethodCreation;

public class C03_AsalSayi {
    public static void main(String[] args) {
        // verilen bir sayinin asal olup olmadigini true ya d false olarak
        // donduren bir method olusturun

        System.out.println(asalSayiMi(59));

    }
    public static boolean asalSayiMi(int input){

        boolean asalSayiMi=true;
        for (int i = 2; i <input ; i++) {
            if (input%i==0)
                System.out.println("asal sayi degil");
            break;

        }
        return asalSayiMi;
    }

}
