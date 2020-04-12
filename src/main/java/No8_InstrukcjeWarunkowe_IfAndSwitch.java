import java.util.Scanner;

public class No8_InstrukcjeWarunkowe_IfAndSwitch {
    public static void main(String[] args) {
        /* -------- INSTRUKCJA WARUNKOWA "IF" ----------
        - w IF-ach zawsze zwracana jest wartość logiczna true/false, zgodnie z zapisaną instrukcją warunkową */

        int wiek = 15;
        boolean przyszedlZMama = false;
        boolean przyszedlZKolega = true;

        if (wiek >= 18) {
            System.out.println("Pozwól na zakup...");
        } else if (przyszedlZMama) {
            System.out.println("Pozwól na zakup, gdyż jest z mamą");
        } else if (przyszedlZKolega) {
            System.out.println("Poproś o dowód kupującego oraz jego kolegę i wówczas ewentulanie udziel zakupu");
        } else {
            System.out.println("Odmów zakupu");
        }


        /* -------- INSTRUKCJA WARUNKOWA "SWITCH" ----------
        - w switch zwracana jest wcześniej zdefiniowana wartość
        - zamiast "else if" jest "case" oraz zamiast "else" jest "default"
        - SWITCH dodatkowo od IF różni się tym, że jeśli spełniony jest jakiś case, a NIE WSTAWIMY PO NIM "BREAK",
        to wyświetlą się nam wszystkie następne case. Przykład: chcemy sprwdzić ile miesięcy zostało do końca roku.
        */
        System.out.println("Instrukcja warunkowa SWITCH na przykładzie kalendarza: ");

        int miesiac = 5;
        switch (miesiac) {
            case 1:
                System.out.println("styczeń");
            case 2:
                System.out.println("luty");
            case 3:
                System.out.println("marzec");
            case 4:
                System.out.println("kwiecień");
            case 5:
                System.out.println("maj");
            case 6:
                System.out.println("czerwiec");
            case 7:
                System.out.println("lipiec");
            case 8:
                System.out.println("sierpień");
            case 9:
                System.out.println("wrzesień");
            case 10:
                System.out.println("październik");
            case 11:
                System.out.println("listopad");
            case 12:
                System.out.println("grudzień");
        }


        // SWITCH z break'ami
        System.out.println("Instrukcja warunkowa SWITCH z break-iem: ");

        char pojedynczyZnak = 's';
        switch (pojedynczyZnak) {
            case 'a':
                System.out.println("podałeś małe a");
                break;
            case 's':
                System.out.println("podałeś małe s");
                break;
            case 'S':
                System.out.println("podałeś duże S");
                break;
            default:
                System.out.println("nie rozpoznano litery");
        }


        /* -------------- ZADANIA (IF oraz SWITCH) -----------------
        1. Sprawdź czy wpisana liczba jest parzysta czy nieparzysta. Wypisz odpowiedni komunikat na ekran.
        2. Oblicz podatek od dochodu. Podatek w pierwszym progu jest 17%, w drugim 32%. Sprawdź ile podatku musiałby
        zapłacić początkujący programista, zanim przekroczy próg wynoszący 85 528 zł, a ile doświadczony programista będący
        na drugim progu. Uwaga: zrób dodatkowe zabezpieczenie na wypadek, gdyby ktoś miałby więcej wydatków niż przychodu,
        czyli podałby ujemną kwotę dochodu.
        3. Napisz kalkulator (4 podstawowe czynności matematyczne). Podpowiedź: będzie potrzebował co najmniej 3 zmiennych:
        2 zmienne do przechowywania liczb oraz trzecia jako znak operacji np. '+' dla dodawania. Znak operacji możesz
        przechowywać w zmiennej typu char.
        ----> rozwiązanie w klasie "No9_Zadanie_Switch_Kalkulator"
        */

        System.out.println("ROZWIAZANIA ZADAN");

        // Zad.1
        int liczba = 67;
        if (liczba % 2 == 0) {
            System.out.println("Zad.1 podana liczba jest parzysta");
        } else {
            System.out.println("Zad.1 podana liczba jest nieparzysta");
        }


        // Zad.2
        // double przychod = 333333;
        Scanner scannerDoPodatku = new Scanner(System.in);
        System.out.println("Zad.2 wpisz kwotę przychodu");
        double przychod = scannerDoPodatku.nextDouble();
        if (przychod <= 0) {
            System.out.println("Zad.2 podatek do zapłaty nie należy się");
        } else if (przychod <= 85528) {
            double podatek = przychod * 0.17;
            System.out.println("Zad.2 kwota należnego podatku: " + podatek + " zł");
        } else {
            double podatek17 = przychod * 0.17;
            double podatek32 = (przychod - 85528) * 0.32;
            double podatek = podatek17 + podatek32;
            System.out.println("Zad.2 kwota należnego podatku (przekroczony próg) : " + podatek + " zł");
        }





    }
}
