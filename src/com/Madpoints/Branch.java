package com.Madpoints;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public boolean addCustomer(Customer customer) {
        customers.add(customer);
        return true;
    }

    private String getName() {
        return name;
    }

    public void showName() {
        System.out.println(this.getName());
    }

    public void showCustomers() {
        for (int i = 0; i < this.getCustomers().size(); i++) {
            this.getCustomers().get(i).showName();
            this.getCustomers().get(i).showTransactions();
        }
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
