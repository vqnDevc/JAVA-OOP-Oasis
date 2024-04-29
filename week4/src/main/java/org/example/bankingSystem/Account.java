package org.example.bankingSystem;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList = new ArrayList<>();

    /**
     * constructor.
     */
    public Account() {

    }

    /**
     * constructor.
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * do with drawing.
     */
    public void doWithdrawing(double amount)
            throws InsufficientFundsException, InvalidFundingAmountException {
        if (amount < 0) {
            throw new InsufficientFundsException(amount);
        }
        if (balance - amount < 0) {
            throw new InvalidFundingAmountException(amount);
        }
        if (this instanceof SavingsAccount) {
            if (balance - amount < 5000) {
                throw new InvalidFundingAmountException(amount);
            }
            if (amount > 1000) {
                throw new InsufficientFundsException(amount);
            }
        }

        if (this instanceof CheckingAccount) {
            Transaction transaction = new Transaction(1, amount, balance, balance - amount);
            transactionList.add(transaction);
        } else {
            Transaction transaction = new Transaction(3, amount, balance, balance - amount);
            transactionList.add(transaction);
        }
        balance = balance - amount;
    }

    /**
     * do depositing.
     */
    public void doDepositing(double amount)
            throws InvalidFundingAmountException, InsufficientFundsException {
        if (amount < 0) {
            throw new InsufficientFundsException(amount);
        }
        if (this instanceof CheckingAccount) {
            Transaction transaction = new Transaction(0, amount, balance, balance + amount);
            transactionList.add(transaction);
        } else {
            Transaction transaction = new Transaction(2, amount, balance, balance + amount);
            transactionList.add(transaction);
        }
        balance = balance + amount;
    }

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

    /**
     * get transaction history.
     */
    public String getTransactionHistory() {
        StringBuilder history = new StringBuilder("Lịch sử giao dịch của tài khoản "
                + accountNumber + ":" + '\n');
        for (Transaction transaction : transactionList) {
            history.append(transaction.getTransactionSummary()).append('\n');
        }
        return history.toString();
    }

    /**
     * add transaction.
     */
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    /**
     * check 2 accounts same.
     */
    public boolean equals(Object o) {
        if (!(o instanceof Account)) {
            return false;
        }
        return ((Account) o).accountNumber == this.accountNumber;
    }

}