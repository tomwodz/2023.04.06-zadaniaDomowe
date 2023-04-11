
import java.util.Arrays;
import java.util.Random;

/*5.Napisz program który generuje 10 elementową tablicę liczb (0 - 100) a następnie przesuwa tą tablicę o 3 elementy w prawo. Program ma wypisywać na ekranie pierwotną oraz przesuniętą tablicę. Przykład:
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        [8, 9, 10, 1, 2, 3, 4, 5, 6, 7]*/
public class ZadanieDomowe5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tab = new int[10];
        int[] tabResult = new int[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(101);
        }

        System.out.println(Arrays.toString(tab));

        int n = 3;
        for (int i = 0; i < tab.length; i++) {

            if (i < n) {
                tabResult[i] = tab[tab.length - n + i];
            } else {
                tabResult[i] = tab[i - n];
            }
        }

        System.out.println(Arrays.toString(tabResult));

    }
}
