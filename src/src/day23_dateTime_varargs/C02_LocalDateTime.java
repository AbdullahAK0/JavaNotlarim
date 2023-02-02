package src.day23_dateTime_varargs;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class C02_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 2022-12-20T12:29:32.484015800

        ldt=LocalDateTime.now(ZoneId.of("Turkey"));
        System.out.println(ldt);

        System.out.println(ldt.withYear(2030)); //  2030-12-20T12:33:40.554788700


    }
}
