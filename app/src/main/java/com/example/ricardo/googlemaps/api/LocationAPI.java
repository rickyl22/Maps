package com.example.ricardo.googlemaps.api;

import com.example.ricardo.googlemaps.model.Location;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface LocationAPI {

    String BASE_URL = "http://ridecellparking.herokuapp.com/api/v1/parkinglocations/";
    @GET("search?format=json&lat=51.5074&lng=0.1278")
    Call<List<Location>> getLocations();
}
