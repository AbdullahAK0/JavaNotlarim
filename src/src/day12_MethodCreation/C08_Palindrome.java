package src.day12_MethodCreation;

public class C08_Palindrome {

    public static void main(String[] args) {

        // verilen bir string'in palindrome olup olmadigini yazdirin
        // palidrome: duz okunusu ile tersten okunusu aynı olan metin

        String str = "ey edip adanada pide ye";

        String tersStr = C07_TerseCevirme.metniTerseCevir(str);

        if (str.equalsIgnoreCase(tersStr)){
            System.out.println("verilen metin palindrome");
        }else {
            System.out.println("verilen metin palindrome degil");
        }

    }
}
