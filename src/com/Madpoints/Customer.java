package com.Madpoints;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
        transactions.add(500.00);
    }

    public String getName() {
        return name;
    }

    public void transaction(double creditDebit) {
        transactions.add(creditDebit);
    }

    public void showTransactions() {
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println(transactions.get(i));
        }
    }
}
