package Battleship;

public class Coordinates {

    private final Location first;
    private final Location second;
    public State state;

    /**
     * Contractor set Locations fom param
     *
     * @param str - user input
     */
    public Coordinates(String str) {
        String[] subs = str.split(" ");
        this.first = new Location();
        this.second = new Location();
        this.first.setLocation(subs[0]);
        this.second.setLocation(subs[1]);
        normalizeCoordinate();
        setState();
    }

    /**
     * Method swap coordinates if first coordinate bigger then second one
     */
     void normalizeCoordinate() {
        if (this.first.x > this.second.x) {
            int buffX = this.first.x;
            this.first.x = this.second.x;
            this.second.x = buffX;
        }
        if (this.first.y > this.second.y) {
            int buffY = this.first.y;
            this.first.y = this.second.y;
            this.second.y = buffY;
        }
    }

    /**
     * Method set coordinate state
     * PORTRAIT - ship position from top to the bottom
     * LANDSCAPE - ship position from lift to the right
     * WRONG - diagonal or miss scope
     */
    void setState() {
        if (this.first.y != this.second.y && this.first.x == this.second.x) {
            this.state = State.PORTRAIT;
        } else if (this.first.y == this.second.y && this.first.x != this.second.x) {
            this.state = State.LANDSCAPE;
        } else {
            this.state = State.WRONG;
        }
    }

    public int getFirstX() {
        return first.x;
    }

    public int getSecondX() {
        return second.x;
    }

    public int getFirstY() {
        return first.y;
    }

    public int getSecondY() {
        return second.y;
    }
}
