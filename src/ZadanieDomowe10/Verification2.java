package ZadanieDomowe10;

public class Verification2 {

    // Sprawdza: [3,4,5,6,7,...][3,4,5,8.9,...][3,4,5,10,11...] [3,4,5] => true
    // Aktywne
    public static boolean verification(int[] tab, int[] tab2, int[] tab3) {
        boolean run = true;
        boolean temp = false;
        int temp_tab = 21; //nigdy nie wylosuje liczby 21
        int sameCounts = 0;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if ((tab[i] == tab2[j]) && (tab[i] != temp_tab)) {
                    for (int k = 0; k < tab.length; k++) {
                        if (tab2[j] == tab3[k]) {
                            temp_tab = tab3[k];
                            if(temp_tab != 21) {
                                temp = true;
                            }
                        }
                    }

                }
            }
            if (temp == true) {
                sameCounts++;
            }
            if (sameCounts == 3) {
                run = false;
            }
            temp = false;
        }
        return run;
    }
}

