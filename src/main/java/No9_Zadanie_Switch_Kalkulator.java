import java.util.Scanner;

public class No9_Zadanie_Switch_Kalkulator {
    public static void main(String[] args) {

        /* Zad.3
        Napisz kalkulator (4 podstawowe czynności matematyczne). Podpowiedź: będzie potrzebował co najmniej 3 zmiennych:
        2 zmienne do przechowywania liczb oraz trzecia jako znak operacji np. '+' dla dodawania. Znak operacji możesz
        przechowywać w zmiennej typu char.
        */
        
        Scanner scannerCal = new Scanner(System.in);
        System.out.println("Zad.3 podaj pierwszą liczbę");
        double pierwszaLiczba = scannerCal.nextInt();
        System.out.println("Zad.3 wpisz znak działania matematycznego + , - , * , /");
        String znak = scannerCal.next();
        System.out.println("Zad.3 podaj drugą liczbę");
        double drugaLiczba = scannerCal.nextInt();
        double wynik = 0;
        switch (znak) {
            case "+":
                wynik = pierwszaLiczba + drugaLiczba;
                break;
            case "-":
                wynik = pierwszaLiczba - drugaLiczba;
                break;
            case "*":
                wynik = pierwszaLiczba * drugaLiczba;
                break;
            case "/":
                wynik = pierwszaLiczba / drugaLiczba;
                break;
            default:
                System.out.println("Zad.3 nie rozpoznaję znaku, nie można wykonać działania");
        }
        System.out.println("Zad.3 wynik działania " + pierwszaLiczba + " " + znak + " " + drugaLiczba + " = " + wynik);
    }
}
