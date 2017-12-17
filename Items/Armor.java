abstract public class Armor extends Item{

    private int def;
    public Armor(String name, String description, int def) {
        super(name, description);
        this.def = def;
    }
}
