package src;

public class InstrukcjaSwitch {
    public static void main(String[] args) {
        String danie = "Pizza";
                switch (danie) {
                    case "Pizza":
                        System.out.println("Cena to 22 zl");
                        break;
                    case "losos":
                        System.out.println("Cena to 30 zl");
                        break;
                    case "Frytki":
                        System.out.println("Cena to 9 zl");
                        break;
                    default:
                        System.out.println("Brak dania w karcie");
                }
    }
}
