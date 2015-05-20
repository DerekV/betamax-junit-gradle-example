package com.example.weatherfetcher;

import java.math.BigDecimal;

public class WeatherFetcher {

    private final WeatherSource source;

    private WeatherFetcher(WeatherSource source) {
        this.source = source;
    }

    public static WeatherFetcher fromSource(WeatherSource source) {
        return new WeatherFetcher(source);
    }


    public BigDecimal tempInCity(String cityName) {

        return source.tempInCity(cityName);
    }


}
