package com.hotel.management.models;

public class Hotel {
    private static int U_ID = 0;
    private long id;
    private String name;
    private String location;
    private int rating;
    private double pricePerRoom;
    private long availableRooms;

    public Hotel(String name, String location) {
        this.id = U_ID++;
        this.name = name;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getPricePerRoom() {
        return pricePerRoom;
    }

    public void setPricePerRoom(double pricePerRoom) {
        this.pricePerRoom = pricePerRoom;
    }

    public long getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(long availableRooms) {
        this.availableRooms = availableRooms;
    }
}
