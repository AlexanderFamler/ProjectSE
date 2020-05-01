package RPSE;

public class Community {
    private String name;
    private String description;


    //the class represents a community
    public Community(String name, String description) {
        if(name == null) {
            throw new IllegalArgumentException("Der Name einer Community darf nicht NULL sein!");
        }

        if(description == null) {
            throw new IllegalArgumentException("Die Beschreibung einer Community darf nicht NULL sein!");
        }

        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String description() {
        return description;
    }
}


