package src.day19_arrayList_forEachLoop;

public class ToyotaRunner {

    public static void main(String[] args) {

        Toyota toyota1= new Toyota();

        System.out.println( toyota1.marka+", "+
                            toyota1.model+", "+
                            toyota1.km+", "+
                            toyota1.yil+", "+
                            toyota1.renk);

        // Toyota, Model belirtilmemis, 0, 0, null

        toyota1.model="Coralla";
        toyota1.yil = 2020;
        toyota1.km = 142000;

        System.out.println( toyota1.marka+", "+
                toyota1.model+", "+
                toyota1.km+", "+
                toyota1.yil+", "+
                toyota1.renk);

        // Toyota, Coralla, 142000, 2020, null

    }


}
