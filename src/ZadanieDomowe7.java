import java.util.Arrays;
import java.util.Random;

/*7.Napisz program, który generuje 30 elementową tablicę (liczby 0 - 100). Program powinien wypisywać na ekranie wygenerowaną tablicę oraz drugą największą liczbę w tablicy. Przykład:
        [1,2,3,4,5,6]
        5
        [2,3,6,9,34,35}
        34
        [65,23,76,45,34,12}
        65*/
public class ZadanieDomowe7 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] tab = new int[30];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(101);
        }

        System.out.println("Tablica wygenerowana: ");
        System.out.println(Arrays.toString(tab));

        Arrays.sort(tab);
        System.out.println("Tablica posortowana: ");
        System.out.println(Arrays.toString(tab));

        System.out.println("Druga najwieksza liczba w tablicy - liczby takie same są pomijane: ");
        for (int i = tab.length - 1; i >= 1; i--) {
            if (tab[i - 1] < tab[i]){
                System.out.println(tab[i - 1]);
            break;}
            else if(i == 1){
                System.out.println("Nie ma drugiej najmniejszej liczby !!");
            }
        }
    }
}


