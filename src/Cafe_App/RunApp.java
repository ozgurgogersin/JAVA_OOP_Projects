package Cafe_App;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TechnoKitchen technoKitchen = new TechnoKitchen();
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm a");
        System.out.println("|----------------------------|");
        System.out.println("|-----" + dateFormat.format(date) + "----|");
        System.out.println("|----------------------------|");
        System.out.println("|   Welcome to Techno Cafe   |");
        System.out.println("|----------------------------|");
        while (true) {
            technoKitchen.displayMainMenu();
            String choice = in.next();
            if (choice.equalsIgnoreCase("m")) {
                System.out.println("|---------------------------------------------|");
                System.out.println("|    Select a Traditional Cuisine and Food    |");
                System.out.println("|---------------------------------------------|");
                System.out.println("1)Order some -> " + Cuisine.RUSSIA.getName() + " Food " + Borscht.class.getSimpleName());
                System.out.println("2)Order some -> " + Cuisine.INDIA.getName() + " Food " + Dosa.class.getSimpleName());
                System.out.println("3)Order some -> " + Cuisine.US.getName() + " Food " + Donuts.class.getSimpleName());
                System.out.println("4)Order some -> " + Cuisine.TURKEY.getName() + " Food " + Kebap.class.getSimpleName());
                System.out.println("5)Order some -> " + Cuisine.ITALY.getName() + " Food " + Lasagna.class.getSimpleName());
                String choice2 = in.next();
                if (choice2.equalsIgnoreCase("1")) {
                    technoKitchen.takeOrder(1);
                } else if (choice2.equalsIgnoreCase("2")) {
                    technoKitchen.takeOrder(2);

                } else if (choice2.equalsIgnoreCase("3")) {
                    technoKitchen.takeOrder(3);

                } else if (choice2.equalsIgnoreCase("4")) {
                    technoKitchen.takeOrder(4);

                } else if (choice2.equalsIgnoreCase("5")) {
                    technoKitchen.takeOrder(5);
                } else {
                    System.out.println("Wrong Command!");
                }
            } else if (choice.equalsIgnoreCase("o")) {
                double total = technoKitchen.orderTotal(technoKitchen.getPriceList());
                if (total == 0) {
                    System.out.println("You haven't ordered any food, if you wanna order, pres[M] for menu!");
                } else {
                    System.out.println("Total order amount: $" + total);
                    System.out.println("-----------------------------------------------");
                }
            } else if (choice.equalsIgnoreCase("q")) {
                while (true) {
                    double total = technoKitchen.orderTotal(technoKitchen.getPriceList());
                    if (total != 0) {
                        System.out.println("Total due amount : $" + total);
                        System.out.println("Press [1] Pay with Credit Card! ");
                        System.out.println("Press [2] Pay with Cash Money!  ");
                        System.out.println("-----------------------------------------------");
                        String choice3 = in.next();
                        if (choice3.equals("1")) {
                            System.out.println(total + "$ has been charged from your credit card," + " hope you enjoyed your meal! Come again, Have a good day:) ");
                            System.exit(0);
                        } else if (choice3.equals("2")) {
                            System.out.println("Your paid with cash money," + "hope you enjoyed your meal! Come again, Have a good day:)");
                            System.exit(0);
                        } else {
                            System.out.println("Wrong Payment Method, please choose proper payment method!");
                        }
                    } else {
                        System.out.println("Thanks for visiting our TechnoCafe, I hope you will taste our food on our next visit :)");
                        System.exit(0);
                    }
                }
            } else {
                System.out.println("Wrong Command!");
            }
        }
    }
}



