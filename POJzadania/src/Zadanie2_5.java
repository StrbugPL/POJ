
    public class Zadanie2_5 {
        public static void operatory() {
            // inkrementacja i dekrementacja
            int x = 5;
            System.out.println("x = " + x);
            x++;
            System.out.println("Po inkrementacji: x = " + x);
            x--;
            System.out.println("Po dekrementacji: x = " + x);

            // operatory arytmetyczne
            int a = 10;
            int b = 5;
            int suma = a + b;
            int roznica = a - b;
            int iloczyn = a * b;
            int iloraz = a / b;
            int reszta = a % b;
            System.out.println("suma = " + suma);
            System.out.println("roznica = " + roznica);
            System.out.println("iloczyn = " + iloczyn);
            System.out.println("iloraz = " + iloraz);
            System.out.println("reszta = " + reszta);

            // operatory relacyjne
            int c = 10;
            int d = 20;
            boolean wynik1 = c < d;
            boolean wynik2 = c > d;
            boolean wynik3 = c <= d;
            boolean wynik4 = c >= d;
            boolean wynik5 = c == d;
            boolean wynik6 = c != d;
            System.out.println("c < d: " + wynik1);
            System.out.println("c > d: " + wynik2);
            System.out.println("c <= d: " + wynik3);
            System.out.println("c >= d: " + wynik4);
            System.out.println("c == d: " + wynik5);
            System.out.println("c != d: " + wynik6);
        }


}
