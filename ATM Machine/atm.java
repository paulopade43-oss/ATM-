import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 10000;
        double amount;
        int choice;

        do {
            System.out.println("\n======ATM MACHINE======\n");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.print("Enter ur choice");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Your balance is: %.2f%n", balance);
                    break;

                case 2:
                    System.out.printf("Enter amount to deposit");
                    amount = input.nextInt();
                    if (amount > 0) {
                        balance = balance + amount;
                        System.out.printf(
                                "Deposit successful. New balance: %.2f%n",
                                balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }

                    break;

                case 3:
                    System.out.printf("Enter amount to deposit");
                    amount = input.nextInt();
                    if (amount <= 0) {
                        System.out.printf("Invalid number");
                    } else if (amount > balance) {
                        System.out.printf("insufficient balance");
                    } else {
                        balance = balance - amount;
                        System.out.printf("Withdraw successful");
                    }
                case 4:
                    System.out.println("Thank you for using our service");

                default: {
                    System.out.println("Invalid Number");
                }

            }
        } while (choice != 4);
    }
}
