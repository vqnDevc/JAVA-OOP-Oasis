//package org.example.week5;

import java.util.ArrayList;
import java.util.Objects;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList;

    /**
     * Constructor.
     */
    public Account() {
        this.balance = 0;
        this.transitionList = new ArrayList<Transaction>();
    }

    /**
     * Deposit money.
     * @param amount : double
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            balance += amount;
        }
    }

    /**
     * Withdraw money.
     * @param amount : double
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance -= amount;
        }
    }

    /**
     * Add transaction into transaction list.
     * @param amount : double
     * @param operation : String
     */
    public void addTransaction(double amount, String operation) {
        if (Objects.equals(operation, Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (Objects.equals(operation, Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }

        Transaction newTransaction = new Transaction(operation, amount, balance);
        transitionList.add(newTransaction);
    }

    /**
     * Print Transaction.
     */
    public void printTransaction() {
        for (Transaction i : transitionList) {
            double roundBalance = (double) Math.round(i.getBalance() * 100) / 100;
            double roundAmount = (double) Math.round(i.getAmount() * 100) / 100;

            String operation =
                    Objects.equals(i.getOperation(), "deposit") ? "Nap tien" : "Rut tien";
            System.out.printf("Giao dich %d: %s $%.2f. So du luc nay: $%.2f.\n",
                    transitionList.indexOf(i) + 1, operation, roundAmount, roundBalance);
        }
    }

}
