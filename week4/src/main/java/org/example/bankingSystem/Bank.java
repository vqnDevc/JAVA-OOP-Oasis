package org.example.bankingSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<Customer> customerList = new ArrayList<>();

    /**
     * read customerList.
     */
    public void readCustomerList(InputStream inputStream) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream,
                StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        StringBuilder file = new StringBuilder();
        int data = 0;
        while (data != -1) {
            try {
                data = bufferedReader.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            file.append((char) data);
        }

        file.deleteCharAt(file.length() - 1);
        String str = file.toString();
        String[] lines = str.split("\\r?\\n");
        Customer customer = null;

        for (String line : lines) {
            if (Character.isAlphabetic(line.charAt(0))) {
                customer = getCustomerFromFile(line);
                customerList.add(customer);
            } else {
                Account account = getAccountForCustomer(line);
                assert customer != null;
                customer.addAccount(account);
            }
        }
    }

    /**
     * get customer from file.
     */
    public Customer getCustomerFromFile(String line) {
        line = line.trim();
        String[] words = line.split("\\s+");
        String id = words[words.length - 1];
        String name = line.replace(id, "");
        name = name.trim();
        id = id.trim();
        long cmnd = Long.parseLong(id);
        return new Customer(cmnd, name);
    }

    /**
     * get accountforCustomer.
     */
    public Account getAccountForCustomer(String line) {
        line = line.trim();
        String[] words = line.split("\\s+");
        long accountNumber = Long.parseLong(words[0]);
        String accountType = words[1];
        double balance = Double.parseDouble(words[2]);
        if (accountType.equals(Account.CHECKING)) {
            return new CheckingAccount(accountNumber, balance);
        } else {
            return new SavingsAccount(accountNumber, balance);
        }
    }

    /**
     * get customers info by  name order.
     */
    public String getCustomersInfoByNameOrder() {
        for (int i = 0; i < customerList.size(); i++) {
            for (int j = i + 1; j < customerList.size(); j++) {
                String name1 = customerList.get(i).getFullName();
                String name2 = customerList.get(j).getFullName();
                if (name1.compareTo(name2) > 0) {
                    Customer temp = customerList.get(i);
                    customerList.set(i, customerList.get(j));
                    customerList.set(j, temp);
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < customerList.size(); i++) {
            ans.append(customerList.get(i).getCustomerInfo());
            if (i != customerList.size() - 1) {
                ans.append("\n");
            }
        }
        return String.valueOf(ans);
    }

    /**
     * get customers info by id order.
     */
    public String getCustomersInfoByIdOrder() {
        for (int i = 0; i < customerList.size(); i++) {
            for (int j = i + 1; j < customerList.size(); j++) {
                if (customerList.get(i).getIdNumber() > customerList.get(j).getIdNumber()) {
                    Customer temp = customerList.get(i);
                    customerList.set(i, customerList.get(j));
                    customerList.set(j, temp);
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < customerList.size(); i++) {
            ans.append(customerList.get(i).getCustomerInfo());
            if (i != customerList.size() - 1) {
                ans.append("\n");
            }
        }
        return String.valueOf(ans);
    }

    /**
     * get customer list.
     */
    public List<Customer> getCustomerList() {
        return customerList;
    }

}