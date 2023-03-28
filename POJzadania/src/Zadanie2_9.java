import java.util.Random;
import java.util.Scanner;

public class Zadanie2_9 {

    public static void klawiszTheGame() {
        Random random = new Random();
        char wylosowanaLitera = (char) (random.nextInt(26) + 'a'); // losujemy literę a-z
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj literę: ");
        char podanaLitera = scanner.next().charAt(0);
        if (podanaLitera == wylosowanaLitera) {
            System.out.println("Dobrze!");
        } else {
            System.out.println("Odpowiedź niewłaściwa.");
            int roznica = wylosowanaLitera - podanaLitera;
            String komunikat = "Wylosowana litera znajduje się ";
            if (roznica > 0) {
                komunikat += "niżej na klawiaturze.";
            } else {
                komunikat += "wyżej na klawiaturze.";
            }
            System.out.println(komunikat);
        }
    }
}
