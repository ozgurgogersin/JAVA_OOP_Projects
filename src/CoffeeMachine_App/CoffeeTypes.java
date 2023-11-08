package CoffeeMachine_App;

public enum CoffeeTypes {
    Americano("Americano"),
    Espresso("Espresso"),
    Cappuccino("Cappuccino"),
    Latte("Latte"),
    Mocha("Mocha"),
    Macchiato("Macchiato"),
    Affogato("Affogato"),
    IcedCoffee("Iced Coffee (Cold coffee)"),
    Frappuccino("Frappuccino (Cold coffee)"),
    IrishCoffee("Irish Coffee");
    private String names;

    CoffeeTypes(String names) {

        this.names = names;
    }

    public String getNames() {

        return names;
    }

}
