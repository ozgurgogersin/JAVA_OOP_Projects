package E_Shopping_App;

public abstract class ElectronicProduct extends Product {
    private String brand;
    public ElectronicProduct(String name, double price, Category category,String brand) {
        super(name,price,category);
        this.brand=brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void displayInformation() {
        System.out.println("ElectronicProduct name: "+getName()+"Category : "+Category.ELECTRONICS+" brand is "+ brand + " with "+getPrice()+"USD.");
    }


}

class ConcreteElectronicProduct extends ElectronicProduct {

    public ConcreteElectronicProduct(String name, double price, Category category, String brand) {
        super(name, price, category, brand);
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
    }

}

