import java.util.Scanner;

import javax.lang.model.util.ElementKindVisitor7;

public class SimpleAtm{

    public static void main(String[] args) {
        int pin = 1234;
        int balance = 1000;

        int addAmount = 0;
        int takeAmount = 0;
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Pin");
        int password = input.nextInt();
        if (password == pin) {
            System.out.println("Enter your name");
            name = input.next();
            System.out.println("Welcome " + name);
            while (true) {
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to Add Amount");
                System.out.println("Press 3 to Take Amount");
                System.out.println("Press 4 to Take Receipt");
                System.out.println("Press 5 to EXIT");
                int opt = input.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("Your current Balance is :" + balance);
                        break;
                    case 2:
                        System.out.println("How much Amount you want to add");
                        addAmount = input.nextInt();
                        System.out.println("Succesfully Credited");
                        balance = addAmount + balance;
                        break;
                    case 3:
                        System.out.println("How much Amount you want to take");
                        takeAmount = input.nextInt();
                        if (balance > takeAmount) {
                            System.out.println("Amount Successfully taken");
                            balance = balance - takeAmount;
                        } else {
                            System.out.println("Insufficient Balance");
                            System.out.println("Try less than your Current Balance");
                        }
                        break;
                    case 4:
                        System.out.println("THANK YOU");
                        System.out.println("Your current balance is :" + balance);
                        System.out.println("Added Amount is :" + addAmount);
                        System.out.println("Taken Amount is :" + takeAmount);
                        System.out.println("THANKS FOR COMING");
                        break;
                    case 5:
                        System.out.println("THANK YOU");
                        break;
                }
            }
        }
        else{
            System.out.println("Wrong Pin, Try Again");
        }
    }
}
