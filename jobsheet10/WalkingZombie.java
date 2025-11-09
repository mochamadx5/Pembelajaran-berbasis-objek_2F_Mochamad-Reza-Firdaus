package jobsheet10;

public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += (int) (health * 0.20); // +20% [cite: 449]
                break;
            case 2:
                health += (int) (health * 0.30); // +30% [cite: 450]
                break;
            case 3:
                health += (int) (health * 0.40); // +40% [cite: 451]
                break;
        }
    }

    @Override
    public void destroyed() {
        // Teks: 2% , tapi output 42  menyiratkan 20%
        health -= (int) (health * 0.20); 
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data =\nHealth = " + health + "\nLevel = " + level;
    }
}