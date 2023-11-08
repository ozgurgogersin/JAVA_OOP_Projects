package BankATM_App;


import java.util.Scanner;

public class Login extends Account {
    Scanner in = new Scanner(System.in);

    public Login() {
    }

    public void register() {
        System.out.println("-------------------------------");
        System.out.println("Welcome to Bank ATM Application");
        System.out.println("-------------------------------");
        System.out.println("Please register your Username: ");
        setUsername(in.nextLine());
        System.out.println("Please register your Password: ");
        setPassword(in.nextLine());
        System.out.println("Your registration is successfull.Please insert your username and password for login.");
    }
    public boolean getlLogin() {
        boolean check = true;
        int attempts = 1;
        do {
            System.out.println("-------------------------------");
            System.out.println("Insert username: ");
            String un = in.nextLine();
            System.out.println("Insert password ");
            String pass = in.nextLine();
            if (un.equals(getUsername()) && pass.equals(getPassword())) {
                System.out.println("Login Succesfully!");
                check = true;
                break;
            } else {
                System.out.println("Wrong password " + (3 - attempts) + " attempts left!");
                attempts++;
            }
        } while (attempts <= 3);
        while (attempts == 4) {
            System.out.println("Please Call Bank Customer Service, Your account has been blocked due to multiple wrong attempts :( ");
            check = false;
            break;
        }
        return check;
    }
}

