package src.day16_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {


        String[] arr1 = new String[4];
        int[] arr2 = {3, 4, 5, 6, 7, 8};

        System.out.println(arr2[2]); // 5

        System.out.println(arr1[3]); // null

        // System.out.println(arr1[8]); // Index 8 out of bounds

        arr2[2]=15;
        arr2[0]=7;

        System.out.println(arr2); // [I@1d251891

        // Array'in tamamaını yazdirmak isterseniz Arrays class'indan yardim almaliyiz

        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.toString(arr1));

    }
}
