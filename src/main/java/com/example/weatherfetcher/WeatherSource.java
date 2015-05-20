package com.example.weatherfetcher;

import java.math.BigDecimal;

public interface WeatherSource {
    BigDecimal tempInCity(String cityName);
}
