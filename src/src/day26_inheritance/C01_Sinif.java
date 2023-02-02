package src.day26_inheritance;

class Okul{

    String okulIsmi = "Yildiz Koleji";
    String telefon = "31456856523";

}

public class C01_Sinif extends Okul{

    String sinif = "11 F";
    String telefon = "12456688655";

    C01_Sinif(String telefon){


        System.out.println(this.telefon);
        System.out.println(super.telefon);
        System.out.println(telefon);


        System.out.println(okulIsmi);
        System.out.println(this.okulIsmi);
        System.out.println(super.okulIsmi);

        System.out.println(sinif);
        System.out.println(this.sinif);
       // System.out.println(super.sinif); parent class'da sinif veriable'i yok.
       // Java'da parent'da yoksa child'a gideyim yok.
       // parent class'da aranan sinif degeri olmadigindan CTE verir.

    }

    public static void main(String[] args) {
        C01_Sinif obj = new C01_Sinif("22455544444");
    }


}
