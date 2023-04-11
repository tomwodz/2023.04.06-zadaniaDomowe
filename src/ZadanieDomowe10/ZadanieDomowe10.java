package ZadanieDomowe10;

import ZadanieDomowe9.Id;
import ZadanieDomowe9.ZadanieDomowe9;

import java.util.Arrays;
import java.util.Random;

/*10.Napisz program generujący 3 tablice 10 elementowe (liczby -20 do 20).
        Program ma sprawdzić czy w każdej z tablic znajdują się 3 takie same elementy, jeśli nie to generuje tablice ponownie.
        Program ma wypisywać wygenerowane tablice oraz ilość ponownych generacji tablic.*/
public class ZadanieDomowe10 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        int[] tab2 = new int[tab.length];
        int[] tab3 = new int[tab.length];

        Random radom = new Random();


        boolean run = false;
        boolean test = false;
        boolean test2 = false;
        boolean test3 = false;

        int guquantityGeneration = 0;

        do {

            for(int i =0; i < tab.length; i++){
                tab[i] = radom.nextInt(-20,20);
                tab2[i] = radom.nextInt(-20,20);
                tab3[i] = radom.nextInt(-20,20);
           }

            // 2 wersje weryfikacji

            test = Verification.verification(tab);
            test2 = Verification.verification2(tab2);
            test3 = Verification.verification2(tab3);

            if(((test == true) && (test2 == true)) && (test3 == true)){
                run = true;
            }

            guquantityGeneration = Id.advanceId();

        } while (!run);

        Arrays.sort(tab);
        Arrays.sort(tab2);
        Arrays.sort(tab3);

        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(tab2));
        System.out.println(Arrays.toString(tab3));

        System.out.println("Ilosc powtornej generacji tablic ('jednocześnie') 3 na raz: " + guquantityGeneration);
    }

    }





