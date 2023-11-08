package BankATM_App;



import java.util.Scanner;

public class runATM extends Account {
Scanner in=new Scanner(System.in);
    public runATM() {
    }

    public void runApp(){
        while (true){
            System.out.println("PRESS [1] TO CHECK BALANCE");
            System.out.println("PRESS [2] TO ADD DEPOSIT");
            System.out.println("PRESS [3] TO WITHDRAW MONEY");
            System.out.println("PRESS [Q] TO QUIT");
            String choice=in.next();

            if (choice.equals("1")){
                System.out.println("Your current balance is : "+getBalance() +"USD.");
            } else if (choice.equals("2")) {
                System.out.println("Input an amount USD : ");
                depositMoney(in.nextDouble());
                System.out.println("You deposited some USD to your bank account, your current balance is : "+getBalance()+" USD.");
            } else if (choice.equals("3")) {
                System.out.println("Input an amount USD : ");
                withdrawMoney(in.nextDouble());
                System.out.println("You withdraw some USD from your bank account, your current balance is : "+getBalance()+" USD.");
            }else if (choice.equalsIgnoreCase("q")){
                System.out.println("You are logging out, have a nice day!");
                break;
            }else {
                System.out.println("Wrong command !");
            }
        }
    }
}
