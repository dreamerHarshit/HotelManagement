package com.hotel.management.services;

import com.hotel.management.models.Hotel;

import java.util.Comparator;

public class HotelRatingComparator implements Comparator<Hotel> {
    public int compare(Hotel h1, Hotel h2){
        return h1.getRating() - h2.getRating();
    }
}
