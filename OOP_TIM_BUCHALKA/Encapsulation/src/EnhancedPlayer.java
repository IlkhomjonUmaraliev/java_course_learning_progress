public class EnhancedPlayer {
    private String playerName;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.playerName = name;
        if(health > 0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }


    public int getHealth() {
        return health;
    }

    public void loseHealth(int damage) {
       this.health = this.health - damage;
           if(this.health <= 0) {
               System.out.println("You Lose");
           }
    }
}


