package Bankomatas;
import java.util.Scanner;
public class Naudotojas {
    Bankomatas bankomatas = new Bankomatas();
    Scanner myScanner = new Scanner(System.in);
    private final String teisingasPin = "testas";
    int bandymuSkaicius;
    public int tikrinkPin() {
        String vedamasPin = myScanner.nextLine();

            if (vedamasPin.equals(teisingasPin)) {
                System.out.println("Prisijungimas sėkmingas....");
            } else {
                System.out.println("Slaptažodis Neteisingas. Bandykite dar kartą.");
                bankomatas.pradekDarba();
            }
        return bandymuSkaicius;
    }
}



