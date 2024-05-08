import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    @Test
    public void testGettersAndSetters() {
        Player player = new Player("Player A", 50, 5, 10);
        assertEquals("Player A", player.getName());
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
        player.setHealth(20);
        assertEquals(20, player.getHealth());
    }
}