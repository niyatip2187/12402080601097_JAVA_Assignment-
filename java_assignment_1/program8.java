// Custom Exception
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

// Bank class
class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    // Withdraw method with exception
    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance!");
        } else {
            balance = balance - amount;
            System.out.println("Withdraw successful: " + amount);
        }
    }

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        BankAccount obj = new BankAccount(1000);

        try {
            obj.withdraw(1500); // try withdrawing more
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        obj.showBalance();
    }
}
