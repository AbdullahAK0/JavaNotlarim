package src.day09_StringManipulations;

public class C05_indexof {
    public static void main(String[] args) {

        String str= "Java ile kodlama cok kolay";

        // str cok iceriyor mu?
        System.out.println(str.contains("cok")); //true

        // kullanicinin girdigi cumle "cok" ile baslayan ilk kelimeyi yazdirin

        System.out.println(str.indexOf("a")); // 1
        System.out.println(str.indexOf("v")); // 2
        System.out.println(str.indexOf("cok")); // 17

        System.out.println(str.indexOf("a", 5)); // 13

        // 2. o'nun indexini yazdirin
        // once il o'nun indexini bulup
        // sonra 2. 'nun indexini buluruz
        // Java ile ogrenmek cok kolay.

        int ilkOindexi=(str.indexOf('o'));
        int ikinciOindexi=str.indexOf('o',ilkOindexi+1);

        System.out.println(str.indexOf('o',11));

    }
}
