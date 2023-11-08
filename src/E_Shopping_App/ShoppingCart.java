package E_Shopping_App;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product>products;

    public ShoppingCart(){
        this.products=new ArrayList<>();
    }
    public void addProduct(Product product){
        products.add(product);
    }

    public double calculataTotalPrice(){
        double totalPrice=0.0;

        for (Product product:products) {
            totalPrice+=product.getPrice();

        }
        return totalPrice;
    }
   public List<Product>getProducts(){
        return products;
   }


}
