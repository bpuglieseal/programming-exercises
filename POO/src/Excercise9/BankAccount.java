package Excercise9;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankAccount {
    private double balance;
    private final Person holder;
    private boolean negativeBalance;
    private List<Transaction> transactions;

    BankAccount(Person holder) {
        this.holder = holder;
        this.balance = 0f;
        this.negativeBalance = false;
        this.transactions = new ArrayList<Transaction>();
    }

    BankAccount(Person holder, double balance) {
        this.holder = holder;
        this.balance = balance;
        this.negativeBalance = balance < 0;
        this.transactions = new ArrayList<Transaction>();
    }

    public void deposit(double amount) {
        final Transaction t = new Transaction(TransactionType.DEPOSIT, amount);
        this.addTransaction(t);

        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public Person getHolder() {
        return holder;
    }

    public double withdraw(double amount) {
        final Transaction t = new Transaction(TransactionType.WITHDRAW, amount);
        this.addTransaction(t);

        if ((this.balance - amount) < 0 && this.balance < 0) {
            this.negativeBalance = true;
        }

        this.balance -= amount;
        return amount;
    }

    public void show() {
        DecimalFormatSymbols symbol = new DecimalFormatSymbols();
        symbol.setDecimalSeparator('.');
        DecimalFormat formatter = new DecimalFormat("##.##", symbol);

        System.out.format("Bank Account Holder: %s\n", this.holder.getName());
        System.out.format("Bank Account Balance: %s\n", formatter.format(this.balance));
    }

    public void addTransaction(Transaction t) {
        this.transactions.add(t);
    }

    public void printTransactions() {
        DecimalFormatSymbols symbol = new DecimalFormatSymbols();
        symbol.setDecimalSeparator('.');
        DecimalFormat formatter = new DecimalFormat("##.##", symbol);

        this.transactions.forEach(t -> {
            System.out.format("%s: %s\n", Transaction.getTransactionTypeVerbose(t.getType()), formatter.format(t.getAmount()));
        });
    }
}
