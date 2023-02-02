package src.day28_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis=new FileInputStream("src/day28_exceptions/metin.txt");


        /*
            bazi kodlari yazdigimizdajava compile time sirasinda
            o kodlarda exception riskini gorur ve bizden cozum bekler

            ozellikle dosya okuma ve yazma ile ilgili
            IO (input/output) islemlerinde Java ya okuyamazsam ya yazamazsam diyerek
            bizden compile time'da cozum ister.

            bu durumda biz exception ile karsilasildiginda kod dursun diyorsak
            method satirina throws keyword kullanarak
            beklenilen exception'lari  deklare edebiliriz
            bu sadece olayin farkinda oldugumuzu deklare eder
            exception firlatmanin ya da kodu durdurmanin onune gecmez

            kod calismaya devam etsin diyorsak : try-catch-(finally)
            blogu kullaniriz.

         */


    }
}
