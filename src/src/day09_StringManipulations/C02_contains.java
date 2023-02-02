package src.day09_StringManipulations;

public class C02_contains {
    public static void main(String[] args) {
        String str1= "Java ogren, mutlu ol";

        // str mutlu iceriyor mu?

        System.out.println(str1.contains("mutlu")); // true

        // charSequence : char dizisi

        System.out.println(str1.contains("j")); // false
        System.out.println(str1.contains(" ")); // true

        // contains metodu kac tane olduguna degil
        // sadece var olup olmadigina bakar

        System.out.println(str1.contains("Java")&& str1.contains("mutlu"));
    }
}
