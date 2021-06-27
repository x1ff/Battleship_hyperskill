package Battleship;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {

    @Test
    void setLocationMinXMinY() {
        Location location = new Location();
        boolean status = location.setLocation("A1");
        Assertions.assertTrue(status);
        Assertions.assertEquals(0, location.x);
        Assertions.assertEquals(0, location.y);
    }

    @Test
    void setLocationMaxYMaxY() {
        Location location = new Location();
        boolean status = location.setLocation("J10");
        Assertions.assertTrue(status);
        Assertions.assertEquals(9, location.x);
        Assertions.assertEquals(9, location.y);
    }

    @Test
    void setLocationWrong1() {
        Location location = new Location();
        boolean status = location.setLocation("@10");
        Assertions.assertFalse(status);
    }

    @Test
    void setLocationWrong2() {
        Location location = new Location();
        boolean status = location.setLocation("K10");
        Assertions.assertFalse(status);
    }

    @Test
    void setLocationWrong3() {
        Location location = new Location();
        boolean status = location.setLocation("A0");
        Assertions.assertFalse(status);
    }

    @Test
    void setLocationWrong4() {
        Location location = new Location();
        boolean status = location.setLocation("A11");
        Assertions.assertFalse(status);
    }

    @Test
    void setLocationWrong5() {
        Location location = new Location();
        boolean status = location.setLocation("A20");
        Assertions.assertFalse(status);
    }

    @Test
    void setLocationWrongLength1() {
        Location location = new Location();
        boolean status = location.setLocation("AA10");
        Assertions.assertFalse(status);
    }

    @Test
    void setLocationWrongLength2() {
        Location location = new Location();
        boolean status = location.setLocation("A");
        Assertions.assertFalse(status);
    }
}