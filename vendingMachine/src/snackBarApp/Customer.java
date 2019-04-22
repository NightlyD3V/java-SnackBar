package snackBarApp;

public class Customer 
{
    //fields
    private static int maxId = 0;
    private int id;
    private String name;
    private int cashOnHand = 0;

    //constructor 
    public Customer(String name, int cashOnHand)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.cashOnHand = cashOnHand;
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

    public String setName(String name)
    {
        this.name = name;
    }

    public int getCash()
    {
        return cashOnHand;
    }

    public int setCash(int cashOnHand)
    {
        this.getCashOnHand = cashOnHand;
    }
}