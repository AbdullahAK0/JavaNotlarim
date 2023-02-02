package src.day35_genelTekrar;

import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {


        // Verilen bir LinkedList'de
        // istenen iki index'deki elementlerin yerini degistirin

        LinkedList<String> isimler = new LinkedList<>();
        isimler.add("Said");
        isimler.add("Hüseyin");
        isimler.add("Hasan");
        isimler.add("Sevilay");
        isimler.add("Humeyra");

        System.out.println(isimler); // [Said, Hüseyin, Hasan, Sevilay, Humeyra]

        // Hasan ile Humeyra'nin yerini degistirin
        // buyuk bir listede index bilmeden yapalim

        String ilkIsim="Hasan";
        String ikinciIsim="Humeyra";

        String temp="";

        temp=ilkIsim;

        int iilIsimIndex=isimler.indexOf(ilkIsim);
        int ikinciIsimIndex=isimler.indexOf(ikinciIsim);

        isimler.set(iilIsimIndex,ikinciIsim);
        isimler.set(ikinciIsimIndex,temp);

        System.out.println(isimler);


        }

    }
