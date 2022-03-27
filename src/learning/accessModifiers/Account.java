package learning.accessModifiers;

import java.util.ArrayList;

public class Account {

    public String accountName;
    public int balance = 0;
    public ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        transactions = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            transactions.add(amount);
            balance += amount;
            System.out.println(amount + " deposited. Balance is now " + balance);
        } else {
            System.out.println("Can`t deposit negative sums.");
        }
    }

    public void withdrawal(int amount) {
        int withdrawal = -amount;
        if (withdrawal < 0) {
            transactions.add(withdrawal);
            balance += withdrawal;
            System.out.println(amount + " withdrawn. Balance is now " + balance);
        } else {
            System.out.println("Can`t withdrawn negative sums.");
        }
    }

    public void calculateBalance() {
        balance = 0;
        for (int i : transactions) {
            balance += i;
        }
        System.out.println("Calculated balance is " + balance);
    }
}
