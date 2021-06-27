package Battleship;

import java.util.Scanner;

public class Player {
    private Ship[] ships = new Ship[5];
    public String name;
    public Fields self;
    public Fields enemy;

    /**
     * Contractor init self sea and enemy sea
     * self sea for set ships and answer for shots
     * enemy sea for shot and write results
     */
    public Player(String name) {
        this.name = name;
        this.self = new Fields();
        this.enemy = new Fields();
    }

    /**
     * Method set ships to the self sea
     *
     * @param sc scanner for get user input
     */
    public void setSelf(Scanner sc) {
        this.self.printSea();
        this.ships[0] = new Ship(ShipType.AIRCRAFT_CARRIER);
        this.ships[1] = new Ship(ShipType.BATTLESHIP);
        this.ships[2] = new Ship(ShipType.SUBMARINE);
        this.ships[3] = new Ship(ShipType.CRUISER);
        this.ships[4] = new Ship(ShipType.DESTROYER);

        for (int i = 0; i < 5; i++) {
            this.ships[i].getType().printHintForSet();
            String input = sc.nextLine();
            int errCode = this.self.setShip(new Coordinates(input), this.ships[i].getType());
            if (errCode == 0) {
                this.self.printSea();
                this.ships[i].setCoordinates(input);
                continue;
            } else if (errCode == 400) {
                System.out.printf("Error! Wrong length of the %s! Try again:",
                        this.ships[i].getType().getName());
                i--;
                continue;
            } else if (errCode == 401) {
                System.out.println("Error! Wrong ship location! Try again:");
                i--;
            } else if (errCode == 402) {
                System.out.println("Error! You placed it too close to another one. Try again:");
                i--;
            }
        }
    }

    /**
     * Method  shot to enemy sea
     *
     * @param coordinate for shot
     * @param enemy      for shot
     * @return true if coordinate is correct otherwise false
     */
    public boolean shot(String coordinate, Player enemy) {
        Location s = new Location();
        if (s.setLocation(coordinate)) {
            char r = enemy.takeShot(s);
            if (r == 'M') {
                this.enemy.setField(s, r);
                System.out.println("You missed!");
            }
            if (r == 'X') {
                this.enemy.setField(s, r);
                System.out.println("You hit a ship!");
            }
            if (r == 'Z') {
                System.out.println("You already shot here");
            }
            return true;
        } else {
            System.out.println("Error! You entered the wrong coordinates! Try again:");
            return false;
        }
    }

    protected boolean updateShips(Location l) {
        boolean isSank = false;
        for (int i = 0; i < 5; i++) {
            if (this.ships[i].isHit(l)) {
                this.ships[i].hitCountIncrement();
                isSank = this.ships[i].getType().getLength() == this.ships[i].getHitCount();
                break;
            }
        }
        return isSank;
    }

    protected boolean isWin(Player enemy) {
        boolean isWin = true;
        for (int i = 0; i < 5; i++) {
            if (enemy.ships[i].getHitCount() != enemy.ships[i].getType().getLength()) {
                isWin = false;
                break;
            }
        }
        return isWin;
    }

    public String getName() {
        return name;
    }

    public char takeShot(Location shot) {
        char r = this.self.takeShot(shot);
        if (r == 'X') {
            boolean isSank = updateShips(shot);
            if (isSank) {
                System.out.println("You sank a ship! Specify a new target:");
            }
        }
        return r;
    }
}
