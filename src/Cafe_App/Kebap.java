package Cafe_App;
import java.util.ArrayList;
public class Kebap extends Food implements IFood {
    public void marinade() {
        System.out.println("PREPARATION: The meat is prepared by marinating the day before.");
    }

    public void grill() {
        System.out.println("The meat is cooked on the grill fire slowly.");
    }

    @Override
    public void taste() {
        System.out.println("Kebabs are known for their flavorful and succulent taste. They offer a satisfying combination of well-seasoned meat, smoky charred notes, and a variety of complementary flavors.");
    }

    @Override
    public double price() {
        return 8.00;
    }

    @Override
    public void cuisine() {
        System.out.println("\n" +
                "Kebab is a popular dish that originated in the " + Cuisine.TURKEY.getName() + " but has gained worldwide popularity. ");

    }

    @Override
    public ArrayList<String> ingredients() {
        ArrayList<String> kebap = new ArrayList<>();
        kebap.add("For the marinade]\n" +
                "* 1/3 cup extra virgin olive oil\n" +
                "* 1/3 cup soy sauce\n" +
                "* 3 tablespoons red wine vinegar\n" +
                "* 1/4 cup honey\n" +
                "* 2 cloves garlic, minced\n" +
                "* 1 tablespoon minced fresh ginger\n" +
                "* Freshly ground black pepper to taste\n" +
                "[For the kebabs]\n" +
                "* 1 1/2 pounds top sirloin steak, cut into 1 1/2-inch cubes\n" +
                "* 1 large bell pepper\n" +
                "* 1 to 2 medium red onions\n" +
                "* 1/2 to 1 pound button mushrooms");
        return kebap;
    }
}
