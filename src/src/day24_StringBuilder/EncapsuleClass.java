package src.day24_StringBuilder;

public class EncapsuleClass {

        // Java class uyelerine erisimin write and read olarak ayrilmasi istendiginde
        // Encapsulation kullanir.

        // bunun icin oncelikle bu class uyelerine normal yollarla erisim kapatilir.

        // sonra istedigimiz yetkiyi verecek public method olustururuz

        // sadece yazma yetkisi icin setter yetkisi
        // sadece okuma yetkisi icin getter yetkisi
        // kodlarimizin daha anlasilir bir sekilde atama ve yazma islemlerini yapmasi icin de
        // getter ve stter methodlari birlikte kullanilabilri
        // bazi developer'lar boyle yapmayi tercih eder.

        private int satis; // satis bolumunden deger girelebilsin ama degeri gorulemesin
        private int rapor=100; // rapor gorulebilsin ama degistirilemesin

        private int halkaAcikSayi = 10; // herkese acik olsun
        static int toplamSatis=0; // gorulebilsin ama degistirilemesin

    public int getHalkaAcikSayi() {
        return halkaAcikSayi;
    }

    public void setHalkaAcikSayi(int halkaAcikSayi) {
        this.halkaAcikSayi = halkaAcikSayi;
    }

    public int getToplamSatis() {
        return toplamSatis;
    }

    public void setSatis(int satis) {
        this.satis = satis;
        toplamSatis+=this.satis;
    }
}
