package E_Shopping_App;

public abstract class BookProduct extends Product {
    private String author;

    public BookProduct(String name, double price, Category category, String author) {
        super(name, price, category);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void displayInformation() {
        System.out.println("Book name: " + getName() + "Category : " + Category.BOOKS + " Author is " + getAuthor() + " with " + getPrice() + "USD.");
    }


}

class ConcreteBookProduct extends BookProduct {
    public ConcreteBookProduct(String name, double price, Category category, String author) {
        super(name, price, category, author);
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
    }
}

