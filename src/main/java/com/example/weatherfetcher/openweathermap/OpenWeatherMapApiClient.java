package com.example.weatherfetcher.openweathermap;

import com.example.weatherfetcher.openweathermap.client.model.OwmWeatherResponse;

import retrofit.http.GET;
import retrofit.http.Query;

public interface OpenWeatherMapApiClient {

    @GET("/data/2.5/weather")
    public OwmWeatherResponse getWeather(@Query("q") String city);
}
