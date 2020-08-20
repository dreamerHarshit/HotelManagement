package com.hotel.management.models;

public class User {
    private static long U_ID = 0;
    private long id;
    private String name;
    private double amountPaid;
    public User(String name) {
        this.id = U_ID;
        U_ID++;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }
}
