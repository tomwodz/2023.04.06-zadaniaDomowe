package ZadanieDomowe10;

import ZadanieDomowe10.Id;
import ZadanieDomowe10.ZadanieDomowe10;

import java.util.Arrays;
import java.util.Random;

/*10.Napisz program generujący 3 tablice 10 elementowe (liczby -20 do 20).
        Program ma sprawdzić czy w każdej z tablic znajdują się 3 takie same elementy, jeśli nie to generuje tablice ponownie.
        Program ma wypisywać wygenerowane tablice oraz ilość ponownych generacji tablic.*/
public class ZadanieDomowe10 {
    public static void main(String[] args) {
        Random radom = new Random();
        int[] tab = new int[10];
        int[] tab2 = new int[tab.length];
        int[] tab3 = new int[tab.length];
        boolean run = true;
        int guquantityGeneration = 0;

        do {
            for(int i =0; i < tab.length; i++){
                tab[i] = radom.nextInt(-20,20);
                tab2[i] = radom.nextInt(-20,20);
                tab3[i] = radom.nextInt(-20,20);
           }
            run = Verification2.verification(tab, tab2, tab3);
            guquantityGeneration = Id.advanceId();
        } while (run);

        Arrays.sort(tab);
        Arrays.sort(tab2);
        Arrays.sort(tab3);

        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(tab2));
        System.out.println(Arrays.toString(tab3));

        System.out.println("Ilosc powtornej generacji tablic ('jednocześnie') 3 na raz: " + guquantityGeneration);
    }

    }


     /*      boolean test = false;
        boolean test2 = false;
        boolean test3 = false;*/

    /*
            test = Verification.verification(tab, tab2, tab3);
            test2 = Verification.verification(tab2);
            test3 = Verification.verification(tab3);

            if(((test == true) && (test2 == true)) && (test3 == true)){
                run = true;
            }*/



