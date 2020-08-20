package com.hotel.management.models;

public class Booking {
    private static int U_ID = 0;
    private int id;
    private User user;
    private Hotel hotel;
    private double total_amount;

    public Booking(User user, Hotel hotel, double total_amount) {
        this.id = U_ID++;
        this.user = user;
        this.hotel = hotel;
        this.total_amount = total_amount;
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public double getTotalAmount() {
        return total_amount;
    }

    public void setTotalAmount(double total_amount) {
        this.total_amount = total_amount;
    }
}
