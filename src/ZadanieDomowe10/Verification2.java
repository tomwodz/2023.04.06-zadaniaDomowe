package ZadanieDomowe10;

public class Verification2 {

    // Sprawdza: [3,4,5,6,7,...][3,4,5,8.9,...][3,4,5,10,11...] [3,4,5] => true
    // Aktywne
    public static boolean verification(int[] tab, int[] tab2, int[] tab3) {
        boolean run = true;
        boolean temp = false;
        int sameCounts = 0;
        boolean nextVer = true;

        // Wykluczenie takich samych liczb w ramach jednej tablicy
        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] == tab[j]) {
                    nextVer = false;
                }
                if (tab2[i] == tab2[j]) {
                    nextVer = false;
                }
                if (tab3[i] == tab3[j]) {
                    nextVer = false;
                }
            }
        }

        if (nextVer == true) {
            for (int i = 0; i < tab.length; i++) {

                weDontNeedMore:
                for (int j = 0; j < tab.length; j++) {
                    if (tab[i] == tab2[j]) {
                        for (int k = 0; k < tab.length; k++) {
                            if (tab2[j] == tab3[k]) {
                                temp = true;
                                break weDontNeedMore; //warunek spełiony dla jakiegos "i"
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
        } else {
            run = true;
        }
        return run;
    }
}

