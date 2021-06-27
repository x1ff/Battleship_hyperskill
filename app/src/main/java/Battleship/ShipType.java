package Battleship;

public enum ShipType {
    AIRCRAFT_CARRIER(5, "Aircraft Carrier"),
    BATTLESHIP(4, "Battleship"),
    SUBMARINE(3, "Submarine"),
    CRUISER(3, "Cruiser"),
    DESTROYER(2, "Destroyer");

    private final int length;
    private final String name;

    ShipType(int ln, String name) {
        this.length = ln;
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    public void printHintForSet() {
        System.out.printf("\nEnter the coordinates of the %s (%d cells):\n\n",
                this.name, this.length);
    }

}
