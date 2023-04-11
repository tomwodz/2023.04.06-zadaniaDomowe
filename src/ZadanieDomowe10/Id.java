package ZadanieDomowe10;

class Id {
    static int nextId = 0;

    public static int advanceId() {

        return ++nextId;
    }
}