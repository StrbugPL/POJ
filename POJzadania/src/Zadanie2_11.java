class Vehicle {
    int passengers; // liczba pasażerów
    int fuelcap; // pojemność zbiornika paliwa w litrach
    int lkm; // zużycie paliwa w litrach na 100km

    // metoda obliczająca zasięg pojazdu
    int range() {
        return fuelcap * 100 / lkm;
    }
}

class VehicleProg {
    Vehicle miniVan = new Vehicle();
    Vehicle sportsCar = new Vehicle();

    public void setVehicleData() {
        miniVan.passengers = 6;
        miniVan.fuelcap = 30;
        miniVan.lkm = 12;

        sportsCar.passengers = 2;
        sportsCar.fuelcap = 20;
        sportsCar.lkm = 30;
    }

    public int getMiniVanRange() {
        return miniVan.range();
    }

    public int getSportsCarRange() {
        return sportsCar.range();
    }
}
