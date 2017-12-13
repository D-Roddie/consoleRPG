abstract public class Location {

    private String name, description;

    public Location(String name, String description){
        this.name = name;
        this.description = description;
    }
    public String getActions(){
        return "actions";
    }
}
