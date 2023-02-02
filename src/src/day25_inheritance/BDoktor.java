package src.day25_inheritance;

public class BDoktor extends APersonel {

    /*
     Olusturdugumuz doktor class'inda isim, soyisim gibi
     personel class'inda olusturulan tum ozelliklerin olmasini istiyoruz
     bu durumda iki tercih var
        1- istenen tum ozellikleri doktor class'inda yeniden olusturabilirsiniz.
        2- doktor class'ini personelinin child'i yapmak.

     Doktor class'ini personel class'inin child'i yaptigimizda
     doktor class'indan olusturdugumuz objeler
     sadece kendi class'indaki ozelliklere sahip olmaz
     ayni zamanda parent class'i olan personel'deki
     ozelliklere de sahip olur

     Bir child class'dan obje olusturdugumuzda o objenin ozelliklerini
     belirlerken once kendi class'ina bakilir ve o ozellik varsa kullanilir.
     Eger kendi class'inda yoksa parent class'a bakilir.

     Bir class extends keyword kullanarak baska bir
     class'i kendisine parent edinirse

        1- Parent class'daki tum ozellikleri direkt kullanabilir.
                    (isim,soyisim,telefon,sigorta)
        2- isterse parent class'da olan bir ozelligi kendisine uyarlayabilir
                    (maas)
        3- isterse parent class'da olmayan kendisine ozel yeni ozellikler ekleyebilir
                    (nobet)

     */


    public static void main(String[] args) {

        BDoktor dok1 = new BDoktor();
        dok1.isim="veli";
        dok1.soyIsim="gocuk";

        System.out.println(dok1.isim+","+dok1.soyIsim+","+dok1.telefon);
        dok1.maas();
        // Doktor maasi 30*8*25 = 6000 Eurodur.
        dok1.ozelSigorta();
        // Tum saglik personelimize ozel saglik sigortasi yaptirilir
    }

    public void maas(){
        System.out.println("Doktor maasi 30*8*25 = "+ "6000 Eurodur.");

    }

    public void nobet(){
        System.out.println("Doktorlar haftada 1 gun nobet tutar.");
    }



}
