package E_Shopping_App;

public class ConcreteDiscountableElectronics implements Discountable {
    @Override
    public double calculateDiscountedPrice(Product product) {

        return product.getPrice()*((double) 10 /100);
    }
}
