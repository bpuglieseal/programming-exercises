package Excercise9;

public class Main {
    public static void main(String[] args) {
        final Person baldassare = new Person("Baldassare Pugliese", "male", 22);
        BankAccount bankAccount = new BankAccount(baldassare);

        bankAccount.deposit(100.1);
        bankAccount.deposit(5064.54);
        bankAccount.withdraw(1268.5);
        bankAccount.withdraw(10000.8742);

        System.out.println("---------- Bank Account Holder ----------");
        bankAccount.show();
        System.out.println("---------- Bank Account Holder Transactions ----------");
        bankAccount.printTransactions();
    }
}
