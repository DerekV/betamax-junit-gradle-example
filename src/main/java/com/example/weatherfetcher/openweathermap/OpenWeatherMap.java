package com.example.weatherfetcher.openweathermap;

import com.example.weatherfetcher.WeatherSource;

import java.math.BigDecimal;

import retrofit.RestAdapter;

public class OpenWeatherMap implements WeatherSource {



    @Override
    public BigDecimal tempInCity(String cityName) {
        RestAdapter adapter = new RestAdapter.Builder().setEndpoint("http://api.openweathermap.org").build();
        OpenWeatherMapApiClient client = adapter.create(OpenWeatherMapApiClient.class);
        return client.getWeather(cityName).main.temp;
    }
}
