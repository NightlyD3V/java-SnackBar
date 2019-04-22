package snackBarApp;

public class Snack
{
    private static int foodId = 0;
    public int id;
    public String name;
    public int quantity;
    public double cost;
    public int machineId;

    //constructor
    public Snack(String name, int quantity, double cost, int machineId)
    {
        foodId++;
        id = foodId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.machineId = machineId;
    }

    //getters & setters
    public int getId() 
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    
}