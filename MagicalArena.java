import java.util.Random;

public class MagicalArena {
    private Player playerA;
    private Player playerB;
    private Random random;

    public MagicalArena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.random = new Random();
    }

    public void startMatch() {
        Player attacker = playerA.getHealth() < playerB.getHealth()? playerA : playerB;
        Player defender = attacker == playerA? playerB : playerA;

        while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
            int attackRoll = rollDie();
            int defendRoll = rollDie();
            int attackDamage = attacker.getAttack() * attackRoll;
            int defendStrength = defender.getStrength() * defendRoll;
            int damageDealt = Math.max(0, attackDamage - defendStrength);
            defender.setHealth(defender.getHealth() - damageDealt);

            System.out.println(attacker.getName() + " attacks " + defender.getName() + " for " + damageDealt + " damage!");
            System.out.println(defender.getName() + " health: " + defender.getHealth());

            // Switch roles
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        if (playerA.getHealth() <= 0) {
            System.out.println("Player B wins!");
        } else {
            System.out.println("Player A wins!");
        }
    }

    private int rollDie() {
        return random.nextInt(6) + 1;
    }
}