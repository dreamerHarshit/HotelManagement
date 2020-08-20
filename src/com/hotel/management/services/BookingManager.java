package com.hotel.management.services;

import com.hotel.management.models.Booking;
import com.hotel.management.models.Hotel;
import com.hotel.management.models.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class BookingManager {
    ArrayList<Booking> bookings;
    HashMap<Long, ArrayList<Booking>> userBooking;

    public BookingManager() {
        this.userBooking = new HashMap<>();
        this.bookings = new ArrayList<>();
    }

    public void bookHotel(Hotel hotel, User user, long rooms){
        long availableRooms = hotel.getAvailableRooms();
        if(availableRooms<rooms){
            System.out.println("Rooms not available");
            return;
        }
        hotel.setAvailableRooms(availableRooms-rooms);
        double total_amount = rooms*hotel.getPricePerRoom();
        double amount = user.getAmountPaid();
        amount+=total_amount;
        user.setAmountPaid(amount);
        Booking booking = new Booking(user, hotel, total_amount);
        this.bookings.add(booking);
        setUserBooking(user, booking);
        System.out.println("Rooms booked!!");
    }

    public HashMap<Long, ArrayList<Booking>> getUserBooking() {
        return userBooking;
    }

    public void setUserBooking(User user, Booking booking) {
        if(this.userBooking.containsKey(user.getId())){
            this.userBooking.get(user.getId()).add(booking);
        }
        else{
            ArrayList<Booking> bookings = new ArrayList<>();
            bookings.add(booking);
            this.userBooking.put(user.getId(), bookings);
        }
    }

    public void printBookingData(){
        System.out.println("UserName       "+"Hotel Name      "+ "Booking Cost");
        for(Booking b: this.bookings){
            System.out.println(b.getUser().getName()+"      "+b.getHotel().getName()+"     "+b.getTotalAmount());
        }
    }
}
