package src.day01_programlamaya_Giris;

public class C01_Veriables {
    public static class C02_Veriables {
        public static void main(String[] args) {
            
            int sayi = 20;
            System.out.println(sayi); // 20 sayi variable'nin degerini yazdirir
            System.out.println("sayi"); // sayi
            sayi = 30;
            System.out.println(sayi); // 30
            sayi = sayi + 20;
            System.out.println(sayi); // 50
            sayi = (sayi + sayi) * sayi;
            System.out.println(sayi);
            System.out.println("sayi = " + sayi);
        }
    }
}

