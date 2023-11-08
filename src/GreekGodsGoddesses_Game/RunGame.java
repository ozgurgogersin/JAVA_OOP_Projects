package GreekGodsGoddesses_Game;

import java.util.Scanner;

public class RunGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GodFactory godFactory = new GodFactory();
        System.out.println("Welcome to Greek Gods and Goddess Show...");
        System.out.println("Press q to Exit...");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("Note : Unfortunately in this version of the game only allow to choose only Zeus, Apollo, Athena or Hera!");
        System.out.println("Which God or Goddess you want to produce? Please select god/goddess name...");

        String choice = in.next().toLowerCase();

        if (!choice.equals("q")) {
            godFactory.produceGodGoddess(choice);
        } else {
            System.exit(0);
        }

        while (true) {
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Do you want to continue game? Press 'Y' for Continue or 'N' for quit!");
            String c = in.next();
            if (c.equalsIgnoreCase("Y")) {
                System.out.println("Insert a God Name (Zeus, Athena, Hera, Apollo) : ");
                String god = in.next();
                godFactory.produceGodGoddess(god);
            } else if (c.equalsIgnoreCase("N")) {
                System.out.println("Thanks For Playing !");
                break;
            } else {
                System.out.println("Wrong Command!");

            }
        }
    }
}


