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
        System.out.println(c1.getName().toString() + " buys 3 sodas and has " + (c1.buySnack(c1.getCash(), 3, soda.cost)));
        System.out.println(c1.getCash());
        System.out.println("There are now " + soda.removeSnack(3) + " sodas");

        //2
        System.out.println(c1.getName().toString() + " buys 1 soda and has " + (c1.buySnack(c1.getCash(), 1, pretzel.cost)));
        System.out.println(c1.getCash());
        System.out.println("There are now " + pretzel.removeSnack(1) + " pretzels left");

        //3
        System.out.println(c2.getName().toString() + " buys 2 sodas and has " + (c2.buySnack(c2.getCash(), 2, soda.cost)));
        System.out.println(c2.getCash());
        System.out.println("There are now " + soda.removeSnack(2) + " sodas left");

        //4
        System.out.println(c1.getName().toString() + " finds " + c1.setCash(10) + " dollars");
        System.out.println(c1.getCash());

        //5
        System.out.println(c1.getName().toString() + " buys 1 bag of chips and has " + (c1.buySnack(c1.getCash(), 1, chips.cost)));
        System.out.println(c1.getCash());
        System.out.println("There are now " + chips.removeSnack(1) + " chips left");

        //6
        System.out.println("There are now " + pretzel.addSnack(12) + " pretzels left");
        System.out.println(pretzel.quantity);
        
        //7
        System.out.println(c1.getName().toString() + " buys 3 pretzels and has " + (c1.buySnack(c1.getCash(), 3, pretzel.cost)));
        System.out.println(c1.getCash());
        System.out.println("There are now " + pretzel.removeSnack(3) + " pretzels left");

        //stretch
    }
    public static void main(String[] args)
    {
        workWithData();
    }
}