package account;

import java.util.Scanner;

public class AccountConsoleUI {
    public void start() {
        Account account = new Account();

        Scanner in = new Scanner(System.in);


        while (true) {
            System.out.print("I=Income, E=Expense, D=Exit: ");
            String command = in.next();
            if (command.equalsIgnoreCase("I")) {
                System.out.print("Income Amount: ");
                double amount = in.nextDouble();
                account.addIncome(amount);
                System.out.print("Balance: ");
                System.out.println( account.getBalance());
                System.out.print("Expense: ");
                System.out.println( account.getExpense());
                System.out.print("Income: ");
                System.out.println( account.getIncome());

            }
            else if (command.equalsIgnoreCase("E")) {
                System.out.print("Expense Amount: ");
                double amount = in.nextDouble();
                account.addExpense(amount);
                System.out.print("Balance: ");
                System.out.println( account.getBalance());
                System.out.print("Expense: ");
                System.out.println( account.getExpense());
                System.out.print("Income: ");
                System.out.println( account.getIncome());
            }
            else if (command.equalsIgnoreCase("D")) {
                System.exit(0);
            }
            else{
                System.out.println("Invalid input!");
            }

        }
    }
}
