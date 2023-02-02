package src.day07_ternary_switchStatements;

public class C10_SwitchStatements {
    public static void main(String[] args) {
        //Kullanıcıdan gün numarası alın
        //Haftaiçi veya haftasonu olduğunu yazdırın.
        int gunNo = 3;
        switch (gunNo) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Haftaiçi");
                break;
            case 6:
            case 7:
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Geçersiz gün sayısı");
        }
    }
}
