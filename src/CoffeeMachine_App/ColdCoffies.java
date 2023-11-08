package CoffeeMachine_App;

public class ColdCoffies implements CoffeMachine {
    public void icedCoffee() {
        System.out.println("Your coffee " + CoffeeTypes.IcedCoffee.getNames() + " will be fresh and cold, Enjoy :)");
    }

    public void frappuccino() {
        System.out.println("Your coffee " + CoffeeTypes.Frappuccino.getNames() + " will be fresh and cold, Enjoy:)");
    }

    @Override
    public void selectCoffee() {

    }

    @Override
    public void selectSize() {

    }

    @Override
    public void addMilk() {

    }

    @Override
    public int addSuger() {

        return 0;
    }


}