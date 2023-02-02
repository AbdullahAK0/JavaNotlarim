package src.day24_StringBuilder;

public class C01_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sbl=new StringBuilder();
        // kapasitesi 16 olan bos bir stringbuilder olusturur.

        System.out.println(sbl); // bos bir satir yazdirir.
        System.out.println(sbl.capacity()); // 16

        StringBuilder sb2=new StringBuilder(11);
        System.out.println(sb2); // bos bir satir yazdirir
        System.out.println(sb2.capacity()); // 11

        StringBuilder sb3=new StringBuilder("java candir");
        System.out.println(sb3); // java candir
        System.out.println(sb3.capacity()); // 27

        sb2.append("java");
        System.out.println(sb2.capacity()); // 11
        System.out.println(sb2); // java

        sb2.append(" Candir");
        System.out.println(sb2); // java Candir
        System.out.println(sb2.capacity()); // 11

        sb2.append(".");
        System.out.println(sb2); // java Candir
        System.out.println(sb2.capacity()); // 24 = 2*11+2
        System.out.println("****************");

        StringBuilder str21=new StringBuilder();
        System.out.println(str21);
    }
}
