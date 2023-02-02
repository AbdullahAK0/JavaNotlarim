package src.day25_inheritance;

public class ECoralla extends DToyota{

    ECoralla(){
        System.out.println("Parametresiz Coralla constructor'i calisti");
    }

    ECoralla(String para1){
        super("gri");
        System.out.println("Stirng parametreli Coralla constructor calisti");
    }

    String model = "Coralla";
    String uretimYeri = "Turkiye";

    public static void main(String[] args) {

    ECoralla car1 = new ECoralla("mavi");


    }

    /*
        bir obje olusturuldugunda ilk deger atamasi yapilabilmesi icin
        constructor calismalidir.

        Inheritance da biliyoruz ki child class'dan olusturulan
        her obje parents class'daki ozelliklere de sahip olur.

        Parent class'daki ozellikleere sahip olabilmesi icin parent class'daki
        constructorlar da calismalidir.

        Java bu calismayi super constructor call sayesinde saglar

        Java'da her olusturulan clas'da gorunmese de default constructor oldugu gibi
        extends keyword kullanilan her class'da olusturulan her constructor'in ilk satirinda
        gorunmese de super constructor call vardir.


     */
}
