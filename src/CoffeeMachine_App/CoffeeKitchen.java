package CoffeeMachine_App;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CoffeeKitchen implements CoffeMachine {
    Scanner in = new Scanner(System.in);
    ArrayList<String> selectedCoffee;
    ArrayList<String> selectedSize;
    ArrayList<String> names;
    ArrayList<String> sizeList;

    public CoffeeKitchen() {
        selectedCoffee = new ArrayList<>();
        selectedSize = new ArrayList<>();

        sizeList = new ArrayList<>();
        sizeList.add("Small");
        sizeList.add("Medium");
        sizeList.add("Large");
        sizeList.add("XLarge");

        names = new ArrayList<>();
        names.add(CoffeeTypes.Americano.getNames());
        names.add(CoffeeTypes.Espresso.getNames());
        names.add(CoffeeTypes.Cappuccino.getNames());
        names.add(CoffeeTypes.Latte.getNames());
        names.add(CoffeeTypes.Mocha.getNames());
        names.add(CoffeeTypes.Macchiato.getNames());
        names.add(CoffeeTypes.Affogato.getNames());
        names.add(CoffeeTypes.IcedCoffee.getNames());
        names.add(CoffeeTypes.Frappuccino.getNames());
        names.add(CoffeeTypes.IrishCoffee.getNames());
    }

    public void CoffeeList() {
        System.out.println("------------------------------------");
        System.out.println("|          Coffee List!            |");
        System.out.println("|   Select hot or a cold coffee!   |");
        System.out.println("------------------------------------");
        System.out.println();

        for (int i = 0; i < names.size(); i++) {
            System.out.println("Press [" + i + "] to " + names.get(i));
        }

        while (true) {
            try {
                int customerOrder = in.nextInt();

                if (customerOrder == 7 || customerOrder == 8) {
                    ColdCoffies coldCoffies = new ColdCoffies();
                    if (customerOrder == 7) {
                        coldCoffies.icedCoffee();

                    } else {
                        coldCoffies.frappuccino();

                    }
                    selectedCoffee.add(names.get(customerOrder));
                    selectSize();

                    int sizeChoice = in.nextInt();

                    if (sizeChoice >= 0 && sizeChoice < sizeList.size()) {
                        selectedSize.add(sizeList.get(sizeChoice));
                        break;
                    } else {
                        System.out.println("Wrong Size Command!");
                        in.nextLine();
                    }
                } else if (customerOrder >= 0 && customerOrder < names.size()) {
                    selectedCoffee.add(names.get(customerOrder));
                    System.out.println("Good Choice! Which size do you want for your " + names.get(customerOrder));
                    selectSize();

                    int sizeChoice = in.nextInt();

                    if (sizeChoice >= 0 && sizeChoice < sizeList.size()) {
                        selectedSize.add(sizeList.get(sizeChoice));
                        break;
                    } else {
                        System.out.println("Wrong Size Command!");
                        in.nextLine();
                    }
                }
                System.out.flush();
            } catch (InputMismatchException | IndexOutOfBoundsException e) {
                System.out.println("Wrong Command! Press [0-9] to Select a coffee!");
                in.nextLine();
            }
        }
    }


    @Override
    public void selectCoffee() {
        System.out.println("PRESS [1] to Coffee Menu");
        System.out.println("PRESS [0] to Exit");
    }

    @Override
    public void selectSize() {

        System.out.println("PRESS [0] for Small Size");
        System.out.println("PRESS [1] for Medium Size");
        System.out.println("PRESS [2] for Large Size");
        System.out.println("PRESS [3] for XLarge Size");

    }

    @Override
    public void addMilk() {
        System.out.println("Milk added.");
    }

    @Override
    public int addSuger() {
        int sugar = 0;
        System.out.println("How many cubes of sugar do you want to add?");
        int choice1 = in.nextInt();
        sugar += choice1;
        System.out.println("You added " + sugar + " cubes.");
        return 0;
    }

    public void yesNoMenu(String type) {
        while (true) {
            System.out.println("Press [Y] to add " + type + " or [N] to continue without " + type + ":");
            String choice = in.next();
            if (choice.equalsIgnoreCase("n")) {
                if (type.equals("sugar")) {
                    System.out.println("Your coffee is being prepared without sugar!");
                }
                break;
            } else if (choice.equalsIgnoreCase("y")) {
                if (type.equals("milk")) {
                    addMilk();
                } else {
                    addSuger();
                }
                break;
            } else {
                System.out.println("Wrong command!");
            }
        }
    }

    public void takeOrder() {
        if (selectedCoffee.isEmpty() || selectedSize.isEmpty()) {
            System.out.println("No orders placed yet.");
            return;
        }
        try {
            ArrayList<String> correctOrders = new ArrayList<>();

            for (int i = 0; i < selectedCoffee.size(); i++) {
                String coffee = selectedCoffee.get(i);
                String orderSize = selectedSize.get(i);

                if (!coffee.isEmpty() && !orderSize.isEmpty()) {
                    if (coffee.equals(CoffeeTypes.IcedCoffee.getNames())) {
                        selectedSize.get(i);
                    } else if (coffee.equals(CoffeeTypes.Frappuccino.getNames())) {
                        selectedSize.get(i);
                    } else {
                        selectedSize.get(i);
                    }
                    correctOrders.add("No." + (i + 1) + ": " + selectedSize.get(i) + " " + coffee);
                }
            }

            if (correctOrders.isEmpty()) {
                System.out.println("No valid orders placed yet.");
            } else {
                System.out.println("Your order list:");
                System.out.println("----------------------");
                for (String co : correctOrders) {
                    System.out.println(co);
                }
                System.out.println("----------------------");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Inconsistent order sizes. Program is closing! Please restart manually later.");
            in.nextLine();
            System.exit(1);
        }
    }
}

