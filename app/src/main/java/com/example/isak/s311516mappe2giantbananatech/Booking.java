package com.example.isak.s311516mappe2giantbananatech;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    private int _ID;
    private String restaurant;
    private ArrayList<Friend> friends;
    private String date;
    private String time;

    public Booking(String restaurant, ArrayList<Friend> friends, String date, String time) {
        this.restaurant = restaurant;
        this.friends = friends;
        this.date = date;
        this.time = time;
    }

    public Booking() {
    }

    public int get_ID() {
        return _ID;
    }

    public void set_ID(int _ID) {
        this._ID = _ID;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public ArrayList<Friend> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<Friend> friends) {
        this.friends = friends;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
