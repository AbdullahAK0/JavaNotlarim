package src.day21_staticKeyword;

public class C03_PassByValue {

    public static void main(String[] args) {

        int s = 20;

        System.out.println(s); // 20

        // int s = 30;
        // bir scope'da veriable'in yeniden tanimlanma imkani yoktur.

        // String s ="hasan";
        // data turunu degistirirek yeniden tanimlama da mumkun degildir
        // cunku kullanirken veriable'in ismini yazdigimizda hangi sayi veriable'ni kullanacagi mechul olur
        method1();

    }

    public static void method1() {
        method2(5);

        String s = "hasan";

        System.out.println(s.toLowerCase()); // hasan

    }
    public static void method2(int s){

        s=s*s;
        System.out.println(s);
    }
}
