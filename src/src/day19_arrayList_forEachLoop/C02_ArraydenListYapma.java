package src.day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArraydenListYapma {

    public static void main(String[] args) {

        Integer[] arr ={2,3,4,6,8,4,9,6,2,1};

        /* verilen bir Array'i listeye cevirmek icin iki yontem vardır
        1- bir loop ile tum elemanları list'e kopyalamak
        2- aslist() kullanmak
            cok tavsiye edilmez. cunku 2 buyuk dezavantaji var
            - aslist ile olusturulan list, array'den dıonusturuldugu icin
            add, remove gibi size'i etkileyen degisiklikler yapilamaz.
            - aslist ile olusturrulan list ile baglı oldugu array
            birbirinden ayrilmiyor. birinde yapacagimiz degisiklik otomatik olarak digerini etkiliyor.

         */

        List<Integer> list1= new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            list1.add(arr[i]);
        }
        System.out.println("loop ile tasinan list : " + list1);


        List<Integer> list2 = Arrays.asList(arr);
        System.out.println("aslist ile olusturulan list: "+list2);

       //  list2.add(6); // hata veriyor calistirinca

        arr[0]=10;
        System.out.println(Arrays.toString(arr)); // [10, 3, 4, 6, 8, 4, 9, 6, 2, 1]
        System.out.println(list2); // [10, 3, 4, 6, 8, 4, 9, 6, 2, 1]

    }
}
