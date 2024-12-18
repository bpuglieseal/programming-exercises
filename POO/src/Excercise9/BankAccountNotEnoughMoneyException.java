package Excercise9;

public class BankAccountNotEnoughMoneyException extends Exception {
    BankAccountNotEnoughMoneyException(String message) {
        super(message);
    }
}
