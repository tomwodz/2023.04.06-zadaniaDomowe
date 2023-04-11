package ZadanieDomowe10;

class Verification {


        // Weryfikacja, czy spełniony jest warunek [3,3,3,6,7][4,4,4,8,9...][7,7,7....] itd.
        // Nieaktywne.

        // wersja 1.1
    public static boolean verification2(int[] tab) {
        boolean run = false;
        for(int i = 0; i < tab.length; i++){
            int sameCounts = 1;
            for (int j =0; j <tab.length && i != j; j++){
                if(tab[i] == tab[j]){
                    sameCounts++;
                }
                if (sameCounts == 3){
                    run = true;
                    break;
                }
            }
        }
        return run;

    }

    // wersja 1
    public static boolean verification(int[] tab) {
        boolean run = false;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 1; j < tab.length; j++) {
                if (i != j) {
                    if (tab[i] == tab[j] && j > i) {
                        for (int k = j + 1; k < tab.length; k++) {
                            if (tab[j] == tab[k]) {
                                    run = true;
                                    break;

                                    }
                                }
                            }

                        }
                    }

                }
                return run;
            }


    }



