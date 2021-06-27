package Battleship;

public class Location {
    public int x;
    public int y;

    public Location() {

    }

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * Method parse param and set x and y vars
     * @param coordinate for parse
     * @return true if Location did set up and otherwise false
     */
    public boolean setLocation(String coordinate) {
        if(coordinate.length() > 3) {
            return false;
        }
        if(coordinate.length() < 2) {
            return false;
        }
        if (coordinate.charAt(0) < 65 || coordinate.charAt(0) > 74) {
            return false;
        }
        if (coordinate.length() == 3 &&
                (coordinate.charAt(1) != '1' || coordinate.charAt(2) != '0')) {
            return false;
        }
        if (coordinate.length() == 2 &&
                (coordinate.charAt(1) < 49 || coordinate.charAt(1) > 57)) {
            return false;
        }
        if (coordinate.length() == 3) {
            this.x = 9;
        } else {
            this.x = coordinate.charAt(1) - 49;
        }
        this.y = coordinate.charAt(0) - 65;
        return true;
    }
}
