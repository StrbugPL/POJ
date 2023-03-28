public class Main {
    public static void main(String[] args) {

    //    zadanie2_1 osoba = new zadanie2_1("Cyprian", "Czerwiński", 25, "informatyka");
    //    osoba.wyswietlInformacje();

    //    Zadanie2_2.uczen();

    //    Zadanie2_3.wyswietlDomyslneWartosci();

    //    Zadanie2_4.porownajStringi();

    //    Zadanie2_5.operatory();

    //    Zadanie2_6.macierz();

    //    Zadanie2_7.pojemnoscWalca(2.2, 3.5);

    //    Zadanie2_8.tabelaPrawdy();

    //    Zadanie2_9.klawiszTheGame();

    //    Zadanie2_10.potegiDwu();

    public static void Zadanie2_11(String[] args) {
            VehicleProg vehicleProg = new VehicleProg();
            vehicleProg.setVehicleData();

            int miniVanRange = vehicleProg.getMiniVanRange();
            int sportsCarRange = vehicleProg.getSportsCarRange();

            System.out.println("Zasięg minivana wynosi: " + miniVanRange + " km");
            System.out.println("Zasięg sportowego samochodu wynosi: " + sportsCarRange + " km");
        }
    }
        }

    }
}

