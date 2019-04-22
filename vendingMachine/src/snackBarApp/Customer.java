package snackBarApp;;

public class Customer 
{
    //fields
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand = 0.0;

    //constructor 
    public Customer(String name, double cashOnHand)
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

    public void setName(String name)
    {
        this.name = name;
    }

    public double getCash()
    {
        return cashOnHand;
    }

    public double setCash(double cashOnHand)
    {
        return this.cashOnHand = cashOnHand;
    }

    public double buySnack(double cashOnHand, int quantity, double cost)
    {
        return this.setCash(this.cashOnHand - (cost * quantity));
    }
}