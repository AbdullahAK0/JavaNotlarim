package src.day10_StringManipulations_Forloops;

public class C04_replaceFirst {
    public static void main(String[] args) {

        String str= "Java heyecandir";
        // eger tum a'lari degil de sadece il a'yi degistirmek istersek

        System.out.println(str.replaceFirst("a", "A")); // JAva heyecandir

        // ilk harf veya rakami * yap

        System.out.println(str.replaceFirst("\\W", "*")); //

    }
}
