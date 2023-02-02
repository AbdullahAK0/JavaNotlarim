package src.day16_Arrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {

        // verilen bir String Array'in tüm elementlerini yazdirin

        String[] isimler={"hüseyin","yusuf","mehmet","akile","saibe"};

        System.out.println(Arrays.toString(isimler)); // [hüseyin, yusuf, mehmet, akile, saibe]

        for (int i = 0; i <isimler.length ; i++) {

            System.out.print(isimler[i]+" "); // hüseyin yusuf mehmet akile saibe
        }
    }
}
