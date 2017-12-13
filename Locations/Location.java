abstract public class Location {

    private String name, description, actions;

    public Location(String name, String description, String actions){
        this.name = name;
        this.description = description;
        this.actions = actions;
    }
    public String getActions(){
        return actions;
    }
    public void doAction(String action, Player player){}
}
