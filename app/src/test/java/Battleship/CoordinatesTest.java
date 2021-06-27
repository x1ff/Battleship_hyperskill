package Battleship;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CoordinatesTest {

    @Test
    @DisplayName("Parse first coordinate X")
    void getFirstX() {
        System.out.println("\nINFO: Start test 1 \n");
        int expected = 0;
        Coordinates coordinates = new Coordinates("F1 F4");
        int firstX = coordinates.getFirstX();
        Assertions.assertEquals(expected, firstX);
        System.out.println("INFO: End test 1 / Status: pass\n");
    }

    @Test
    @DisplayName("Parse second coordinate X")
    void getSecondX() {
        System.out.println("\nINFO: Start test 2 \n");
        int expected = 9;
        Coordinates coordinates = new Coordinates("F8 F10");
        int secondX = coordinates.getSecondX();
        Assertions.assertEquals(expected, secondX);
        System.out.println("INFO: End test 2 / Status: pass\n");
    }

    @Test
    @DisplayName("Parse first coordinate Y")
    void getFirstY() {
        System.out.println("\nINFO: Start test 3 \n");
        int expected = 0;
        Coordinates coordinates = new Coordinates("A8 A10");
        int firstY = coordinates.getFirstY();
        Assertions.assertEquals(expected, firstY);
        System.out.println("INFO: End test 3 / Status: pass\n");
    }

    @Test
    @DisplayName("Parse second coordinate Y")
    void getSecondY() {
        System.out.println("\nINFO: Start test 4 \n");
        int expected = 9;
        Coordinates coordinates = new Coordinates("J8 J10");
        int secondY = coordinates.getSecondY();
        Assertions.assertEquals(expected, secondY);
        System.out.println("INFO: End test 4 / Status: pass\n");
    }

    @Test
    @DisplayName("Set state LANDSCAPE")
    void setStateLandscape() {
        System.out.println("\nINFO: Start test 5 \n");
        State expected = State.LANDSCAPE;
        Coordinates coordinates = new Coordinates("J8 J10");
        coordinates.setState();
        Assertions.assertEquals(expected, coordinates.state);
        System.out.println("INFO: End test 5 / Status: pass\n");
    }

    @Test
    @DisplayName("Set state PORTRAIT")
    void setStatePortrait() {
        System.out.println("\nINFO: Start test 6 \n");
        State expected = State.PORTRAIT;
        Coordinates coordinates = new Coordinates("A8 C8");
        coordinates.setState();
        Assertions.assertEquals(expected, coordinates.state);
        System.out.println("INFO: End test 6 / Status: pass\n");
    }

    @Test
    @DisplayName("Set state WRONG : diagonal")
    void setStateWrongByDiagonal() {
        System.out.println("\nINFO: Start test 7 \n");
        State expected = State.WRONG;
        Coordinates coordinates = new Coordinates("A1 C3");
        coordinates.setState();
        Assertions.assertEquals(expected, coordinates.state);
        System.out.println("INFO: End test 7 / Status: pass\n");
    }

    @Test
    @DisplayName("Set state WRONG : miss scope")
    void setStateWrongByMissScope() {
        System.out.println("\nINFO: Start test 8 \n");
        State expected = State.WRONG;
        Coordinates coordinates = new Coordinates("K10 K10");
        coordinates.setState();
        Assertions.assertEquals(expected, coordinates.state);
        System.out.println("INFO: End test 8 / Status: pass\n");
    }

    @Test
    @DisplayName("normalize Coordinate (B1 A1)  => (A1 B1)")
    void normalizeCoordinateY() {
        System.out.println("\nINFO: Start test 9 \n");
        int expectedFirstY = 0;
        int expectedSecondY = 1;
        Coordinates coordinates = new Coordinates("B1 A1");
        coordinates.normalizeCoordinate();
        Assertions.assertEquals(expectedFirstY, coordinates.getFirstY());
        Assertions.assertEquals(expectedSecondY, coordinates.getSecondY());
        System.out.println("INFO: End test 9 / Status: pass\n");
    }

    @Test
    @DisplayName("normalize Coordinate (B1 A1)  => (A1 B1)")
    void normalizeCoordinateX() {
        System.out.println("\nINFO: Start test 10 \n");
        int expectedFirstX = 0;
        int expectedSecondX = 1;
        Coordinates coordinates = new Coordinates("A2 A1");
        coordinates.normalizeCoordinate();
        Assertions.assertEquals(expectedFirstX, coordinates.getFirstX());
        Assertions.assertEquals(expectedSecondX, coordinates.getSecondX());
        System.out.println("INFO: End test 10 / Status: pass\n");
    }
}