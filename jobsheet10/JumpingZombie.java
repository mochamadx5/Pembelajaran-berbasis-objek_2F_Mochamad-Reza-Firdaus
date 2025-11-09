package jobsheet10;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += (int) (health * 0.30); // +30% [cite: 455]
                break;
            case 2:
                health += (int) (health * 0.40); // +40% [cite: 456]
                break;
            case 3:
                health += (int) (health * 0.50); // +50% [cite: 457]
                break;
        }
    }

    @Override
    public void destroyed() {
        // Teks: 1% , tapi output 66  menyiratkan 10%
        health -= (int) (health * 0.10);
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data =\nHealth = " + health + "\nLevel = " + level;
    }
}