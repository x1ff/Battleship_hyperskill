package Battleship;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldsTest {

    @Test
    @DisplayName("Set SUBMARINE Portrait")
    void setShipPortraitOk() {
        Fields fields = new Fields();
        Coordinates coordinates = new Coordinates("A8 C8");
        int result = fields.setShip(coordinates, ShipType.SUBMARINE);
        Assertions.assertEquals(0, result);
        Assertions.assertEquals('O', fields.sea[0][7]);
        Assertions.assertEquals('O', fields.sea[1][7]);
        Assertions.assertEquals('O', fields.sea[2][7]);
    }

    @Test
    @DisplayName("Set DESTROYER LANDSCAPE")
    void setShipLandscapeOk() {
        Fields fields = new Fields();
        Coordinates coordinates = new Coordinates("A1 A2");
        int result = fields.setShip(coordinates, ShipType.DESTROYER);
        Assertions.assertEquals(0, result);
        Assertions.assertEquals('O', fields.sea[0][0]);
        Assertions.assertEquals('O', fields.sea[0][1]);
    }

    @Test
    @DisplayName("Set AIRCRAFT_CARRIER wrong length")
    void setShipWrongLength() {
        Fields fields = new Fields();
        Coordinates coordinates = new Coordinates("A1 A2");
        int result = fields.setShip(coordinates, ShipType.AIRCRAFT_CARRIER);
        Assertions.assertEquals(400, result);
        Assertions.assertEquals('~', fields.sea[0][0]);
        Assertions.assertEquals('~', fields.sea[0][1]);
    }

    @Test
    @DisplayName("Set AIRCRAFT_CARRIER wrong ship location")
    void setShipWrongShipLocation() {
        Fields fields = new Fields();
        Coordinates coordinates = new Coordinates("A11 A15");
        int result = fields.setShip(coordinates, ShipType.AIRCRAFT_CARRIER);
        Assertions.assertEquals(401, result);
    }

    @Test
    @DisplayName("Set BATTLESHIP placed it too close to another one")
    void setShipCloseToAnother() {
        Fields fields = new Fields();
        Coordinates coordinates1 = new Coordinates("A1 A5");
        Coordinates coordinates2 = new Coordinates("B2 D2");
        fields.setShip(coordinates1, ShipType.AIRCRAFT_CARRIER);
        int result = fields.setShip(coordinates2, ShipType.AIRCRAFT_CARRIER);
        Assertions.assertEquals(402, result);
    }

    @Test
    @DisplayName("Close To Another true LANDSCAPE")
    void isCloseToAnotherLandscape() {
        Fields fields = new Fields();
        Coordinates coordinates1 = new Coordinates("A1 A5");
        Coordinates coordinates2 = new Coordinates("B2 B3");
        fields.setShip(coordinates1, ShipType.AIRCRAFT_CARRIER);
        boolean result = fields.isCloseToAnother(coordinates2);
        assertTrue(result);
    }

    @Test
    @DisplayName("Close To Another true PORTRAIT")
    void isCloseToAnotherPortrait() {
        Fields fields = new Fields();
        Coordinates coordinates1 = new Coordinates("A1 A5");
        Coordinates coordinates2 = new Coordinates("B2 C2");
        fields.setShip(coordinates1, ShipType.AIRCRAFT_CARRIER);
        boolean result = fields.isCloseToAnother(coordinates2);
        assertTrue(result);
    }

    @Test
    @DisplayName("Close To Another true PORTRAIT")
    void isNotCloseToAnotherPortrait() {
        Fields fields = new Fields();
        Coordinates coordinates1 = new Coordinates("A1 A5");
        Coordinates coordinates2 = new Coordinates("C2 C4");
        fields.setShip(coordinates1, ShipType.AIRCRAFT_CARRIER);
        boolean result = fields.isCloseToAnother(coordinates2);
        assertFalse(result);
    }

    @Test
    @DisplayName("Close To Another true LANDSCAPE")
    void isNotCloseToAnotherLandscape() {
        Fields fields = new Fields();
        Coordinates coordinates1 = new Coordinates("A1 A5");
        Coordinates coordinates2 = new Coordinates("C2 D2");
        fields.setShip(coordinates1, ShipType.AIRCRAFT_CARRIER);
        boolean result = fields.isCloseToAnother(coordinates2);
        assertFalse(result);
    }

    @Test
    @DisplayName("hit Shot ")
    void takeShotX() {
        Fields fields = new Fields();
        Coordinates coordinates = new Coordinates("A1 A5");
        fields.setShip(coordinates, ShipType.AIRCRAFT_CARRIER);
        Location location = new Location(1, 0);
        char result = fields.takeShot(location);
        assertEquals('X', result);
    }

    @Test
    @DisplayName("miss Shot ")
    void takeShotM() {
        Fields fields = new Fields();
        Coordinates coordinates = new Coordinates("A1 A5");
        fields.setShip(coordinates, ShipType.AIRCRAFT_CARRIER);
        Location location = new Location(0, 1);
        char result = fields.takeShot(location);
        assertEquals('M', result);
    }

    @Test
    @DisplayName("Shot to hit ship")
    void takeShotZ() {
        Fields fields = new Fields();
        Coordinates coordinates = new Coordinates("A1 A5");
        fields.setShip(coordinates, ShipType.AIRCRAFT_CARRIER);
        Location location = new Location(1, 0);
        fields.takeShot(location);
        char result = fields.takeShot(location);
        assertEquals('Z', result);
    }

    @Test
    @DisplayName("set Fields by location ")
    void setField() {
        Fields fields = new Fields();
        Location location = new Location(1, 0);
        fields.setField(location, 'X');
        assertEquals('X', fields.sea[0][1]);
    }
}