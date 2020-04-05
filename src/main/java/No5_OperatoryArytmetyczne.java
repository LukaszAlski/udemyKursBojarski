public class No5_OperatoryArytmetyczne {

    public static void main(String[] args) {

        double a = 9;
        double b = 2;

        //-------------- OPERATORY ARYTMETYCZNE, przy pomocy SKRÓTÓW (inkrementacja, dekrementacja)

        a = a + 1;
        System.out.println("a = a + 1: " + a);
        a += 1;
        System.out.println("a += 1: " + a);

        // ----inkrementacja----
        a++;
        System.out.println("a ++ (inkrementacja): " + a);
        // ----dekrementacja----
        a--;
        System.out.println("a-- (dekrementacja): " + a);
        ++a;
        System.out.println("++a (najpierw zwiększenie a o 1, a następnie dodanie a); " + a);
        --a;
        System.out.println("--a (najpierw zmniejszenie a o 1, a następnie odjęcie a); " + a);

        System.out.println("---odstęp---");

        a += b; // inaczej: a = a + b;
        System.out.println("a = a + b: " + a);
        a -= b; // inaczej: a = a - b;
        System.out.println("a = a - b: " + a);
        a *= b; // inaczej: a = a * b;
        System.out.println("a = a * b: " + a);
        a /= b; // inaczej: a = a / b;
        System.out.println("a = a / b: " + a);
        a %= b; // inaczej: a = a % b;
        System.out.println("a = a % b: " + a);

        System.out.println("---odstęp---");


        // ------------ OPERATORY ARYTMETYCZNE, z których korzystam przy pomocy ZMIENNYCH
        double dodawanie = a + b;
        System.out.println("dodawanie: " + dodawanie);
        double mnozenie = a * b;
        System.out.println("mnożenie: " + mnozenie);
        double dzielenie = a / b;
        System.out.println("dzielenie: " + dzielenie);
        double resztaZDzielenia = a % b;
        System.out.println("reszta z dzielenia: " + resztaZDzielenia);


        /* -------------- ZADANIA (zmienne i operatory) -----------------
        1. Utwórz program, w którym stworzysz zmienne i przypiszesz do tych zmiennych wiek, wzrost i wagę. Niech będą w jednostkach
        lata, metry i kg odpowiednio.
        2. Na podstawie danych z zad.1 odblicz BMI. Wzór to masa/wzrost do 2 potęgi.
        3. Skonwertuj wynik z zad.2 na liczbę całkowitą (podpowiedź: konwersja z floata/double do inta)
        4. Podaj dowolną liczbę typu całkowitego, a następnie oblicz wynik dzielenia oraz resztę z dzielenia liczby
        przez 2, 3 oraz 11.
        6. Przypisz wartość przekraczającą rozmiar typu int i oszukaj środowisko, by nie wyrzucało błędu.
        */

        // Zad.1
        int wiek = 34;
        double wzrost = 1.7;
        double masa = 75;
        System.out.println("Zad.1 wiek: " + wiek + " wzrost: " + wzrost + " masa: " + masa);
        // Zad.2
        double BMI = masa / (wzrost * wzrost);
        System.out.println("Zad.2 Mój BMI, czyli masa/wzrost do potęgi 2 to: " + BMI);
        // Zad.3
        int skonwertowarneBmiDoInta = (int) BMI;
        System.out.println("Zad.3 skonwertowane BMI do inta: " + skonwertowarneBmiDoInta);
        // Zad.4
        int k = 12;
        //k = k/2;
        //k = k/3;
        //k = k/11;
        System.out.println("Zad.4 reszta z dzielenia k przez 2 to: " + k % 2);
        System.out.println("Zad.4 reszta z dzielenia k przez 3 to: " + k % 3);
        System.out.println("Zad.4 reszta z dzielenia k przez 11 to: " + k % 11);
        // Zad.4 przy pomocy metody
        System.out.print("Zad.4 przy pomocy metody. Reszta z dzielenia k przez 2 to: "); wynikResztyZDzielenia(2);
        System.out.print("Zad.4 przy pomocy metody. Reszta z dzielenia k przez 3 to: "); wynikResztyZDzielenia(3);
        System.out.print("Zad.4 przy pomocy metody. Reszta z dzielenia k przez 11 to: "); wynikResztyZDzielenia(11);
        System.out.println("\n");
        // Zad.6

        int e = Integer.MAX_VALUE;
        double f = Double.MAX_VALUE;
        System.out.println("Zad.6 max int: " + e);
        System.out.println("Zad.6 max double: " + f);
    }

    public static void wynikResztyZDzielenia(int podzielnik) {
        int liczba = 12;
        liczba = liczba / podzielnik;
        System.out.println(liczba % 2);
    }
}
