package src.day25_inheritance;

public class APersonel {

    protected String isim = "Isim atanmadi";
    protected String soyIsim = "Soyisim atanmadi";
    protected String telefon = "telefon atanmadi";

   protected void maas(){
        System.out.println("Hastanemizde uygulanan asgari ucret: "+ "1700 eurodur");
    }
    protected void ozelSigorta(){
        System.out.println("Tum saglik personelimize ozel saglik sigortasi yaptirilir");
    }

    private void privateMethod(){
        System.out.println("private method calisti");
    }
}
