// to be inherited by NPC subclasses
abstract public class NPC {

    private int health, maxHealth, dmg, spd;
    private String dialog, name;

    public NPC(String name, int startHealth,int startDmg, int startSpd, String startDialog) {
        this.name = name;
        maxHealth = startHealth;
        health = maxHealth;
        dmg = startDmg;
        spd = startSpd;
        dialog = startDialog;


    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getDmg() {
        return dmg;
    }

    public int getSpd() {
        return spd;
    }

    public String getDialog() {
        return dialog;
    }

    public String getName() { return name; }

    public boolean isAlive(){
        if(health > 0){
            return true;
        }else return false;
    }

    //setters

    public void decrementHealth(int decValue){
        health = health - decValue;
    }
}
