package Battleship;

public class Ship {
    private ShipType type;
    private int hitCount;
    private Coordinates coordinates;

    public Ship(ShipType type) {
        this.type = type;
        this.hitCount = 0;
    }

    public ShipType getType() {
        return type;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void hitCountIncrement() {
        this.hitCount++;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = new Coordinates(coordinates);
    }

    public boolean isHit(Location shot) {
        boolean isHit = false;
        if (this.coordinates.state.equals(State.PORTRAIT)) {
            for (int i = this.coordinates.getFirstY(); i <= this.coordinates.getSecondY(); i++) {
                if (this.coordinates.getFirstX() == shot.x &&
                        i == shot.y) {
                    isHit = true;
                }
            }
        } else if (this.coordinates.state.equals(State.LANDSCAPE)) {
            for (int i = this.coordinates.getFirstX(); i <= this.coordinates.getSecondX(); i++) {
                if (this.coordinates.getFirstY() == shot.y &&
                        i == shot.x) {
                    isHit = true;
                }
            }
        }
        return isHit;
    }
}
