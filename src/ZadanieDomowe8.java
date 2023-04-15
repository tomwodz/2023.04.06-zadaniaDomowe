import java.util.Arrays;

/*
8.Napisz program w którym jest tablica zawierająca liczby od 2 do 101 (włącznie).
        Program ma wypisać liczby pierwsze znajdujące się w tej tablicy.
        Należy wykorzystać sito Eratostenesa. Sito Eratostenesa znajdziecie na wikipedii.*/
public class ZadanieDomowe8 {
    public static void main(String[] args) {

        int[] tab = new int[100];
        boolean[] tabEra = new boolean[tab.length];
        Arrays.fill(tabEra, false);


        for (int i = 0; i < tab.length; i++) {
            tab[i] = 2 + i;
        }
        System.out.println("Dane pogladowe: ");
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(tabEra));

        int ilePetli = 0;

        for (int i = 0 ; i < tab.length; i++) {
            if(tabEra[i] != true)
            {
               for(int j = 2; tab[i] * j <= tab[tab.length-1] ; j++)
                if(j!=4 || j!=6) {
                    {
                        for (int k = 0; k < tab.length; k++)
                            if (tab[i] * j == tab[k]) {
                                tabEra[k] = true;
                            }
                        ilePetli++;
                    }
                }
            }
        }

            System.out.println(Arrays.toString(tabEra));
            System.out.println(ilePetli);
            System.out.println("----------------------------------- !!");
            System.out.println("Wynik programu: ");

            for (int i = 0; i < tab.length; i++) {
                if (tabEra[i] == false) {
                    System.out.print(tab[i] + " ");
                }
            }

        }
    }






