package ZadanieDomowe9;

import java.util.Arrays;
import java.util.Random;

/*
9.Napisz program generujący tablicę liczb 10 elementową (liczby -7 do 7).
        Program sprawdza czy tablica zawiera duplikaty, jeśli zawiera to generuje nową.
        Program ma wyświetlić wygenerowaną tablicę bez duplikatów oraz ilość powtórnych generacji tablicy.*/

public class ZadanieDomowe9 {

    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random();
        boolean run;
        int guquantityGeneration;

        do {
            run = false;

            for (int i = 0; i < tab.length; i++) {
                tab[i] = random.nextInt(-7, 8);
            }

            guquantityGeneration = Id.advanceId();

            for (int i = 0; i < tab.length; i++) {
                for (int j = 1; j != i && j < tab.length; j++) {
                    if (tab[i] == tab[j]) {
                        run = true;
                    }
                }
            }

        } while (run);

        Arrays.sort(tab);
        System.out.println("Tablica: " + Arrays.toString(tab));
        System.out.println("Ilosc powtornej generacji tablicy: " + guquantityGeneration);
    }

    }








