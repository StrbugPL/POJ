public class Zadanie2_6 {
    public static void macierz() {
        // tworzenie tablicy 3x3
        int[][] tablica = new int[3][3];

        // wypełnianie tablicy wartościami
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                tablica[i][j] = i+j;
            }
        }

        // wyświetlanie tablicy
        System.out.println("Tablica przed zamianą:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }

        // zamiana pierwszego i ostatniego wiersza miejscami
        int[] temp = tablica[0];
        tablica[0] = tablica[2];
        tablica[2] = temp;

        // wyświetlanie tablicy po zamianie
        System.out.println("Tablica po zamianie:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        macierz();
    }
}
