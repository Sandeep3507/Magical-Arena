import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicalArenaTest {
    @Test
    public void testStartMatch() {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);
        MagicalArena arena = new MagicalArena(playerA, playerB);
        arena.startMatch();
        assertEquals(0, playerA.getHealth() || playerB.getHealth());
    }

    @Test
    public void testRollDie() {
        MagicalArena arena = new MagicalArena(new Player("Player A", 50, 5, 10), new Player("Player B", 100, 10, 5));
        int roll = arena.rollDie();
        assertEquals(true, roll >= 1 && roll <= 6);
    }
}