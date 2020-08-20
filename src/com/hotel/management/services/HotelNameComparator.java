package com.hotel.management.services;

import com.hotel.management.models.Hotel;

import java.util.Comparator;

public class HotelNameComparator implements Comparator<Hotel>{
    public int compare(Hotel h1, Hotel h2){
        return h1.getName().compareTo(h2.getName());
    }
}
