package com.Madpoints;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(Branch branch) {
        branches.add(branch);
        return true;
    }

    private String getName() {
        return name;
    }

    public void showName() {
        System.out.println(this.getName());
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }
}
