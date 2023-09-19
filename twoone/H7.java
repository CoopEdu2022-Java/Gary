package twoone;
import java.util.ArrayList;
import java.util.List;

class Account {
    private String accountNumber;
    private String customerName;
    private double balance;

    public Account(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully to account " + accountNumber);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    public void withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully from account " + accountNumber);
        } else {
            System.out.println("Insufficient balance or invalid amount. Withdrawal failed.");
        }
    }
}

class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account " + account.getAccountNumber() + " added successfully to the bank.");
    }

    public void removeAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                accounts.remove(account);
                System.out.println("Account " + accountNumber + " removed successfully from the bank.");
                return;
            }
        }
        System.out.println("Account " + accountNumber + " not found in the bank.");
    }

    public void depositToAccount(String accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Account " + accountNumber + " not found in the bank. Deposit failed.");
    }

    public void withdrawFromAccount(String accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Account " + accountNumber + " not found in the bank. Withdrawal failed.");
    }
}

public class H7 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("123456", "John Doe", 1000);
        Account account2 = new Account("789012", "Jane Smith", 2000);

        bank.addAccount(account1);
        bank.addAccount(account2);

        bank.depositToAccount("123456", 500);
        bank.withdrawFromAccount("789012", 1000);
        bank.withdrawFromAccount("123456", 2000);

        bank.removeAccount("789012");
    }
}
