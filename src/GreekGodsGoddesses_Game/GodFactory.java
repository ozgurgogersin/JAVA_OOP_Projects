package GreekGodsGoddesses_Game;

import java.util.Scanner;

public class GodFactory extends Gods {

    Scanner in = new Scanner(System.in);

    public GodFactory() {
    }


    public void produceGodGoddess(String name) {

        while (true) {


            if (name.equalsIgnoreCase("zeus")) {
                Zeus zeus = new Zeus();
                zeus.setName("God Zeus");
                zeus.setGender("Male");
                zeus.setAggression(3000);
                zeus.setBeauty(1000);
                zeus.setWisdom(500);
                zeus.setControlOverWeather(20000);
                System.out.println("What do you want more with your choosen God?");
                System.out.println("Press [1] to Print Zeus Stats.");
                System.out.println("Press [2] to Attack with Zeus!");
                System.out.println("Press [3] to Expose Zeus secret power!");
                System.out.println("Press [4] to Play with new God or for Quitting.");

                String select = in.next();
                if (select.equalsIgnoreCase("1")) {
                    zeus.printInfo();
                } else if (select.equalsIgnoreCase("2")) {
                    zeus.attack();
                    zeus.getControlOverWeather();
                } else if (select.equalsIgnoreCase("3")) {
                    zeus.exposeSecretPower();
                } else if (select.equalsIgnoreCase("4")) {
                    break;
                } else {
                    System.out.println("Wrong Command!");
                    break;
                }

            } else if (name.equalsIgnoreCase("apollo")) {
                Apollo apollo = new Apollo();
                apollo.setName("God Apollo");
                apollo.setGender("Male");
                apollo.setAggression(250);
                apollo.setBeauty(1000);
                apollo.setWisdom(2000);
                apollo.setSunPower(20000);
                System.out.println("What do you want more with your choosen God?");
                System.out.println("Press [1] to Print Apollo Stats.");
                System.out.println("Press [2] to Attack with Apollo!");
                System.out.println("Press [3] to Expose Apollo secret power!");
                System.out.println("Press [4] to Play with new God or for Quitting.");

                String select = in.next();
                if (select.equalsIgnoreCase("1")) {
                    apollo.printInfo();
                } else if (select.equalsIgnoreCase("2")) {
                    apollo.attack();
                    apollo.getSunPower();
                } else if (select.equalsIgnoreCase("3")) {
                    apollo.exposeSecretPower();
                } else if (select.equalsIgnoreCase("4")) {
                    break;
                } else {
                    System.out.println("Wrong Command!");
                    break;
                }

            } else if (name.equalsIgnoreCase("hera")) {
                Hera hera = new Hera();
                hera.setName("Goddess Hera");
                hera.setGender("Female");
                hera.setAggression(400);
                hera.setBeauty(2000);
                hera.setWisdom(250);
                hera.setObstinacy(100000);

                System.out.println("What do you want more with your choosen God?");
                System.out.println("Press [1] to Print Hera Stats.");
                System.out.println("Press [2] to Attack with Hera!");
                System.out.println("Press [3] to Expose Hera secret power!");
                System.out.println("Press [4] to Play with new God or for Quitting.");

                String select = in.next();
                if (select.equalsIgnoreCase("1")) {
                    hera.printInfo();
                } else if (select.equalsIgnoreCase("2")) {
                    hera.attack();
                    hera.getObstinacy();
                } else if (select.equalsIgnoreCase("3")) {
                    hera.exposeSecretPower();
                } else if (select.equalsIgnoreCase("4")) {
                    break;
                } else {
                    System.out.println("Wrong Command!");
                    break;
                }

            } else if (name.equalsIgnoreCase("athena")) {
                Athena athena = new Athena();
                athena.setName("Goddess Athena");
                athena.setGender("Female");
                athena.setAggression(400);
                athena.setBeauty(2000);
                athena.setWisdom(1000);
                athena.setStrategy(30000);

                System.out.println("What do you want more with your choosen God?");
                System.out.println("Press [1] to Print Athena Stats.");
                System.out.println("Press [2] to Attack with Athena!");
                System.out.println("Press [3] to Expose Athena secret power!");
                System.out.println("Press [4] to Play with new God or for Quitting.");

                String select = in.next();
                if (select.equalsIgnoreCase("1")) {
                    athena.printInfo();
                } else if (select.equalsIgnoreCase("2")) {
                    athena.attack();
                    athena.getStrategy();
                } else if (select.equalsIgnoreCase("3")) {
                    athena.exposeSecretPower();
                } else if (select.equalsIgnoreCase("4")) {
                    break;
                } else {
                    System.out.println("Wrong Command!");
                    break;
                }

            } else {
                System.out.println("Wrong Command!");
                break;
            }
        }
    }

}
