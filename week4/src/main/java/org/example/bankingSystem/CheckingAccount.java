package org.example.bankingSystem;

public class CheckingAccount extends Account {

    /**
     * call acc, balance.
     */
    public CheckingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        try {
            doWithdrawing(amount);
        } catch (InsufficientFundsException | InvalidFundingAmountException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deposit(double amount) {
        try {
            doDepositing(amount);
        } catch (InvalidFundingAmountException | InsufficientFundsException e) {
            e.printStackTrace();
        }
    }
}

