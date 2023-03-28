public class Zadanie2_10 {

    public static void potegiDwu() {
        int liczba = 2;
        for (int i = 0; i <= 14; i++) {
            int potega = potegi(liczba, i);
            System.out.println(liczba + "^" + i + " = " + potega);
        }
    }

    public static int potegi(int liczba, int potega) {
        int wynik = 1;
        for (int i = 1; i <= potega; i++) {
            wynik *= liczba;
        }
        return wynik;
    }
}
