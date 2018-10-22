package com.example.ricardo.googlemaps.model;

public class Location {

    private int id;
    private String lat;
    private String lng;
    private String name;
    private String cost_per_minute;
    private int max_reserve_time_mins;
    private int min_reserve_time_mins;
    private boolean is_reserved;
    private String reserved_until;

    public Location(int id, String lat, String lng, String name, String cost_per_minute, int max_reserve_time_mins, int min_reserve_time_mins, boolean is_reserved, String reserved_until) {
        this.id = id;
        this.lat = lat;
        this.lng = lng;
        this.name = name;
        this.cost_per_minute = cost_per_minute;
        this.max_reserve_time_mins = max_reserve_time_mins;
        this.min_reserve_time_mins = min_reserve_time_mins;
        this.is_reserved = is_reserved;
        this.reserved_until = reserved_until;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost_per_minute() {
        return cost_per_minute;
    }

    public void setCost_per_minute(String cost_per_minute) {
        this.cost_per_minute = cost_per_minute;
    }

    public int getMax_reserve_time_mins() {
        return max_reserve_time_mins;
    }

    public void setMax_reserve_time_mins(int max_reserve_time_mins) {
        this.max_reserve_time_mins = max_reserve_time_mins;
    }

    public int getMin_reserve_time_mins() {
        return min_reserve_time_mins;
    }

    public void setMin_reserve_time_mins(int min_reserve_time_mins) {
        this.min_reserve_time_mins = min_reserve_time_mins;
    }

    public boolean isIs_reserved() {
        return is_reserved;
    }

    public void setIs_reserved(boolean is_reserved) {
        this.is_reserved = is_reserved;
    }

    public String getReserved_until() {
        return reserved_until;
    }

    public void setReserved_until(String reserved_until) {
        this.reserved_until = reserved_until;
    }
}
