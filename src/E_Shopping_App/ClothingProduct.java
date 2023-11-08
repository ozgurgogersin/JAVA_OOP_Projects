package E_Shopping_App;

public abstract class ClothingProduct extends Product{
    private String size;

    public ClothingProduct(String name, double price, Category category, String size) {
        super(name, price, category);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void displayInformation() {
        System.out.println("Cloth name: " + getName() + "Category : " + Category.CLOTHING + " Size is " + getSize() + " with " + getPrice() + "USD.");
    }

}

class ConcreteClothingProduct extends ClothingProduct{
    public ConcreteClothingProduct(String name, double price, Category category, String size) {
        super(name, price, category, size);
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
    }
}
