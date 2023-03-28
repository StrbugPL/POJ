public class Zadanie2_4 {

    public static boolean porownajStringi(String s1, String s2) {
        return s1.equals(s2);
    }

    public static void porownajStringi() {
        String s1 = "Ala ma kota";
        String s2 = "Ala ma psa";

        boolean wynikPorownania = porownajStringi(s1, s2);

        if (wynikPorownania) {
            System.out.println("Stringi są takie same.");
        } else {
            System.out.println("Stringi są różne.");
        }
    }}

