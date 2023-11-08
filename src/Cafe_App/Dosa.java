package Cafe_App;
import java.util.ArrayList;
public class Dosa extends Food implements IFood {
    public void tricks() {
        System.out.println("TRICK: We ad semolina and rice flour to adjust consistency, furthermore we use semolina to make dosa crisp and also have a beautiful color.");
    }

    @Override
    public void taste() {
        System.out.println("The taste of dosa can be described as tangy, slightly sour, and savory.");
    }

    @Override
    public double price() {
        return 1.20;
    }

    @Override
    public void cuisine() {
        System.out.println("Dosa is a popular South " + Cuisine.INDIA.getName() + " dish that is enjoyed as a breakfast item or as a main course. ");

    }

    @Override
    public ArrayList<String> ingredients() {
        ArrayList<String> dosa = new ArrayList<>();
        dosa.add("Dosa Ingredients]\n" +
                "* 1-1/2 cups long grain rice.\n" +
                "* 1/2 cup urad dal (polished black lentil or white lentil)\n" +
                "* 3 quarts water.\n" +
                "* Salt.\n" +
                "* 1 medium onion, chopped.\n" +
                "* 1 – 2 green chilies, chopped.\n" +
                "* 1 Tbs. ghee (clarified butter) or regular butter.\n" +
                "* 1/2 tsp. black mustard seeds.");
        return dosa;
    }
}
