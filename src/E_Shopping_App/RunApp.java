package E_Shopping_App;

public class RunApp {
    public static void main(String[] args) {

        ElectronicProduct electronicProduct = new ConcreteElectronicProduct("Laptop", 22.2, Category.ELECTRONICS, "dell");
        ClothingProduct clothingProduct = new ConcreteClothingProduct("Nike", 10, Category.CLOTHING, "Large");
        BookProduct bookProduct = new ConcreteBookProduct("Harry Potter", 5, Category.BOOKS, "J.K. Rowling");



        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.addProduct(electronicProduct);
        shoppingCart.addProduct(clothingProduct);
        shoppingCart.addProduct(bookProduct);
        ConcreteDiscountableElectronics concreteDiscountableElectronics=new ConcreteDiscountableElectronics();

        for (Product product : shoppingCart.getProducts()) {
            product.displayInformation();
        }
        double totalPrice=shoppingCart.calculataTotalPrice();
        double discount=concreteDiscountableElectronics.calculateDiscountedPrice(electronicProduct);
        System.out.println("You have %10 discount from electronics your total Price: $"+(totalPrice-discount));

    }

}
