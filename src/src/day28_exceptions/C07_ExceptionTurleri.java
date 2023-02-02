package src.day28_exceptions;

public class C07_ExceptionTurleri {

    public static void main(String[] args) {

        String str="234";
        // str'a sayisal olarak 5 ekleyin
        System.out.println(Integer.parseInt(str)+5);

        // eger str icinde sayi olmayan bir karakter varsa NumberFormatException

        Object sayiObj=str;
        Integer sayiInt=(Integer)sayiObj;

        System.out.println(sayiInt); // ClassCastException
    }
}
