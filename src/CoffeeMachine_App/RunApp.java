package CoffeeMachine_App;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {
        CoffeeKitchen coffeeKitchen = new CoffeeKitchen();
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to CoffeeShop");
        System.out.println("---------------------");

        while (true) {
            coffeeKitchen.selectCoffee();
            String choice = in.next();

            if (choice.equals("1")) {
                coffeeKitchen.CoffeeList();
                System.out.println("Would you like to add milk to your coffee?");
                coffeeKitchen.yesNoMenu("milk");
                System.out.println("Do you want to add sugar to your coffee?");
                coffeeKitchen.yesNoMenu("sugar");

                label :
                while (true) {
                    System.out.println("Press [0] to exit!");
                    System.out.println("Press [1] to Take your order!");
                    System.out.println("Press [2] to Add coffee to your order!");
                    choice = in.next();

                    switch (choice) {
                        case "2":
                            coffeeKitchen.selectCoffee();
                            break;
                        case "1":
                            coffeeKitchen.takeOrder();
                            break label;
                        case "0":
                            System.out.println("Enjoy your coffee, have a nice day :)");
                            System.exit(0);
                        default:
                            System.out.println("Wrong Command!");
                            break;
                    }
                }

            } else if (choice.equals("0")) {
                System.exit(0);
            } else {
                System.out.println("Wrong Command");
            }
        }
    }
}
