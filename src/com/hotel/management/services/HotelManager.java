package com.hotel.management.services;

import com.hotel.management.models.Hotel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class HotelManager {
    private ArrayList<Hotel> ratingOrdered;
    private ArrayList<Hotel> nameOrdered;
    private ArrayList<Hotel> roomAvailabilityOrdered;
    private HashMap<String, ArrayList<Hotel>> locationHotelsMap;

    public HotelManager() {
        this.locationHotelsMap = new HashMap<>();
        this.nameOrdered = new ArrayList<>();
        this.ratingOrdered = new ArrayList<>();
        this.roomAvailabilityOrdered = new ArrayList<>();
    }

    public void addHotel(String name, String location, int rating, double price, int rooms){
        Hotel hotel = new Hotel(name, location);
        hotel.setRating(rating);
        hotel.setPricePerRoom(price);
        hotel.setAvailableRooms(rooms);
        setNameOrdered(hotel);
        setRatingOrdered(hotel);
        setRoomAvailabilityOrdered(hotel);
        setLocationHotelsMap(hotel, location);
    }

    public ArrayList<Hotel> getNameOrdered() {
        return nameOrdered;
    }

    public void setRatingOrdered(Hotel hotel) {
        this.ratingOrdered.add(hotel);
        Comparator<Hotel> comp = ComparatorFactory.sortBy("rating");
        Collections.sort(this.ratingOrdered, comp);
    }


    public void setNameOrdered(Hotel hotel) {
        this.nameOrdered.add(hotel);
        Comparator<Hotel> comp = ComparatorFactory.sortBy("name");
        Collections.sort(this.nameOrdered, comp);
    }


    public void setRoomAvailabilityOrdered(Hotel hotel) {
        this.roomAvailabilityOrdered.add(hotel);
        Comparator<Hotel> comp = ComparatorFactory.sortBy("availability");
        Collections.sort(this.roomAvailabilityOrdered, comp);
    }


    public void setLocationHotelsMap(Hotel hotel, String location) {
        if(this.locationHotelsMap.containsKey(location)){
            this.locationHotelsMap.get(location).add(hotel);
        }
        else{
            ArrayList<Hotel> hotels = new ArrayList<>();
            hotels.add(hotel);
            this.locationHotelsMap.put(location, hotels);
        }
    }

    public void getHotelsData(){
        printData(this.nameOrdered);
    }

    public void  getRatingOrderedHotels(){
        printData(this.ratingOrdered);
    }

    public void  getNameOrderedHotels(){
        printData(this.nameOrdered);
    }

    public void  getAvailabilityOrderedHotels(){
        printData(this.roomAvailabilityOrdered);
    }

    public void getByLocation(String location){
        printData(this.locationHotelsMap.get(location));
    }

    private void printData(ArrayList<Hotel> hotelsList){
        System.out.println("Hotel Name        Rooms Available        Location        Rating        Price Per Room");
        for(Hotel h: hotelsList){
            System.out.println(h.getName()+"             "+h.getAvailableRooms()+"             "+h.getLocation()+"             "+h.getRating()+"            "+h.getPricePerRoom());
        }
    }
}
