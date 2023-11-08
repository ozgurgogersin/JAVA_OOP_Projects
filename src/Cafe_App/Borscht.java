package Cafe_App;

import java.util.ArrayList;

public class Borscht extends Food implements IFood {
    @Override
    public void taste() {
        System.out.println("Borscht can be enjoyed both hot or cold, and it is often served with a dollop of sour cream or a sprinkle of fresh herbs on top. It is a hearty and comforting dish, known for its deep flavors and wholesome ingredients.");
    }
    @Override
    public double price() {
        return 4.00;
    }

    @Override
    public void cuisine() {
        System.out.println("Borscht is a traditional " + Cuisine.RUSSIA.getName() + " soup.");
    }

    @Override
    public ArrayList<String> ingredients() {
        ArrayList<String> borschts = new ArrayList<>();
        borschts.add("Borschts Ingredients]\n" +
                "* 3 teaspoons extra virgin olive oil or vegetable oil, divided\n" +
                "* 1 (1 1/4 pound) section bone-in beef shank with a lot of meat, or 1 pound beef stew meat, excess fat trimmed\n" +
                "* 1 large onion, chopped (about 1 1/2 cups)\n" +
                "* 8 cups beef broth or beef stock, divided\n" +
                "* 4 large beets (about 1 1/2 pounds), peeled and chopped\n" +
                "* 4 carrots (1 pound), peeled and chopped\n" +
                "* 1 large russet potato (6 ounces), peeled and cut into 1/2-inch cubes\n" +
                "* 2 cups thinly sliced cabbage\n" +
                "* 3/4 cup chopped fresh dill, divided\n" +
                "* 3 tablespoons red wine vinegar\n" +
                "* 1 cup sour cream\n" +
                "* Salt and freshly ground black pepper to taste");
        return borschts;
    }
}
