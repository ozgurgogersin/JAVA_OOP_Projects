package Cafe_App;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TechnoKitchen {
    private ArrayList<Double> priceList;
    private ArrayList<String> names = new ArrayList<>();

    private int customerOrder;
    Scanner in = new Scanner(System.in);
    Date date = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm a");

    public TechnoKitchen() {
        priceList = new ArrayList<>();
        customerOrder = 0;
    }

    public ArrayList<Double> getPriceList() {
        return priceList;
    }


    public void takeOrder(int customerOrder) {
        this.customerOrder = customerOrder;
        TechnoKitchen technoKitchen = new TechnoKitchen();
        Borscht borscht = new Borscht();
        Dosa dosa = new Dosa();
        Donuts donuts = new Donuts();
        Kebap kebap = new Kebap();
        Lasagna lasagna = new Lasagna();
        try {


            switch (customerOrder) {
                case 1:
                    technoKitchen.subMenu(1);
                    System.out.println("How many borscht you want to order?");
                    double orderBorcht = in.nextDouble();
                    if (orderBorcht > 0) {
                        names.add("Borscht");
                        getPriceList().add(borscht.price() * orderBorcht);
                    } else if (orderBorcht == 0) {
                        yesNoMenu();
                    } else {
                        System.out.println("Wrong Command!");
                    }
                    break;
                case 2:
                    technoKitchen.subMenu(2);
                    System.out.println("How many dosa you want to order?");
                    double orderDosa = in.nextDouble();
                    if (orderDosa > 0) {
                        names.add("Dosa");
                        getPriceList().add(dosa.price() * orderDosa);
                    } else if (orderDosa == 0) {
                        yesNoMenu();
                    } else {
                        System.out.println("Wrong Command!");
                    }
                    break;
                case 3:
                    technoKitchen.subMenu(3);
                    System.out.println("How many donuts you want to order?");
                    double orderDonuts = in.nextDouble();
                    if (orderDonuts > 0) {
                        names.add("Donuts");
                        getPriceList().add(donuts.price() * orderDonuts);
                    } else if (orderDonuts == 0) {
                        yesNoMenu();
                    } else {
                        System.out.println("Wrong Command!");
                    }
                    break;
                case 4:
                    technoKitchen.subMenu(4);
                    System.out.println("How many kebap you want to order?");
                    double orderKebap = in.nextDouble();
                    if (orderKebap > 0) {
                        names.add("Kebap");
                        getPriceList().add(kebap.price() * orderKebap);
                    } else if (orderKebap == 0) {
                        yesNoMenu();
                    } else {
                        System.out.println("Wrong Command!");
                    }
                    break;
                case 5:
                    technoKitchen.subMenu(5);
                    System.out.println("How many Lasagna you want to order?");
                    double orderLasagna = in.nextDouble();
                    if (orderLasagna > 0) {
                        names.add("Lasagna");
                        getPriceList().add(lasagna.price() * orderLasagna);
                    } else if (orderLasagna == 0) {
                        yesNoMenu();
                    } else {
                        System.out.println("Wrong Command!");
                    }
                    break;
                default:
                    break;
            }
        } catch (InputMismatchException e) {
            yesNoMenu();
        }
    }


    public double orderTotal(ArrayList<Double> priceList) {
        int countFood = 1;
        double total = 0.0;
        System.out.println("-------------Receipt-------" + dateFormat.format(date));
        for (int i = 0; i < priceList.size(); i++) {
            total += priceList.get(i);
            System.out.println("Order No." + countFood + " [" + names.get(i) + "]" + " :$" + priceList.get(i));
            countFood++;
        }
        System.out.println("-----------------------------------------------");
        return total;
    }

    public void displayMainMenu() {
        System.out.println("Press[M] to Techno Cafe Menu.");
        System.out.println("Press[O] to Show Receipt.");
        System.out.println("Press[Q] to Do payment and Exit.");
    }

    public void displayMenu() {
        System.out.println("1) " + Cuisine.RUSSIA.getName() + " Foods");
        System.out.println("2) " + Cuisine.INDIA.getName() + " Foods");
        System.out.println("3) " + Cuisine.US.getName() + " Foods");
        System.out.println("4) " + Cuisine.TURKEY.getName() + " Foods");
        System.out.println("5) " + Cuisine.ITALY.getName() + " Foods");
    }

    public void subMenu(int customerOrder) {
        switch (customerOrder) {
            case 1:
                System.out.println("Wanna taste delicious " + Cuisine.RUSSIA.getName() + " " + Borscht.class.getSimpleName() + " ?");
                while (true) {
                    Borscht borscht = new Borscht();
                    System.out.println("Press[1] for " + Cuisine.RUSSIA.getName() + " " + Borscht.class.getSimpleName() + " show ingredients.");
                    System.out.println("Press[2] for " + Cuisine.RUSSIA.getName() + " " + Borscht.class.getSimpleName() + " show couisine.");
                    System.out.println("Press[3] for " + Cuisine.RUSSIA.getName() + " " + Borscht.class.getSimpleName() + " learn taste.");
                    System.out.println("Press[4] for " + Cuisine.RUSSIA.getName() + " " + Borscht.class.getSimpleName() + " take order.");
                    String sc1 = in.next();
                    if (sc1.equals("1")) {
                        System.out.println(borscht.ingredients());
                    } else if (sc1.equals("2")) {
                        borscht.cuisine();
                    } else if (sc1.equals("3")) {
                        borscht.taste();
                    } else if (sc1.equals("4")) {
                        System.out.println("Price: " + borscht.price() + " USD.");
                    } else {
                        System.out.println("Wrong Command");
                        subMenu(1);
                    }
                    break;
                }
                break;
            case 2:
                System.out.println("Wanna taste delicious " + Cuisine.INDIA.getName() + " " + Dosa.class.getSimpleName() + " ?");
                while (true) {
                    Dosa dosa = new Dosa();
                    System.out.println("Press[1] for " + Cuisine.INDIA.getName() + " " + Dosa.class.getSimpleName() + " show ingredients.");
                    System.out.println("Press[2] for " + Cuisine.INDIA.getName() + " " + Dosa.class.getSimpleName() + " show couisine.");
                    System.out.println("Press[3] for " + Cuisine.INDIA.getName() + " " + Dosa.class.getSimpleName() + " learn taste.");
                    System.out.println("Press[4] for " + Cuisine.INDIA.getName() + " " + Dosa.class.getSimpleName() + " take order.");
                    String sc1 = in.next();
                    if (sc1.equals("1")) {
                        System.out.println(dosa.ingredients());
                    } else if (sc1.equals("2")) {
                        dosa.cuisine();
                    } else if (sc1.equals("3")) {
                        dosa.taste();
                        System.out.println("----------------------------------------------------------------------------");
                        dosa.tricks();
                    } else if (sc1.equals("4")) {
                        System.out.println("Price: " + dosa.price() + " USD.");
                    } else {
                        System.out.println("Wrong Command");
                        subMenu(2);
                    }
                    break;
                }
                break;
            case 3:
                System.out.println("Wanna taste delicious " + Cuisine.US.getName() + " " + Donuts.class.getSimpleName() + " ?");
                while (true) {
                    Donuts donuts = new Donuts();
                    System.out.println("Press[1] for " + Cuisine.US.getName() + " " + Donuts.class.getSimpleName() + " show ingredients.");
                    System.out.println("Press[2] for " + Cuisine.US.getName() + " " + Donuts.class.getSimpleName() + " show couisine.");
                    System.out.println("Press[3] for " + Cuisine.US.getName() + " " + Donuts.class.getSimpleName() + " learn taste.");
                    System.out.println("Press[4] for " + Cuisine.US.getName() + " " + Donuts.class.getSimpleName() + " take order.");
                    String sc1 = in.next();
                    if (sc1.equals("1")) {
                        System.out.println(donuts.ingredients());
                    } else if (sc1.equals("2")) {
                        donuts.cuisine();
                    } else if (sc1.equals("3")) {
                        donuts.taste();
                        System.out.println("----------------------------------------------------------------------------");
                        donuts.warning();
                    } else if (sc1.equals("4")) {
                        System.out.println("Price: " + donuts.price() + " USD.");
                    } else {
                        System.out.println("Wrong Command");
                        subMenu(3);
                    }
                    break;
                }
                break;
            case 4:
                System.out.println("Wanna taste delicious " + Cuisine.TURKEY.getName() + " " + Kebap.class.getSimpleName() + " ?");
                while (true) {
                    Kebap kebap = new Kebap();
                    System.out.println("Press[1] for " + Cuisine.TURKEY.getName() + " " + Kebap.class.getSimpleName() + " show ingredients.");
                    System.out.println("Press[2] for " + Cuisine.TURKEY.getName() + " " + Kebap.class.getSimpleName() + " show couisine.");
                    System.out.println("Press[3] for " + Cuisine.TURKEY.getName() + " " + Kebap.class.getSimpleName() + " learn taste.");
                    System.out.println("Press[4] for " + Cuisine.TURKEY.getName() + " " + Kebap.class.getSimpleName() + " take order.");
                    String sc1 = in.next();
                    if (sc1.equals("1")) {
                        System.out.println(kebap.ingredients());
                    } else if (sc1.equals("2")) {
                        kebap.cuisine();
                    } else if (sc1.equals("3")) {
                        kebap.taste();
                        System.out.println("----------------------------------------------------------------------------");
                        kebap.marinade();
                        kebap.grill();
                    } else if (sc1.equals("4")) {
                        System.out.println("Price: " + kebap.price() + " USD.");
                    } else {
                        System.out.println("Wrong Command");
                        subMenu(4);
                    }
                    break;
                }
                break;
            case 5:
                System.out.println("Wanna taste delicious " + Cuisine.ITALY.getName() + " " + Lasagna.class.getSimpleName() + " ?");
                while (true) {
                    Lasagna lasagna = new Lasagna();
                    System.out.println("Press[1] for " + Cuisine.ITALY.getName() + " " + Lasagna.class.getSimpleName() + " show ingredients.");
                    System.out.println("Press[2] for " + Cuisine.ITALY.getName() + " " + Lasagna.class.getSimpleName() + " show couisine.");
                    System.out.println("Press[3] for " + Cuisine.ITALY.getName() + " " + Lasagna.class.getSimpleName() + " learn taste.");
                    System.out.println("Press[4] for " + Cuisine.ITALY.getName() + " " + Lasagna.class.getSimpleName() + " take order.");
                    String sc1 = in.next();
                    if (sc1.equals("1")) {
                        System.out.println(lasagna.ingredients());
                    } else if (sc1.equals("2")) {
                        lasagna.cuisine();
                    } else if (sc1.equals("3")) {
                        lasagna.taste();
                        System.out.println("----------------------------------------------------------------------------");
                        lasagna.sauce();
                    } else if (sc1.equals("4")) {
                        System.out.println("Price: " + lasagna.price() + " USD.");
                    } else {
                        System.out.println("Wrong Command!");
                        subMenu(5);
                    }
                    break;
                }
                break;
            default:
                System.out.println("x");
        }
    }

    public void yesNoMenu() {
        while (true) {
            System.out.println("Press [Y] to select another food or [N] to go back to the main menu:");
            String choice = in.next();
            if (choice.equalsIgnoreCase("n")) {
                break;
            } else if (choice.equalsIgnoreCase("y")) {
                displayMenu();
                int choice2 = in.nextInt();
                takeOrder(choice2);
                break;
            } else {
                System.out.println("Wrong command!");
            }
        }
    }
}


