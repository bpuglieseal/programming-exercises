package Excercise9;

public class Transaction {
    private TransactionType type;
    private double amount;

    Transaction(TransactionType type, double amount) {
        this.amount = amount;
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public static String getTransactionTypeVerbose(TransactionType tt) {
        switch (tt) {
            case DEPOSIT -> {
                return "Deposit";
            }
            case WITHDRAW -> {
                return "Withdraw";
            }
            default -> {
                return "Unknown";
            }
        }
    }
}
