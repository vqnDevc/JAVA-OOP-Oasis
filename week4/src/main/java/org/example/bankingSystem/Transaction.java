package org.example.bankingSystem;

public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 0;
    public static final int TYPE_WITHDRAW_CHECKING = 1;
    public static final int TYPE_DEPOSIT_SAVINGS = 2;
    public static final int TYPE_WITHDRAW_SAVINGS = 3;
    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalace;

    /**
     * setter transaction.
     */
    public Transaction(int type, double amount, double initialBalance, double finalBalace) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalace = finalBalace;
    }

    /**
     * get transaction type string.
     */
    public String getTransactionTypeString(int num) {
        if (num == TYPE_DEPOSIT_CHECKING) {
            return "Nạp tiền vãng lai";
        }
        if (num == TYPE_WITHDRAW_CHECKING) {
            return "Rút tiền vãng lai";
        }
        if (num == TYPE_DEPOSIT_SAVINGS) {
            return "Nạp tiền tiết kiệm";
        }
        return "Rút tiền tiết kiệm";
    }

    /**
     * get transaction summary.
     */
    public String getTransactionSummary() {
        return "- Kiểu giao dịch: " + getTransactionTypeString(type)
                + ". Số dư ban đầu: $" + String.format("%.2f", initialBalance)
                + ". Số tiền: $" + String.format("%.2f", amount)
                + ". Số dư cuối: $" + String.format("%.2f", finalBalace) + ".";
    }
}
