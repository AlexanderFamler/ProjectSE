package RPSE;

public abstract class AbstractReport {


    private int id;
    private String name;
    private String description;


    public abstract String getId();
    public abstract String getName();
    public abstract String getDescription();
    //public abstract Rating getRating();
    public abstract Community getCommunity();
    //public abstract Researcher getResearcher();
    //public abstract Publication getPublication();
}
