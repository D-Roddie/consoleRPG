public class Combat {
    Player player;
    NPC enemy;
    public Combat(Player playerObj, NPC npc) {
        player = playerObj;
        enemy = npc;
    }

    public void takeTurn(){
        System.out.println("They fight");
        System.out.println(enemy.getHealth());
        System.out.println(player.getHealth());
    }
}
