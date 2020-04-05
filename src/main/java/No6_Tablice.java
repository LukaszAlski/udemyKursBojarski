public class No6_Tablice {
    public static void main(String[] args) {

        /* -------- TABLCIE JEDNOWYMIAROWE ----------
        - tablica to takie pudełko w przegródkami, w którym mogą być przechowywane dane, jedna dana w jednej
        przegródce;
        - dane w tablicy muszą być tego samego typu;
        - tablicę trzeba najpierw zadeklarować, a potem zainicjalizować ( WAŻNE: gdy zadeklarujemy tablicę, to
        nie zostanie jeszcze przydzielona dla niej pamięć komputera, nie możemy się do niej odwołać. By można było z niej korzystać,
        trzeba OKRESLIC jej ROZMIAR (zainicjalizować). Pamięć zostaje wówczas przydzielona i można będzie się już do niej
        odwołać.
        */
        int[] tablica;                          // <---deklaracja
        tablica = new int[4];                   // <---inicjalizacja (tabicy 4-ro elementowej o typie int)
        // int[] tablica2 = {2, 8, 17, 13};     // <---NAJLEPSZY, KRÓTKI ZAPIS, deklaracja i inicjalizacja w jednym!!!!!
        tablica[0] = 2;                         // <---odwołanie do cyfry zapisanej NA INDEKSIE 0
        tablica[1] = 8;                         // <---odwołanie do cyfry zapisanej NA INDEKSIE 1
        tablica[2] = 17;                        // ...
        tablica[3] = 13;
        System.out.println(tablica[3]);         // <---wypisanie indeksu 3

        System.out.println(tablica.length - 1); // <---sprawdzenie rozmiaru tablicy
                            /* ---WAŻNE --- indeksy tablicy liczone są od zera (O) więc jeśli chcemy odwołać się do ostatniego
                             elementu, to trzeba odjąć 1 od jej długości */


    /* -------- TABLCIE WIELOWYMIAROWE ----------

       KOLEJNOŚĆ w tablicy wielowym. zawsze: WIERSZ - KOLUMNA, zawsze liczone od zera!!!
    */
        double[][] tablicaDwuwymiarowa = new double[7][7];  // <---stworzenie tablicy z 7 wierszami i 7 kolumnami
        tablicaDwuwymiarowa[3][4] = 17;                     // <---przypisanie wartości do wiersza o indeksie 3 i kolumny o indeksie 4
        tablicaDwuwymiarowa[0][6] = 9;
        System.out.println(tablicaDwuwymiarowa[3][4]);

        double[][] nowaTablicaDwuwymiarowa = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}}; // <---KRÓTKI ZAPIS, deklaracja i inicjalizacja w jednym!!!!!
        // deklaracja słownie: {w wierszu pierwszym 6 kolumn}, {w wierszu drugim również 6 kolumn}

        double[][] nowaTablicaDwuwymiarowa2 = {                     // <---zapis dla prostrzego czytania
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12}
        };
        System.out.println("[0][0]: " + nowaTablicaDwuwymiarowa2[0][0]);
        System.out.println("[0][1]: " + nowaTablicaDwuwymiarowa2[0][1]);
        System.out.println("[1][2]: " + nowaTablicaDwuwymiarowa2[1][2]);
        System.out.println("[1][3]: " + nowaTablicaDwuwymiarowa2[1][3]);
        System.out.println("[1][5]: " + nowaTablicaDwuwymiarowa2[1][5]);

        System.out.println("Rozmiar całej tablicy (policzy ile ma wierzszy): " + nowaTablicaDwuwymiarowa2.length);
        System.out.println("Rozmiar kolumny 0 (policzy ilość kolumn we wskazanym wierszu): " + nowaTablicaDwuwymiarowa2[0].length);
        System.out.println("Rozmiar kolumny 1 (policzy ilość kolumn we wskazanym wierszu): " + nowaTablicaDwuwymiarowa2[1].length);


    /* -------- TABLCIE WIELOWYMIAROWE > TRÓJWYMIAROWA ----------

       KOLEJNOŚĆ w tablicy wielowym. zawsze: WIERSZ - KOLUMNA, zawsze liczone od zera!!!
    */
        int[][][] tablicaTrojwymiarowa = new int[5][6][11];    // <---tablica trójwymiarowa, 5 wierszy, 6 kolumn, 11 "głębi"
        // lepiej czytać tak: 1 wymiar ma 5 elementów, 2 wymiar na 6 elementów, 11 elementów w 3-im wymiarze



        /* -------------- ZADANIA (zmienne i operatory) -----------------
        1. Uzupełnij tablicę typu int rozmiaru 5 dowolnymi wartościami. Następnie zsumuj wszystkie elementy tablicy i wypisz je
        na ekran.
        2. Utwórz tablicę dwuwymiarową double 3x5, wypełnij wartościami, a następnie zsumuj elementy każdego wiersza osobno i
        wypisz je na ekran.
        */

        // Zad.1
        int[] tab1 = {1, 2, 3, 4, 5};
        int sumaElementowTab1 = tab1[0] + tab1[1] + tab1[2] + tab1[3] + tab1[4];
        System.out.println("suma wszystkich elementów tab1 = " + sumaElementowTab1);

        // Zad.2
        double[][] tab2 =
                {
                        {1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11, 12, 13, 14, 15}
                };
        double sumElemLine1 = tab2[0][0] + tab2[0][1] + tab2[0][2] + tab2[0][3] + tab2[0][4];
        double sumElemLine2 = tab2[1][0] + tab2[1][1] + tab2[1][2] + tab2[1][3] + tab2[1][4];
        double sumElemLine3 = tab2[2][0] + tab2[2][1] + tab2[2][2] + tab2[2][3] + tab2[2][4];
        System.out.println("suma elementów wiersza 1 tab2 wynosi " + sumElemLine1);
        System.out.println("suma elementów wiersza 2 tab2 wynosi " + sumElemLine2);
        System.out.println("suma elementów wiersza 3 tab2 wynosi " + sumElemLine3);

    }
}
