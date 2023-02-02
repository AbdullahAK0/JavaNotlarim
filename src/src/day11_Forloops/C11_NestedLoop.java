package src.day11_Forloops;

public class C11_NestedLoop {
    public static void main(String[] args) {

         /*
        input degerine kadar her satirda * sayisini bir artirip
        sonra azaltarak asagidaki sekli yazdirin
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
        ipucu : artis ve azalis kisimlarini 2 ayri nested loop ile yapmalisiniz
         */
        int input= 5;
        // artis kismi icin nested loop
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        // azalis kismi icin nested loop
        for (int i = input-1 ; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        int rowCount=1;
        for (int i = 5; i > 0; i--)
        {
            //Printing i spaces at the beginning of each row

            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }

            //Printing 'rowCount' value 'rowCount' times at the end of each row

            for (int j = 1; j <= 5; j++)
            {
                System.out.print(rowCount+" ");
            }

            System.out.println();

            //Incrementing the rowCount

            rowCount++;
        }
    }

        }

