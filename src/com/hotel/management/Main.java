package com.hotel.management;

import com.hotel.management.models.Hotel;
import com.hotel.management.models.User;
import com.hotel.management.services.BookingManager;
import com.hotel.management.services.HotelManager;
import com.hotel.management.services.UserManager;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        HotelManager hotelManager = new HotelManager();
        BookingManager bookingManager = new BookingManager();
        UserManager userManager = new UserManager();
        hotelManager.addHotel("H1", "Bangalore",5,100, 4);
        hotelManager.addHotel("H2", "Bangalore",5,200,5);
        hotelManager.addHotel("H3", "Mumbai",3,100,6);
        ArrayList<Hotel> hotels = hotelManager.getNameOrdered();
        userManager.addUser("U1");
        userManager.addUser("U2");
        userManager.addUser("U3");
        ArrayList<User> users = userManager.getUsers();
        bookingManager.bookHotel(hotels.get(0), users.get(0), 1);
        bookingManager.bookHotel(hotels.get(1), users.get(1), 1);
        bookingManager.bookHotel(hotels.get(2), users.get(2), 1);
        System.out.println("Print Hotel Data:");
        hotelManager.getHotelsData();
        System.out.println("Sort By Name:");
        hotelManager.getNameOrderedHotels();
        System.out.println("Sort By Rating");
        hotelManager.getRatingOrderedHotels();
        System.out.println("Sort By Room Availability");
        hotelManager.getAvailabilityOrderedHotels();
        System.out.println("Hotels in Bangalore");
        hotelManager.getByLocation("Bangalore");

    }
}
