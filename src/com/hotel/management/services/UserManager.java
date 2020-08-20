package com.hotel.management.services;

import com.hotel.management.models.Booking;
import com.hotel.management.models.User;

import java.util.ArrayList;
import java.util.HashMap;

public class UserManager {
    HashMap<Long, ArrayList<Booking>>  userBookings;
    ArrayList<User> users = new ArrayList<>();
    public void addUser(String name){
        User user = new User(name);
        this.users.add(user);
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
