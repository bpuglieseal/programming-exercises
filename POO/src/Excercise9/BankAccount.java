package Excercise9;

public class BankAccount {
    private double balance;
    private String holder;

    BankAccount(String holder) {
        this.holder = holder;
        this.balance = 0f;
    }

    BankAccount(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public void deposit (double amount) {
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public double withdraw (double amount) throws BankAccountWithdrawException {
        if ((this.balance - amount) < 0) {
            throw new BankAccountWithdrawException("You don't have enough money");
        }

        this.balance -= amount;
        return amount;
    }

    public void show () {
        System.out.format("Bank Account Holder: %s\n", this.holder);
        System.out.format("Bank Account Balance: %f\n", this.balance);
    }
}
