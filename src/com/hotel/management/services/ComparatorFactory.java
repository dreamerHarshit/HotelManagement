package com.hotel.management.services;
import com.hotel.management.models.Hotel;
import com.hotel.management.services.HotelRatingComparator;
import com.hotel.management.services.HotelNameComparator;
import com.hotel.management.services.RoomAvailabilityComparator;

import java.util.Comparator;

public class ComparatorFactory {


    public static Comparator<Hotel> sortBy(String condition){
        if(condition.equals("rating"))
            return new HotelRatingComparator();
        if(condition.equals("name"))
            return new HotelNameComparator();
        if(condition.equals("availability"))
            return new RoomAvailabilityComparator();
        return null;
    }
}
