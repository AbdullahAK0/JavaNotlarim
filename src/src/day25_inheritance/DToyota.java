package src.day25_inheritance;

public class DToyota extends CCar{



    DToyota(){
        System.out.println("Parametresiz Toyota constructor'i calisti");
    }
    DToyota(String param1){
        System.out.println("Parametreli Toyota constructor'i calisti");
    }

    String marka = "Toyota";
    String uretimYeri = "Toyota farkli ulkelerde uretilir";
    String motor = "Her arabanin motoru olur";
}

