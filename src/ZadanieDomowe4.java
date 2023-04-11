/*4.Napisz program w którym zdefiniowana jest zmienna n. Program ma wyświetlać n elementów ciągu Fibonacciego. Co to jest ciąg Fibonacciego znajdziecie na wikipedii. Przykład:
        n = 3
        0 1 1
        n = 8
        0 1 1 2 3 5 8 13*/

import java.util.Arrays;
import java.util.Scanner;

public class ZadanieDomowe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc elemnetu ciagu Fibonacciego: ");
        int n = scanner.nextInt();
        int f;
        if (n == 0) {
            f = 0;
            System.out.println(f);
        } else if (n == 1) {
            f = 1;
            System.out.println(f);
        } else if (n >= 2) {

            int[] tab = new int[n];
            tab[0] = 0;
            tab[1] = 1;

            for (int i = 2; i < n; i++) {
                tab[i] = tab[i - 1] + tab[i - 2];
            }
            System.out.println(Arrays.toString(tab));
        }

    }
}
