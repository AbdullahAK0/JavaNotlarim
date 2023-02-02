package src.day08_StringManipulations;

public class C04_equalsIgnoreCase {
    public static void main(String[] args) {

        String str1= "Pazar";
        String str2= "PAZAR";
        String str3= "pazar";
        String str4= "PaZaR";

        System.out.println(str1==str2); // false
        System.out.println(str1==str3); // false
        System.out.println(str1==str4); // false

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equals(str3)); // false
        System.out.println(str1.equals(str4)); // false

        /* eger iki metni karsilastirirken buyuk harf
        kucuk harf ayrimi önemsiz ise equalsIgnorcase kullaniriz*/

        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str1.equalsIgnoreCase(str3)); // true
        System.out.println(str1.equalsIgnoreCase(str4)); // true

    }
}
