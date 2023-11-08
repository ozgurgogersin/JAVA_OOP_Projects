package Cafe_App;

import java.util.ArrayList;

public class Donuts extends Food implements IFood {

    public void warning() {
        System.out.println("WARNING: Our donuts are baked in a hot oven instead of deep-fried in hot fat which makes them healtier!");
    }

    @Override
    public void taste() {
        System.out.println("The taste of a yeast-raised donut is mildly sweet. The dough itself is not overly sugary but has a pleasant sweetness that complements the toppings or glaze. The yeast contributes a subtle tanginess that balances out the sweetness.");
    }

    @Override
    public double price() {
        return 1.75;
    }

    @Override
    public void cuisine() {
        System.out.println("Donuts, also known as doughnuts, are popular pastries enjoyed in " + Cuisine.US.getName()+".");
    }

    @Override
    public ArrayList<String> ingredients() {
        ArrayList<String> donuts = new ArrayList<>();
        donuts.add("For the donuts]\n" +
                "* 1 1/4 cups whole milk, lukewarm (110°F to 115°F)\n" +
                "* 1/4 cup granulated sugar\n" +
                "* 1 packet (2 1/4 teaspoons) active dry yeast\n" +
                "* 4 1/2 cups (540g) all-purpose flour\n" +
                "* 1 teaspoon kosher salt\n" +
                "* 2 large eggs, lightly beaten\n" +
                "* 1 stick (1/2 cup) unsalted butter, melted and cooled for 10 minutes\n" +
                "* 2 quarts neutral oil (like canola or vegetable oil), for frying, plus more for greasing the bowl\n" +
                "* For the glaze\n" +
                "*  6 cups (680g) powdered sugar, sifted\n" +
                "* 3/4 cup whole milk\n" +
                "* 1 1/2 teaspoons vanilla extract");
        return donuts;
    }
}
