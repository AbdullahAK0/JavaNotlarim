package src.day21_staticKeyword;

import java.util.Arrays;

public class C05_PassByValueCokluElement {

    public static void main(String[] args) {

        int [] arr = {3,6,9,1,7};

        // bir method oludturup arr'yi methoda yollayalim
        // methodda array'in elementleri uzerinde degisiklik yapalim
        // ve array'i yazdiralim

        elementleriDegistir(arr); // [13, 6, 19, 1, 7]
        System.out.println(Arrays.toString(arr));


    }

    public static void elementleriDegistir(int [] b){

        b[0]=13;
        b[2]=19;
        System.out.println(Arrays.toString(b));


    }
}
