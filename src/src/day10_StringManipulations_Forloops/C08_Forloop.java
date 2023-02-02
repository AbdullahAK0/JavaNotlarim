package src.day10_StringManipulations_Forloops;

public class C08_Forloop {
    public static void main(String[] args) {

        // 1 ile 1000 arasindaki sayilari yanyana yazdirin
        // yazdirin islemi bittiginde
        // "tum bu sayilarin toplami = " deyip sayilarin toplamini yazdirin


        int sayilarToplami = 0;
        for (int i = 1; i <= 1000; i++) {
            System.out.print(i + " ");
            // sayilarToplami = sayilarToplami + i;
            sayilarToplami += i;
        }

            System.out.println("");
            System.out.println("tum bu sayilarin toplami =  "+ sayilarToplami);
        }
    }

