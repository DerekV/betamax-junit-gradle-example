package com.example.weatherfetcher;

import com.example.weatherfetcher.openweathermap.OpenWeatherMap;

import org.junit.Rule;
import org.junit.Test;

import java.math.BigDecimal;

import co.freeside.betamax.Betamax;
import co.freeside.betamax.Recorder;
import co.freeside.betamax.TapeMode;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestOpenWeatherMapFetcher {


    @Rule public Recorder recorder = new Recorder();

    @Betamax(tape="open weather maps api tape",mode= TapeMode.READ_ONLY)
    @Test
    public void detroitLiveTest() {
        BigDecimal expected = new BigDecimal("285.847");

        BigDecimal actual = WeatherFetcher.fromSource(new OpenWeatherMap()).tempInCity("Detroit,mi");

        assertThat(actual,is(expected));
    }


}
