package com.example.ricardo.googlemaps.view_model;

import com.example.ricardo.googlemaps.api.LocationAPI;
import com.example.ricardo.googlemaps.model.Location;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LocationViewModel {

    public void markLocations(final GoogleMap googleMap){

        LocationAPI locAPI = new Retrofit.Builder()
                .baseUrl(LocationAPI.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(LocationAPI.class);
        locAPI.getLocations().enqueue(new Callback<List<Location>>()
        {
            @Override
            public void onResponse(Call<List<Location>> call, Response<List<Location>> response)
            {
                List<Location> list = response.body();
                for(int i=0;i<list.size();i++) {
                    LatLng next = new LatLng(Double.parseDouble(list.get(i).getLat()), Double.parseDouble(list.get(i).getLng()));
                    googleMap.addMarker(new MarkerOptions().position(next).title(list.get(i).getName()));
                }
            }

            @Override
            public void onFailure(Call<List<Location>> call, Throwable t) {

            }
        });
    }
}
