package BankATM_App;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Login newlogin = new Login();
        newlogin.register();

        newlogin.getUsername();

        newlogin.getPassword();
        boolean control = newlogin.getlLogin();

        if (control) {
            runATM bankAtm = new runATM();
            bankAtm.runApp();
        } else {
            in.close();
        }
    }
}

