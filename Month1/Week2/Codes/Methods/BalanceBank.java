import java.util.Scanner;

class BalanceBank {
    static Scanner sc = new Scanner(System.in);
    static double balance = 500000;   // current balance

    public static void main(String[] args) {
        System.out.println("Welcome to Bank!!!");

        boolean run = true;
        while (run) {
            user();
            System.out.print("\nContinue? 1 = Yes, 2 = No : ");
            run = sc.nextInt() == 1;
        }

        System.out.println("Thank you!! Visit Again.");
    }

    public static void user() {
        System.out.println("\nChoose an option:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Display Balance");
        System.out.println("4. Exit");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                withdraw();
                break;

            case 2:
                deposit();
                break;

            case 3:
                displayBalance();
                break;

            case 4:
                exit();
                System.exit(0);

            default:
                System.out.println("Invalid option!");
        }
    }

    public static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid amount or insufficient balance!");
        }
    }

    public static void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    public static void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void exit() {
        System.out.println("You have exited the system.");
    }
}
