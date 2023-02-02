package src.day12_MethodCreation;

public class C07_TerseCevirme {

    public static void main(String[] args) {
        // verilen bir stringi terse cevirip
        // o halini bize donduren bir method olusturun

        System.out.println(metniTerseCevir("Java candir"));
    }

    public static String metniTerseCevir(String str){
        String tersstr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersstr+=str.charAt(i);
        }
        return tersstr;
    }
}
