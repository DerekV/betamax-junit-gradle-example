package com.example.weatherfetcher;

import com.example.weatherfetcher.openweathermap.OpenWeatherMap;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;

public class TestOpenWeatherMapFetcher {

    @Test
    public void londonLiveTest() {
        BigDecimal expected = new BigDecimal("284.451");

        BigDecimal actual = WeatherFetcher.fromSource(new OpenWeatherMap()).tempInCity("London,uk");

        assertThat(actual,is(expected));
    }


}
