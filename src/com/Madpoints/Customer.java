package com.Madpoints;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions.add(Double.valueOf(500.00));
    }
}
