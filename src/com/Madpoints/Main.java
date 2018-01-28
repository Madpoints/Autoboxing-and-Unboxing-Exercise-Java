package com.Madpoints;

public class Main {
    private static Bank bank = new Bank("Savings and Loan");

    public static void main(String[] args) {
        bank.addBranch(new Branch("Bedford Falls, US"));
        Branch bedford = bank.getBranches().get(0);
        bedford.addCustomer(new Customer("Fred"));
        Customer fred = bedford.getCustomers().get(0);

        System.out.println(bank.getName());
        System.out.println(bedford.getName());
        System.out.println(fred.getName());
        fred.transaction(-200);

    }
}
