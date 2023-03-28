import java.util.Scanner;

public class Zadanie2_7 {

    public static double pojemnoscWalca(double r, double h) {
        return Math.PI * r * r * h;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj promień podstawy walca: ");
        double r = scanner.nextDouble();
        System.out.print("Podaj wysokość walca: ");
        double h = scanner.nextDouble();

        double pojemnosc = pojemnoscWalca(r, h);
        System.out.println("Pojemność walca wynosi: " + pojemnosc);
    }
}
