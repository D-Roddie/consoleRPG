public class Combat {

    private Player player;
    private NPC enemy;

    public Combat(Player playerObj, NPC npc) {
        player = playerObj;
        enemy = npc;
    }

    public void takeTurn(){
        if (player.getSpd() >= enemy.getSpd()){
            enemy.decrementHealth(player.getDmg());
            if(enemy.isAlive()){
                player.decrementHealth(enemy.getDmg());
            }
        }else{
            player.decrementHealth(enemy.getDmg());
            if(player.isAlive()){
                enemy.decrementHealth(player.getDmg());
            }
        }

    }

    public boolean isCombatIsActive() {
        if (player.isAlive() && enemy.isAlive()){
            return true;
        }else return false;
    }
}