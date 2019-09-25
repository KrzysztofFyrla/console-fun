package enumeratedType;

public enum Cars {

    RENAULT_SCENIC(2001, 5),
    RENAULT_THALI(2004, 5),
    DACIA_DUSTER(2017, 5);

    private int year;
    private int door;

    Cars(int year, int door) {
        this.year = year;
        this.door = door;
    }

    public int getYear() {
        return year;
    }

    public int getDoor() {
        return door;
    }

    @Override
    public String toString() {
        return super.toString() +
                "year=" + year +
                ", door=" + door +
                '}';
    }
}
