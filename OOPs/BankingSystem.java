// Interface for Bank Services
interface BankService {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}

// Abstract Account Class (Common Features)
abstract class Account implements BankService {
    int accountNumber;
    double balance;

    // Inner class for Customer Details
    class Customer {
        String name;
        String email;

        Customer(String name, String email) {
            this.name = name;
            this.email = email;
        }

        void displayCustomer() {
            System.out.println("Customer Name: " + name);
            System.out.println("Email: " + email);
        }
    }

    Customer customer;

    Account(int accountNumber, double balance, String name, String email) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        customer = new Customer(name, email);
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        customer.displayCustomer();
    }
}

// Savings Account Class
class SavingsAccount extends Account {

    SavingsAccount(int accNo, double bal, String name, String email) {
        super(accNo, bal, name, email);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Current Account Class
class CurrentAccount extends Account {

    CurrentAccount(int accNo, double bal, String name, String email) {
        super(accNo, bal, name, email);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Main Class
public class BankingSystem {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount(101, 5000, "Akanksha", "akanksha@email.com");

        s.displayAccount();
        s.deposit(2000);
        s.withdraw(1500);
        s.checkBalance();

        System.out.println("\n");

        CurrentAccount c = new CurrentAccount(102, 8000, "Rahul", "rahul@email.com");

        c.displayAccount();
        c.deposit(3000);
        c.withdraw(4000);
        c.checkBalance();
    }
}
