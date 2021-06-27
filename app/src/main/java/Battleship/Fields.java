package Battleship;

public class Fields {
    final String FIRST_LINE = "  1 2 3 4 5 6 7 8 9 10";
    final char[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
    char[][] sea = new char[10][10];

    /**
     * Contractor sets sea with ~ chars
     */
    public Fields() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                this.sea[i][j] = '~';
            }
        }
    }

    /**
     * Method print sea
     */
    public void printSea() {
        System.out.println(FIRST_LINE);
        for (int i = 0; i < 10; i++) {
            System.out.print(this.chars[i]);
            for (char el : this.sea[i]) {
                System.out.printf(" %c", el);
            }
            System.out.print("\n");
        }
    }

    /**
     * Method place ship in the sea
     * @param coordinates where ship will placed
     * @param ship - which ship placed to the sea
     * @return err code:
     *      0 - OK
     *      400 - Wrong length
     *      401 - Wrong ship location!
     *      402 - placed it too close to another one
     */
    public int setShip(Coordinates coordinates, ShipType ship) {
        int ln = ship.getLength();
        if (coordinates.state.equals(State.WRONG)) {
            return 401;
        }
        if (isCloseToAnother(coordinates)) {
            return 402;
        }
        if (coordinates.state.equals(State.LANDSCAPE)) {
            if (ln != Math.abs(coordinates.getSecondX() - coordinates.getFirstX()) + 1) {
                return 400;
            }
            for (int i = coordinates.getFirstX(); i <= coordinates.getSecondX(); i++) {
                this.sea[coordinates.getFirstY()][i] = 'O';
            }
            return 0;
        }
        if (coordinates.state.equals(State.PORTRAIT)) {
            if (ln != Math.abs(coordinates.getSecondY() - coordinates.getFirstY()) + 1) {
                return 400;
            }
            for (int i = coordinates.getFirstY(); i <= coordinates.getSecondY(); i++) {
                this.sea[i][coordinates.getFirstX()] = 'O';
            }
        }
        return 0;
    }

    /**
     * Method checks another ships in coordinates
     * @param coordinates for check
     * @return true if another ship is close otherwise false
     */
    boolean isCloseToAnother(Coordinates coordinates) {
        boolean isClose = false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (this.sea[i][j] == 'O') {
                    if (coordinates.state.equals(State.LANDSCAPE)) {
                        for (int z = coordinates.getFirstX(); z <= coordinates.getSecondX(); z++) {
                            if (Math.abs(i - coordinates.getFirstY()) <= 1 && Math.abs(j - z) <= 1) {
                                isClose = true;
                                break;
                            }
                        }
                    }
                    if (coordinates.state.equals(State.PORTRAIT)) {
                        for (int z = coordinates.getFirstY(); z <= coordinates.getSecondY(); z++) {
                            if (Math.abs(i - z) <= 1 && Math.abs(j - coordinates.getFirstX()) <= 1) {
                                isClose = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return isClose;
    }

    /**
     * Method shot in the sea (for self sea)
     * @param location - place for shot
     * Method set by X place in sea if shot hit a ship
     * Method set by M place in sea if shot missed
     * @return result
     *      X - if shot hit a ship,
     *      M - if shot missed
     *      Z - if user hit to hited ship again
     *      * - err situation for next steps
     */
    public char takeShot(Location location) {
        if (this.sea[location.y][location.x] == 'O') {
            this.sea[location.y][location.x] = 'X';
            return 'X';
        }
        if (this.sea[location.y][location.x] == '~') {
            this.sea[location.y][location.x] = 'M';
            return 'M';
        }
        if (this.sea[location.y][location.x] == 'X') {
            return 'Z';
        }
        return '*';
    }

    /**
     * Method set char in sea. Fog of war (for enemy sea)
     * For write yours shots
     * @param location for shot
     * @param c shot answer
     */
    public void setField(Location location, char c) {
        this.sea[location.y][location.x] = c;
    }
}
