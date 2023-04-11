import java.util.Scanner;

/*6.Program zawiera zmienną n. Napisz program, który sprawdzi jaką potęgą liczby 2 jest liczba n. Program powinien wyświetlać potęgę lub komunikat jeśli liczba n nie jest potęgą liczby 2. Przykład:
        n = 4
        2
        n = 16
        4
        n = 128
        7
        n = 199
        to nie jest potęga dwójki*/
public class ZadanieDomowe6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita:");
        int n = scanner.nextInt();

        int power = 0;
        if (n % 2 == 0) {
            boolean run;

            do {
                run = true;
                power++;
                n = n / 2;
                if (n <= 2) {
                    power++;
                    run = false;
                }
            }
            while (run);

            System.out.println("Potega: " + power);

        } else {
            System.out.println(n + " to nie jest potega dwojki.");

        }


    }
}
