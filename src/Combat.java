public class Combat {

    private Player player;
    private NPC enemy;

    public Combat(Player player, NPC enemy, GameModel game) {
        this.player = player;
        this.enemy = enemy;

        game.appendToDialog("Player encountered a " + enemy.getName()
        + "\n" + enemy.getName() + " says " + enemy.getDialog() + "\n");
        do{
            takeTurn(game);
        }while (isCombatIsActive(game));
    }

    public void takeTurn(GameModel game){

        //runs if player is faster or equal
        if (player.getSpd() >= enemy.getSpd()){
            game.appendToDialog("The player strikes first at " + enemy.getName() + "\n");
            enemy.decrementHealth(player.getDmg());
            if(enemy.isAlive()){
                game.appendToDialog(enemy.getName() + " strikes back!\n");
                player.decrementHealth(enemy.getDmg());
            }
        }else{
            game.appendToDialog(enemy.getName() + " strikes first at the player!\n");
            player.decrementHealth(enemy.getDmg());
            if(player.isAlive()){
                game.appendToDialog("The player strikes back at " + enemy.getName() + "\n");
                enemy.decrementHealth(player.getDmg());
            }
        }

    }

    public boolean isCombatIsActive(GameModel game) {
        if (player.isAlive() && enemy.isAlive()){
            return true;
        }else if(!player.isAlive()){
            game.appendToDialog("Player was defeated by " + enemy.getName() + "\n");
            return false;
        }else{
            game.appendToDialog(enemy.getName() + " was defeated! \n");
            return false;
        }
    }
}