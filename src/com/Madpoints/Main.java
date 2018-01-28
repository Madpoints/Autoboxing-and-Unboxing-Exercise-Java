package com.Madpoints;

public class Main {
    private static Bank bank = new Bank("Savings and Loan");

    public static void main(String[] args) {
        bank.addBranch(new Branch("Bedford Falls, US"));
        Branch bedford = bank.getBranches().get(0);
        bedford.addCustomer(new Customer("Fred"));
        bedford.addCustomer(new Customer("Sally"));
        Customer fred = bedford.getCustomers().get(0);

        bank.showName();
        bedford.showName();
        fred.transaction(-200);
        bedford.showCustomers();

    }
}
