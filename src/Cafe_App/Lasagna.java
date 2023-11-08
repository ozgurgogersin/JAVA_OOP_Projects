package Cafe_App;

import java.util.ArrayList;

public class Lasagna extends Food implements IFood {
    public void sauce() {
        System.out.println("SAUCE: Handmade white sauce keeps the dish moist and delectable.");
    }

    @Override
    public void taste() {
        System.out.println("The combination of the tomato sauce, meat or vegetables, pasta, and cheese creates a satisfying and mouthwatering taste experience that is beloved by many.");
    }

    @Override
    public double price() {
        return 9.00;
    }

    @Override
    public void cuisine() {
        System.out.println("Lasagna is a classic " + Cuisine.ITALY.getName() + " dish that consists of layers of pasta sheets, meat or vegetables, cheese, and a rich tomato sauce. ");

    }

    @Override
    public ArrayList<String> ingredients() {
        ArrayList<String> lasagna = new ArrayList<>();
        lasagna.add("Bolognese Sauce]\n" +
                "* 2 ounces diced pancetta, finely chopped\n" +
                "* 1 medium Spanish onion or yellow onion, finely chopped\n" +
                "* 1 rib celery, finely chopped\n" +
                "* 1 carrot, finely chopped\n" +
                "* 4 tablespoons unsalted butter\n" +
                "* 11 ounces ground beef\n" +
                "* 4 ounces ground pork\n" +
                "* 4 ounces ground Italian sausage\n" +
                "* 1 clove, freshly ground\n" +
                "* Dash freshly ground cinnamon\n" +
                "* 1 teaspoon freshly ground black pepper\n" +
                "* 2 pounds tomatoes , peeled and chopped, or 1 (28-ounce) can whole peeled tomatoes\n" +
                "* 1 cup whole milk\n" +
                "* 1/2 teaspoon sea salt\n" +
                "[Béchamel Sauce]\n" +
                "* 2 cups whole milk\n" +
                "* 1/4 cup unsalted butter\n" +
                "* 1/4 cup all-purpose flour\n" +
                "[Lasagna]\n" +
                "* About 16 sheets lasagna noodles (De Cecco brand recommended), enough to make 4 layers in a 13 x 9-inch baking pan with the noodles overlapping each other a little bit\n" +
                "* 1 cup freshly grated Parmesan cheese");
        return lasagna;
    }
}
