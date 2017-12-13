import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Player player = new Player(100,25, 5);
    @Test
    void testGetDmg() {
        assertEquals(25, player.getDmg());
    }

    @Test
    void testGetMaxHealth() {
        assertEquals(100, player.getMaxHealth());
    }

    @Test
    void testGetHealth() {
        assertEquals(100, player.getHealth());
    }

    @Test
    void testGetSpd() {
        assertEquals(5,player.getSpd());
    }

}