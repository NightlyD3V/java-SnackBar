package snackBarApp;

public class VendingMachine
{
    //fields 
    private static int maxId = 0;
    private int id;
    private String name; 

    //constructor
    public VendingMachine(String name)
    {
        this.name = name;
    }

    //getters & setters 
    public int getId()
    {
        return id;
    }

    public int setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public String setName(String name)
    {
        this.name = name;
    }
}