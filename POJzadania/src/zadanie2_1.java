public class zadanie2_1 {
    String imie;
    String nazwisko;
    int grupe;
    String kierunekStudiow;

    public zadanie2_1(String imie, String nazwisko, int grupa, String kierunekStudiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.grupe = grupa;
        this.kierunekStudiow = kierunekStudiow;
    }

    public void wyswietlInformacje() {
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Grupa: " + grupe + "c");
        System.out.println("Kierunek studiów: " + kierunekStudiow);
    }

}
