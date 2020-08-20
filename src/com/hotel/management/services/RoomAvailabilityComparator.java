package com.hotel.management.services;

import com.hotel.management.models.Hotel;

import java.util.Comparator;

public class RoomAvailabilityComparator implements Comparator<Hotel> {
    public int compare(Hotel h1, Hotel h2){
        return (int) (h1.getAvailableRooms() - h2.getAvailableRooms());
    }
}
