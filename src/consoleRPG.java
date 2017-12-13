public class consoleRPG {
    public static void main(String[] args){
        Player player = new Player(100,25, 5);
        System.out.println(player.getDmg());
        Troll troll1 = new Troll();

        Combat newCombat = new Combat(player, troll1);
        newCombat.takeTurn();
    }
}