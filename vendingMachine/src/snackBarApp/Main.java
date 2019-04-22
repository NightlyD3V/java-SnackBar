package snackBarApp;;

public class Main 
{

    public static void workWithData()
    {
        //customers
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        //vending machines 
        VendingMachine food = new VendingMachine("food");
        VendingMachine drink = new VendingMachine("drink");
        VendingMachine office = new VendingMachine("office");

        //snacks food
        Snack chips = new Snack("chips", 36, 1.75, food.getId());
        Snack chocolateBar = new Snack("chocolateBar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("pretzel", 30, 2.00, food.getId());

        //snacks drink
        Snack soda = new Snack("soda", 24, 2.50, drink.getId());
        Snack water = new Snack("water", 20, 2.75, drink.getId());

        //1
        System.out.println((c1.getCash() - (soda.cost * 3)));
        System.out.println(c1.getCash());
        System.out.println(soda.quantity);

        //2
        System.out.println(c1.getCash() - (pretzel.cost * 1));
        System.out.println(c1.getCash());
        System.out.println(pretzel.quantity);

        //3
        System.out.println(c2.getCash() - (soda.cost * 2));
        System.out.println(c2.getCash());
        System.out.println(soda.quantity);

        //4
        System.out.println(c1.getCash() + 10);
        System.out.println(c1.getCash());

        //5
        System.out.println(c1.getCash() - (chips.cost * 1));
        System.out.println(c1.getCash());
        System.out.println(chips.quantity);

        //6
        System.out.println(pretzel.quantity + 12);
        System.out.println(pretzel.quantity);
        
        //7
        System.out.println(c2.getCash() - (pretzel.cost * 3));
        System.out.println(c2.getCash());
        System.out.println(pretzel.quantity);
    }
    public static void main(String[] args)
    {
        workWithData();
    }
}