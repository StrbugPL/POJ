import java.util.Scanner;

public class Zadanie2_2 {
    public static void uczen() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dane ucznia do wyświetlenia: ");


        System.out.println("Podaj imię ucznia:");
        String imie = scanner.nextLine();

        System.out.println("Podaj nazwisko ucznia:");
        String nazwisko = scanner.nextLine();

        System.out.println("Podaj grupę ucznia:");
        String grupa = scanner.nextLine();

        System.out.println("Podaj kierunek studiów ucznia:");
        String kierunek = scanner.nextLine();

        System.out.println("Dane ucznia:");
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Grupa: " + grupa);
        System.out.println("Kierunek studiów: " + kierunek);
    }
}
