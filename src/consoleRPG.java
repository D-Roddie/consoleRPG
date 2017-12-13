public class consoleRPG {
    public static void main(String[] args){
        Player player = new Player(100,25, 5);
        Troll troll1 = new Troll();

        Combat newCombat = new Combat(player, troll1);
        do {
            newCombat.takeTurn();
        }while (newCombat.isCombatIsActive());

        System.out.println(player.getHealth());
        System.out.println(troll1.getHealth());
    }
}