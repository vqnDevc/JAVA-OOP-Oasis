package org.example.bankingSystem;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long idNumber;
    private String fullName;
    private List<Account> accountList = new ArrayList<>();

    /**
     * contructors.
     */
    public Customer() {

    }

    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    public String getCustomerInfo() {
        String str = "Số CMND: " + idNumber + ". " + "Họ tên: " + fullName + ".";
        return str;
    }

    /**
     * add account for customer.
     */
    public void addAccount(Account account) {
        accountList.add(account);
    }

    /**
     * remove account for customer.
     */
    public void removeAccount(Account account) {
        accountList.remove(account);
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Account> getAccountList() {
        return accountList;
    }
}