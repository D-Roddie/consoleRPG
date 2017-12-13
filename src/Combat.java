public class Combat {

    private Player player;
    private NPC enemy;

    public Combat(Player playerObj, NPC npc) {
        player = playerObj;
        enemy = npc;
        System.out.println("Player encountered a " + enemy.getName());
        System.out.println(enemy.getName() + " says " + enemy.getDialog());
        do{
            takeTurn();
        }while (isCombatIsActive());
    }

    public void takeTurn(){

        //runs if player is faster or equal
        if (player.getSpd() >= enemy.getSpd()){
            System.out.println("The player strikes first at " + enemy.getName());
            enemy.decrementHealth(player.getDmg());
            if(enemy.isAlive()){
                System.out.println(enemy.getName() + " strikes back!");
                player.decrementHealth(enemy.getDmg());
            }
        }else{
            System.out.println(enemy.getName() + " strikes first at the player!");
            player.decrementHealth(enemy.getDmg());
            if(player.isAlive()){
                System.out.println("The player strikes back at " + enemy.getName());
                enemy.decrementHealth(player.getDmg());
            }
        }

    }

    public boolean isCombatIsActive() {
        if (player.isAlive() && enemy.isAlive()){
            return true;
        }else if(!player.isAlive()){
            System.out.println("Player was defeated by " + enemy.getName());
            return false;
        }else if(!enemy.isAlive()){
            System.out.println(enemy.getName() + " was defeated!");
            return false;
        }else return false;
    }
}