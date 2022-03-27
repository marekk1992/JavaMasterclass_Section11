package learning.accessModifiers;

public class Main {

    public static void main(String[] args) {
        Account myAccount = new Account("Mark");
        myAccount.deposit(1000);
        myAccount.withdrawal(500);
        myAccount.withdrawal(-200);
        myAccount.deposit(-20);
        myAccount.calculateBalance();

        myAccount.balance = 5000;

        System.out.println("Balance on account is " + myAccount.balance);

        myAccount.transactions.add(4500);
        myAccount.calculateBalance();

    }
}
